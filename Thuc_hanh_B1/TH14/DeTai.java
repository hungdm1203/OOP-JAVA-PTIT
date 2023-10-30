package TH14;

public class DeTai {
    private String id,tenGV,tenDT;

    public DeTai(String id, String tenGV, String tenDT) {
        this.id = id;
        this.tenGV = tenGV;
        this.tenDT = tenDT;
    }

    @Override
    public String toString() {
        return tenDT+" "+tenGV;
    }

    

    
}
