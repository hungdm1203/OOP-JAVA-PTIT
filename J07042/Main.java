package test;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * liet ke cap so-2
 */
public class Main {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> listP=(ArrayList<Pair>) in.readObject();
        ArrayList<Pair> res=new ArrayList<>();
        HashSet<Pair> hs=new HashSet<>();
        for (Pair pair : listP) {
            if(!hs.contains(pair)){
                res.add(pair);
                hs.add(pair);
            }
        }
        Collections.sort(res);
        for (Pair pair : res) {
            if(pair.getFirst()<pair.getSecond() && check(pair.getFirst(), pair.getSecond())) System.out.println(pair);
        }
    }
    public static boolean check(int a,int b){
        BigInteger b1=new BigInteger(String.valueOf(a));
        BigInteger b2=new BigInteger(String.valueOf(b));
        if(b1.gcd(b2).equals(BigInteger.ONE)) return true;
        return false;
    }
}
