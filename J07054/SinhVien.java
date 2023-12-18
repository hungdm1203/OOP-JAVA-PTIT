package J07054;

public class SinhVien implements Comparable<SinhVien> {
    private String id,name;
    private double score;
    private int rank;
    public SinhVien(int id, String name, double a, double b, double c) {
        this.id = String.format("SV%02d", id);
        this.name = this.build(name);
        this.score = Math.round((a*3+b*3+c*2)*100/8)/100.0;
        this.rank = 1;
    }

    public String build(String s){
        String a[]=s.toUpperCase().split("\\s+"), res="";
        for (String string : a) {
            res=res+string.charAt(0)+string.toLowerCase().substring(1)+" ";
        }
        return res.trim();
    }

    public void setRank(int n){
        this.rank=n;
    }

    public int getRank(){
        return rank;
    }

    public int compareTo(SinhVien s){
        if(this.score==s.score) return this.id.compareTo(s.id);
        return -Double.valueOf(this.score).compareTo(Double.valueOf(s.score));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", score) + " " + rank;
    }

    public double getScore(){
        return score;
    }
    
    
}
