package J05054;

public class HocSinh {
    private String id,name,xl;
    private double score;
    public HocSinh(int id, String name, double score) {
        this.id = "HS"+String.format("%02d", id);
        this.name = name;
        this.score = score;

        if(score>=9)
            this.xl="Gioi";
        else if(score>=7)
            this.xl="Kha";
        else if(score>=5)
            this.xl="Trung Binh";
        else this.xl="Yeu";
    }


    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", score) + " "+ xl;
    }

    public double getScore() {
        return score;
    }    

    
    
}
