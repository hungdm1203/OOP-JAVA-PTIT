package Thuchanh2.bai8;

public class User {
    private String tnd,mk;
    private int tc;

    public User(String tnd, String mk) {
        this.tnd = tnd;
        this.mk = mk;
        tc=0;
    }

    public String getTnd() {
        return tnd;
    }

    public String getMk() {
        return mk;
    }

    public int getTC(){
        return tc;
    }

    public void setTC(){
        this.tc+=1;
    }

}
