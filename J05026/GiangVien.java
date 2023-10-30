package J05026;

public class GiangVien {
    private String id,name,sub;

    public GiangVien(int id, String name, String sub) {
        this.id = "GV"+String.format("%02d", id);
        this.name = name;
        this.sub = sub;
    }   


    public String getSub() {
        return sub;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

   
    
}
