package J05060;

public class PhuHo implements Comparable<PhuHo> {
    private String id,name,dob,xl;
    private int age,dtb;
    private double a,b;
    
    public PhuHo(int id, String name, String dob, double a, double b) {
        this.id = "PH"+String.format("%02d",id);
        this.name = name;
        this.dob = dob;
        this.a = a;
        this.b=b;

        this.age=2021-Integer.valueOf(dob.substring(6));

        if(a>=8 && b>=8)
            this.dtb=(int)Math.round((a+b)/2+1.0);
        else if(a>=7.5 && b>=7.5)
            this.dtb=(int)Math.round((a+b)/2+0.5);
        else this.dtb=(int)Math.round((a+b)/2.0);

        if(this.dtb>10) this.dtb=10;

        if(this.dtb>=9)
            this.xl="Xuat sac";
        else if(this.dtb==8)
            this.xl="Gioi";
        else if(this.dtb==7)
            this.xl="Kha";
        else if(this.dtb>=5)
            this.xl="Trung binh";
        else this.xl="Truot";
    }


    public int compareTo(PhuHo ph){
        if(this.dtb<ph.dtb)
            return 1;
        else if(this.dtb>ph.dtb)
            return -1;
        else return this.id.compareTo(ph.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + dtb + " " + xl;
    }

    
    
}
