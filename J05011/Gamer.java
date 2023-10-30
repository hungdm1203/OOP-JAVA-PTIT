package J05011;

public class Gamer implements Comparable<Gamer> {
    private String id,name;
    private int time;

    public Gamer(String id, String name, int time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%d gio %d phut", (int)time/60,time%60);
    }

    public int compareTo(Gamer gamer){
        if(this.time<gamer.time)
            return 1;
        else return -1;
    }

    
}
