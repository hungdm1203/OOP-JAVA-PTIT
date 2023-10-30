package Thuchanh2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String,Integer> m=new LinkedHashMap<>();
        while (scanner.hasNext()) {
            String s=scanner.next();
            if(check(s)){
                if(!m.containsKey(s)) m.put(s,1); else m.put(s,m.get(s)+1);
            }
        }
        ArrayList<Map.Entry<String,Integer>> arr=new ArrayList<>(m.entrySet());
        arr.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<String,Integer> x:arr) {
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }

    public static boolean check(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<s.charAt(i-1)) return false;
        }
        return true;
    }
}
