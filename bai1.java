import java.util.Date;

public class bai1 {

    
   public static void main(String[] args) {

    /*creat Department*/
    Department department1 = new Department();
    department1.id=1;
    department1.name="Sale";

    Department department2=new Department();
    department2.id=2;
    department2.name="Marketting";

    /*creat Group*/
    Group group1=new Group();
    group1.id=1;
    group1.name="Java";
    
    Group group2=new Group();
    group2.id=2;
    group2.name="OOP";

    /*creat Account*/
    Account account1=new Account();
    account1.id=100;
    account1.email="hungfa1203@gmail.com";
    account1.department=department1;
    Group[] grAcc1={group1,group2};
    account1.groups=grAcc1;


    System.out.println("Phong ban 2 la "+department2.name);
    System.out.println();
    System.out.println(account1.department.name);
    System.out.println(account1.groups[1].name);
    System.out.println();
    }
}

class Department {
    int id;
    String name;
}

class Group {
    int id;
    String name;
}

class Account {
    int id;
    String email;
    Department department;
    Date date;
    Group[] groups;
}
