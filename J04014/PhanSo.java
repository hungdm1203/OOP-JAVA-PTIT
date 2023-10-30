package J04014;

import java.math.BigInteger;

public class PhanSo {
    private long tu,mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo TinhC(PhanSo p){
        long a=this.tu*p.mau+this.mau*p.tu;
        long b=this.mau*p.mau;
        a=a*a;b=b*b;
        return new PhanSo(a, b).rutgon();
    }

    public PhanSo TinhD(PhanSo p1, PhanSo p2){
        long a=this.tu*p1.tu*p2.tu;
        long b=this.mau*p1.mau*p2.mau;
        return new PhanSo(a, b).rutgon();
    }

    public PhanSo rutgon(){
        BigInteger n=new BigInteger(String.valueOf(this.tu));
        BigInteger m=new BigInteger(String.valueOf(this.mau));
        BigInteger gcd=n.gcd(m);
        return new PhanSo(n.divide(gcd).longValue(), m.divide(gcd).longValue());
    }
    @Override
    public String toString() {
        return tu + "/" + mau ;
    }

    
    
}
