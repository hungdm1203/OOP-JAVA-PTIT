package J05054;

public class HocSinh implements Comparable<HocSinh> {
    private String id,name,xl;
    private double score;
    private int rank;
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

    public void setRank(int n){
        this.rank=n;
    }

    public int getRank(){
        return rank;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", score) + " "+ xl+" "+rank;
    }

    public double getScore() {
        return score;
    }    

    public int compareTo(HocSinh h){
        if (this.score<h.score) return 1;
        return -1;
    }

    
    
}
