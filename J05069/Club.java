package J05069;

public class Club {
    private String idClub,name;
    private long price,doanhThu; 

    public Club(String idClub, String name, int price){
        this.idClub=idClub;
        this.name=name;
        this.price=price;
    }

    public String getIDclub(){
        return this.idClub;
    }

    public String getName(){
        return this.name;
    }

    public long getDoanhthu(){
        return this.doanhThu;
    }

    public void setDoanhthu(long ticket){
        this.doanhThu=this.price*ticket;
    }

    @Override
    public String toString() {
        return name + " " + doanhThu;
    }   


    


}
