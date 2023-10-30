import java.io.*;
import java.util.*;

/**
 * day con tang dan
 */
public class J07008 {
    public static int n, a[], b[];
    public static ArrayList<String> str=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DAYSO.in"));
        n=Integer.valueOf(scanner.next());
        a=new int[n+1]; b=new int[n+1];
        for(int i=1;i<=n;i++) {
            a[i]=Integer.valueOf(scanner.next());
        }
        Try(1);
        Collections.sort(str);
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void Try(int i){
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n)
                solve();
            else Try(i+1);
        }
    }

    public static void solve(){
        ArrayList<Integer> arr=new ArrayList<>();
        int check=1;
        String s="";
        for(int i=1;i<=n;i++){
            if(b[i]==1 && !arr.isEmpty() && a[i]<arr.get(arr.size()-1)){
                check=0;
                break;
            }
            if(b[i]==1) {
                arr.add(a[i]);
                s=s+a[i]+" ";
            }
        }
        if(check==1 && arr.size()>=2) str.add(s);
    }
    
}