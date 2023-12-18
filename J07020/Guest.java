package J07020;

public class Guest {
    private String id,name,gender,dob,add;

    public Guest(int id, String name, String gender, String dob, String add) {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
    }

    @Override
    public String toString() {
        return name + " " + add;
    }
    
}
