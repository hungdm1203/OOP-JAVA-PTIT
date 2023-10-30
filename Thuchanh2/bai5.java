package Thuchanh2;

import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("VANBAN.in"));
        ArrayList<String> ds=new ArrayList<>();
        while (scanner.hasNext()) {
            String s=scanner.next();
            if(check(s) && !ds.contains(s)){
                ds.add(s);
            }
        }
        Collections.sort(ds);
        for (String string : ds) {
            System.out.println(string);
        }
    }

    public static boolean check(String s){
        if(s.contains(".") || s.contains(",") || s.contains("!") || s.contains("?") || s.contains(":")) return false;
        for( int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) return true;
        }
        return false;
    }
}
