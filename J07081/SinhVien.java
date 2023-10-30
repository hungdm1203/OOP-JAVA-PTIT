package J07081;

public class SinhVien implements Comparable<SinhVien> {
    private String id,name,phone,email;

    public SinhVien(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + email;
    }

    public int compareTo(SinhVien sv){
        String a[]=this.name.split("\\s+");
        String b[]=sv.name.split("\\s+");
        if(a[a.length-1].equals(b[b.length-1])){
            if(a[0].equals(b[0])){
                if(a[1].equals(b[1])) return this.id.compareTo(sv.id);
                else return a[1].compareTo(b[1]);
            } else return a[0].compareTo(b[0]);
        } else return a[a.length-1].compareTo(b[b.length-1]);
    }    
       
}
