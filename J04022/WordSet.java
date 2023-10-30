package J04022;

import java.util.Arrays;
import java.util.*;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String s){
        String str[]=s.toLowerCase().trim().split("\\s+");
        this.set = new TreeSet<>(Arrays.asList(str));
        // this.set.addAll(Arrays.asList(str));
    }

    public WordSet(TreeSet<String> set) {
        this.set = set;
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
        for (String string : this.set) {
            s=s+string+" ";
        }
        return s;
    }

    
    
}
