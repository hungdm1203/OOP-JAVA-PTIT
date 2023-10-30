package J06005;

public class Guest {
    private String guestID,guestName,gender,dob,add;

    public Guest(int id, String name, String gender, String dob, String add) {
        this.guestID = "KH"+String.format("%03d",id);
        this.guestName = name;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
    }

    @Override
    public String toString() {
        return guestName + " " + add;
    }

    
}
