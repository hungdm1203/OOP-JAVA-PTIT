package J07024;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> ts;

    public WordSet(TreeSet<String> t){
        this.ts=t;
    }

    public WordSet(String s) throws IOException {
        ts=new TreeSet<>();
        Scanner sc=new Scanner(new File(s));
        while (sc.hasNext()) {
            ts.add(sc.next().toLowerCase());
        }
    }

    public WordSet difference(WordSet w){
        TreeSet<String> res=new TreeSet<>();
        for (String s : this.ts) {
            if(!w.ts.contains(s)) res.add(s);
        }
        return new WordSet(res);
    }

    @Override
    public String toString() {
        String s="";
        for (String string : ts) {
            s=s+string+" ";
        }
        return s;
    }


}
