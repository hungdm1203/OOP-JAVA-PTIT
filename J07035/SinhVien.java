package J07035;

public class SinhVien {
    private String msv,name,lop,email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.setName(name);
        this.lop = lop;
        this.email = email;
    }

    public void setName(String s){
        String str[]=s.toUpperCase().trim().split("\\s+");
        String res="";
        for (String string : str) {
            res=res+string.charAt(0)+string.toLowerCase().substring(1)+" ";
        }
        this.name=res.trim();
    }

    public String getMsv() {
        return msv;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }
    
    
}
