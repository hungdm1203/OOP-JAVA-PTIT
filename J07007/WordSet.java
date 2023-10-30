package J07007;

import java.io.*;
import java.util.*;

public class WordSet {

    private TreeSet<String> set;


    // public WordSet(TreeSet<String> str) {
    //     this.str = str;
    // }

    
    public WordSet(String s) throws IOException{
        Scanner scanner=new Scanner(new File(s));
        this.set=new TreeSet<>();
        while (scanner.hasNext()) {
            set.add(scanner.next().toLowerCase());
        }
    }


    @Override
    public String toString() {
        String s="";
        for (String string : set) {
            s=s+string+"\n";
        }
        return s;
    }



    
}


