package J05032;

public class Person implements Comparable<Person> {
    private String name,dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public long getAge(){
        String str[]=this.dob.split("/");
        return Long.valueOf(str[0])+ Long.valueOf(str[1])*30+Long.valueOf(str[2])*365;
    }


    public int compareTo(Person p){
        if(this.getAge()<p.getAge())
            return 1;
        else return -1;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
