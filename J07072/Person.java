package J07072;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int compareTo(Person p){
        String a[]=this.name.split("\\s+"), b[]=p.name.split("\\s+");
        if(a[a.length-1].equals(b[b.length-1])) {
            if(a[0].equals(b[0])) return a[1].compareTo(b[1]);
            else return a[0].compareTo(b[0]);
        }
        return a[a.length-1].compareTo(b[b.length-1]);
    }

    @Override
    public String toString() {
        return name;
    }



}
