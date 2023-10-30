package J05050;

public class KhachHang implements Comparable<KhachHang> {
    private String id,loai;
    private int heso, cu, moi;
    private long tt, pt, tong;
    
    public KhachHang(int id, String loai, int cu, int moi) {
        this.id = "KH"+String.format("%02d", id);
        this.loai=loai;
        this.cu = cu;
        this.moi = moi;

        if(this.loai.equals("KD"))
            this.heso=3;
        else if(this.loai.equals("NN"))
            this.heso=5;
        else if(this.loai.equals("TT"))
            this.heso=4;
        else this.heso=2;

        this.tt=(moi-cu)*this.heso*550;

        if(moi-cu>100)
            this.pt=this.tt;
        else if(moi-cu>=50)
            this.pt=Math.round(this.tt*35/100.0);

        this.tong=this.pt+this.tt;
    }

    public int compareTo(KhachHang kh){
        if(this.tong<kh.tong)
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return id + " " + heso + " " + tt + " " + pt + " " + tong;
    }

    






    public int getCu() {
        return cu;
    }

    public int getMoi() {
        return moi;
    }
}
