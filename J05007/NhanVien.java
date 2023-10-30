package J05007;

public class NhanVien implements Comparable<NhanVien> {
    private String id, name,gender,dob,address,mst,date;

    public NhanVien(int id, String name, String gender, String dob, String address, String mst, String date) {
        this.id = String.format("%05d", id);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.mst = mst;
        this.date = date;
    }


    public int compareTo(NhanVien nv){
        String s1[]=this.dob.split("/");
        long n1=Long.valueOf(s1[0])+Long.valueOf(s1[1])*30+Long.valueOf(s1[2])*365;
        String s2[]=nv.dob.split("/");
        long n2=Long.valueOf(s2[0])+Long.valueOf(s2[1])*30+Long.valueOf(s2[2])*365;
        if(n1<n2)
            return -1;
        else return 1;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address+ " " + mst + " " + date;
    }


    
}
