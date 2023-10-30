package J07071;

public class Person implements Comparable<Person> {
    private String name,vt;

    public Person(String name) {
        this.name = name;
        this.vt="";
        this.setVT();
    }

    public void setVT(){
        String s[]=this.name.split("\\s+");
        for (String string : s) {
            this.vt+=string.charAt(0);
        }
    }    

    public String getVT(){
        return vt;
    }

    public void build(String s){
        String tmp[]=s.split("\\.");
        if(tmp.length==this.vt.length()){
            int check=1;
            for (int i=0;i<tmp.length;i++) {
                if(!tmp[i].equals("*")){
                    if(!tmp[i].equals(vt.substring(i,i+1))) check=0;
                }
            }
            if(check==1) System.out.println(this.name);
        }
    }

    public int compareTo(Person p){
        String a[]=this.name.split("\\s+"), b[]=p.name.split("\\s+");
        if(a[a.length-1].equals(b[b.length-1])) return a[0].compareTo(b[0]);
        return a[a.length-1].compareTo(b[b.length-1]);
    }

}
