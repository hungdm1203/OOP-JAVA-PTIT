import java.io.*;
/**
 * so khac nhau trong file-2
 */
public class J07005 {
    public static void main(String[] args) throws IOException{
        DataInputStream ip=new DataInputStream(new FileInputStream("DATA.IN"));
        int a[]=new int[1001];
        for(int i=0;i<100000;i++){
            a[ip.readInt()]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (a[i]>0) {
                System.out.println(i+" "+a[i]);
            }
        }
    }
    
}