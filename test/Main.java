package test;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\WORKSPACE\\Java\\test\\SV.IN"));
        // SinhVien a=new SinhVien(100,"xxx","D21",10,10,2000);
        // out.writeObject(a);
        // out.close();
        // ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\WORKSPACE\\Java\\test\\SV.IN"));
        // SinhVien b=(SinhVien)in.readObject();
        // System.out.println(b);
        // in.close();

        Person a=new Student("dmh", "hd","1203");
        System.out.println(a);
    }
}
