package Thuchanh2;

import java.io.File;
import java.io.IOException;
import java.math.*;
import java.util.*;

public class bai1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("C:\\WORKSPACE\\Java\\Thuchanh2\\DAYSO.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<BigInteger> ds=new ArrayList<>();
        BigInteger sum=new BigInteger("0");
        for(int i=0;i<n;i++){
            BigInteger tmp=new BigInteger(scanner.nextLine());
            ds.add(tmp);
            sum=sum.add(tmp);
        }
        System.out.println(Collections.min(ds)+"\n"+Collections.max(ds)+"\n"+sum);
    }
}
