package test;

public class Student extends Person {
    private String code;
    
    public Student(String name,String add,String code){
        super(name, add);
        this.code=code;
    }

    public String getNgheNghiep(){
        return "hoc sinh";
    }

    @Override
    public String toString() {
        return "Student " + name + " " + add + " " + code;
    }

    
}
