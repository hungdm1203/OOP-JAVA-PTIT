package J05014;

public class Teacher implements Comparable<Teacher> {
    private String id,name,ma,mon,note;
    private double d1,d2,sum;

    public Teacher(int id,String name, String ma, double d1, double d2) {
        this.id="GV"+String.format("%02d", id);
        this.name = name;
        this.ma = ma;
        this.d1 = d1;
        this.d2 = d2;
        this.mon=this.setMon();
        this.sum=this.setSum();
        this.note=this.setNote();
    }

    private String setMon(){
        if(this.ma.charAt(0)=='A') return "TOAN";
        if(this.ma.charAt(0)=='B')return "LY";
        return "HOA";
    }

    private double setSum(){
        if(this.ma.charAt(1)=='1') return this.d1*2+this.d2+2;
        if(this.ma.charAt(1)=='2') return this.d1*2+this.d2+1.5;
        if(this.ma.charAt(1)=='3') return this.d1*2+this.d2+1;
        return this.d1*2+this.d2;
    }

    private String setNote(){
        if(this.sum>=18) return "TRUNG TUYEN";
        return "LOAI";
    }

    public int compareTo(Teacher t){
        if(this.sum<t.sum) return 1;
        if(this.sum>t.sum) return -1;
        return this.id.compareTo(t.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + mon + " " + String.format("%.1f", sum) + " " + note;
    }    

    
}
