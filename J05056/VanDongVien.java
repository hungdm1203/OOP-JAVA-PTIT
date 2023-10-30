package J05056;

public class VanDongVien implements Comparable<VanDongVien> {
    private String id,name,start,end;
    private int age,time,thanhTich,uuTien;


    public VanDongVien(int id, String name, String start, String end, int age, int time) {
        this.id = "VDV"+String.format("%02d",id);
        this.name = name;
        this.start = start;
        this.end = end;
        this.age = age;
        this.time = time;
        if(age>=32){
            this.thanhTich=time-3;
            this.uuTien=3;
        }else if(age>=25){
            this.thanhTich=time-2;
            this.uuTien=2;
        }else if(age>=18){
            this.thanhTich=time-1;
            this.uuTien=1;
        }else {
            this.thanhTich=time;
            this.uuTien=0;
        }
    }


    public String getString(int l){
        int x=(int)l/3600;
        int y=(int)(l-x*3600)/60;
        int z=(int)(l-x*3600-y*60);
        return String.format("%02d:%02d:%02d", x,y,z);
    }


    public int getThanhTich() {
        return thanhTich;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + this.getString(time) + " " + this.getString(uuTien) + " "+ this.getString(thanhTich);
    }


    public int compareTo(VanDongVien v){
        return Integer.valueOf(this.thanhTich).compareTo(Integer.valueOf(v.thanhTich));
    }







    public String getStart() {
        return start;
    }


    public String getEnd() {
        return end;
    }


    public int getAge() {
        return age;
    }    
}
