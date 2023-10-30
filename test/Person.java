package test;

public abstract class Person {
    protected String name,add;

    public Person(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public abstract String getNgheNghiep();

    @Override
    public String toString() {
        return "Person " + name + " " + add;
    }

    
}
