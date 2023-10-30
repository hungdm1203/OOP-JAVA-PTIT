package J07012;

import java.io.*;
import java.util.*;
/*
 * thong ke tu khac nhau trong file nhi phan
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list=(ArrayList<String>)ip.readObject();

        HashMap<String,Integer> arr=new HashMap<>();
        ArrayList<Word> ds=new ArrayList<>();
        for (String s : list) {
            String res="";
            for(int i=0;i<s.length();i++){
                if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) res+=s.charAt(i);
                else res+=" ";
            }
            String tmp[]=res.trim().toLowerCase().split("\\s+");
            for (String ss : tmp) {
                if(!arr.containsKey(ss)) arr.put(ss, 1);
                else arr.put(ss, arr.get(ss)+1);
            }
        }

        for (String s : arr.keySet()) {
            ds.add(new Word(s, arr.get(s)));
        }

        Collections.sort(ds);
        for (Word word : ds) {
            System.out.println(word);
        }
    }
}
