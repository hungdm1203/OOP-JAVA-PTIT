package J06006;

public class Guest {
    private String id,name,gender,dob,add;

    public Guest(int id, String name, String gender, String dob, String add) {
        this.id = "KH" + String.format("%03d",id);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }
    
}
