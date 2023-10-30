package J05005;

public class SinhVien implements Comparable<SinhVien> {
    private String msv,name,lop,dob;
    private double gpa;

    public SinhVien(int id, String name, String lop, String dob, double gpa) {
        this.msv = "B20DCCN"+String.format("%03d", id);

        String s[]=name.toLowerCase().trim().split("\\s+"),tmp="";
        for (String string : s) {
            string=string.substring(0, 1).toUpperCase()+string.substring(1);
            tmp=tmp+string+" ";
        }

        this.name = tmp;
        this.lop = lop;
        if(dob.charAt(2)!='/')
            dob="0"+dob;
        if(dob.charAt(5)!='/')
            dob=dob.substring(0, 3)+"0"+dob.substring(3);
        this.dob = dob;
        this.gpa = gpa;
    }

    public int compareTo(SinhVien sv){
        if(this.gpa<sv.gpa)
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }


}
