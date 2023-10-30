import java.io.*;
/**
 * so khac nhau trong file-2
 */
public class J07005 {
    public static void main(String[] args) throws IOException{
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN")) ;
        int a[]=new int[1000];
        for (int i = 0; i < 100000; i++) {
            a[in.readInt()]++;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0) System.out.println(i+" "+a[i]);
        }
        in.close();
    }
    
}