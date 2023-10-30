public class bai2 { 
    public static void main(String[] args) {
        Student stu=new Student(12,"Do Manh Hung","0866589460");
        
        System.out.println(stu.sdt);
        stu.sdt="123456789";

        System.out.println(stu.name);
        System.out.println(stu.sdt);

    }
}
class Student{
    int id;
    String name,sdt;
    
    Student(int id,String name,String sdt){
        this.id=id;
        this.name=name;
        this.sdt=sdt;
    }
}
