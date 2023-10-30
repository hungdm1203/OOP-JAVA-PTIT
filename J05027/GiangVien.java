package J05027;

public class GiangVien {
    private String id,name,mon;

    public GiangVien(int id, String name, String mon) {
        this.id = "GV"+String.format("%02d",id);
        this.name = name;
        this.mon = mon;
    }

    public String getName() {
        return name.toLowerCase();
    }

    public String getMaMon(){
        String res="",arr[]=this.mon.split("\\s+");
        for (String string : arr) {
            res=res+string.charAt(0);
        }
        return res;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + this.getMaMon();
    }

    
    

    

}
