package J07014;

import java.io.*;
import java.util.*;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(TreeSet<String> set) {
        this.set = set;
    }

    public WordSet(String s) throws IOException {
        Scanner scanner=new Scanner(new File(s));
        this.set = new TreeSet<>();
        while(scanner.hasNext()){
            this.set.add(scanner.next().toLowerCase());
        }
    }

    public WordSet union(WordSet s1){
        TreeSet<String> mySet=new TreeSet<>(this.set);
        mySet.addAll(s1.set);
        return new WordSet(mySet);
    }

    public WordSet intersection(WordSet s1){
        TreeSet<String> treeSet=new TreeSet<>(this.set), mySet=new TreeSet<>();
        
        for (String string : s1.set) {
            if(treeSet.contains(string)){
                mySet.add(string);
            }
        }
        return new WordSet(mySet);
    }

    @Override
    public String toString() {
        String s="";
        for (String string : set) {
            s=s+string+" ";
        }
        return s;
    }

    

    
}
