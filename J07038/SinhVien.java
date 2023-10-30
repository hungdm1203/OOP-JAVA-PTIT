package J07038;

public class SinhVien {
    private String msv,name,lop,email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = this.setName(name);
        this.lop = lop;
        this.email = email;
    }

    public String setName(String s){
        String res="", str[]=s.toUpperCase().trim().split("\\s+");
        for (int i = 0; i < str.length; i++) {
            if(i!=str.length-1) res=res+str[i].charAt(0)+str[i].substring(1).toLowerCase()+" ";
            else res=res+str[i].charAt(0)+str[i].toLowerCase().substring(1);
        }
        return res;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop;
    }

    
    
}
