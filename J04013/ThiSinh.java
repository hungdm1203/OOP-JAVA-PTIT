package J04013;

public class ThiSinh {
    private String id,name;
    private double d1,d2,d3,diem;

    
    public ThiSinh(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.diem=d1*2+d2+d3;
    }

    


    public String getDiemUuTien() {
        if(this.id.substring(0, 3).equals("KV1"))
            return "0.5";
        else if(this.id.substring(0, 3).equals("KV2"))
            return "1";
        else return "2.5";
    }

    public String getDiem(){
        int tong=(int)(this.diem*10);
        if(tong%10==0)
            return String.format("%.0f", this.diem);
        else return String.format("%.1f", this.diem);
    }


    public String trangThai(){
        if(this.d1*2+this.d2+this.d3+Double.valueOf(this.getDiemUuTien())>=24)
            return "TRUNG TUYEN";
        else return "TRUOT";
    }




    @Override
    public String toString() {
        return id + " " + name +" "+ this.getDiemUuTien()+" "+this.getDiem()+" "+this.trangThai();
    }

    
    
}
