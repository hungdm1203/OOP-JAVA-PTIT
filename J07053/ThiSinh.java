package J07053;

public class ThiSinh {
    private String id,name,dob,xepLoai;
    private int dtb,age;
    private double a,b;
    public ThiSinh(int id, String name, String dob, String a, String b) {
        this.id = "PH"+String.format("%02d",id);
        this.name = this.setName(name);
        this.dob = dob;
        this.a = Double.valueOf(a);
        this.b = Double.valueOf(b);
        this.age=this.setAge(this.dob);
        this.dtb=this.setDtb(this.a,this.b);
        this.xepLoai=this.setXeploai(this.dtb);
    }


    public String setName(String name){
        String str[]=name.toLowerCase().split("\\s+");
        name="";
        for(int i=0;i<str.length;i++){
            if(i!=str.length-1) name=name+str[i].substring(0,1).toUpperCase()+str[i].substring(1)+" ";
            else name=name+str[i].substring(0,1).toUpperCase()+str[i].substring(1);
        }
        return name;
    }


    public int setAge(String s){
        return 2021-Integer.valueOf(s.substring(s.length()-4));
    }

    public String setXeploai(int n){
        if(n>=9) return "Xuat sac";
        if(n==8) return "Gioi";
        if(n==7) return "Kha";
        if(n>=5) return "Trung binh";
        return "Truot";
    }


    public int setDtb(double a, double b){
        double d=0;
        if(a>=8 && b>=8) d=1;
        else if(a>=7.5 && b>=7.5) d=0.5;
        int n=(int)Math.round((a+b)/2+d);
        if(n>=10) return 10;
        return n;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + dtb + " " + xepLoai;
    }

    


    
}
