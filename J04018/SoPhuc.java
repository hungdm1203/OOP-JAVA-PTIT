package J04018;

public class SoPhuc {
    private int x,y;

    public SoPhuc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SoPhuc add(SoPhuc sp){
        int a=this.x+sp.x, b=this.y+sp.y;
        return new SoPhuc(a, b);
    }

    public SoPhuc mul(SoPhuc sp){
        int a=this.x*sp.x-this.y*sp.y, b=this.x*sp.y+this.y*sp.x;
        return new SoPhuc(a, b);
    }

    @Override
    public String toString() {
        String s=this.x+" ";
        if(this.y<0){
            s=s+"- "+Math.abs(this.y)+"i";
        } else s=s+"+ "+this.y+"i";
        return s;
    }

    

}
