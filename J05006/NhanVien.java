package J05006;

public class NhanVien {
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

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address+ " " + mst + " " + date;
    }


    
}
