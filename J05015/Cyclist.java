package J05015;

public class Cyclist implements Comparable<Cyclist> {
    private String id,name,team,end;
    private int speed;

    public Cyclist(String name, String team, String end) {
        this.name = name;
        this.team = team;
        this.end = end;
        this.id=this.setID();
        this.speed=this.setSpeed();
    }

    private String setID(){
        String res="", s1[]=this.name.split("\\s+"), s2[]=this.team.split("\\s+");
        for (String string : s2) {
            res+=string.charAt(0);
        }

        for (String string : s1) {
            res+=string.charAt(0);
        }
        return res;
    }

    private int setSpeed(){
        String s[]=this.end.split(":");
        return (int)Math.round(120*60.0/((Integer.valueOf(s[0])-6)*60+Integer.valueOf(s[1])));
    }
    
    public int compareTo(Cyclist c){
        return this.end.compareTo(c.end);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + team + " " + speed + " Km/h";
    }

    
    
}