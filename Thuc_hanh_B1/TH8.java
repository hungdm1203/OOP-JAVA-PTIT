
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * TH8
 */
public class TH8 {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DANHSACH.in"));
        ArrayList<String> ds=new ArrayList<>();
        HashMap<String,Integer> arr=new HashMap<>();
        while (scanner.hasNextLine()) {
            String s[]=scanner.nextLine().trim().toLowerCase().split("\\s+"), res="";
            for (String string : s) {
                res=res+string+" ";
            }
            if(!ds.contains(res)) ds.add(res);
        }
        for (String s : ds) {
            String tmp[]=s.trim().split("\\s+");
            String res=tmp[tmp.length-1];
            for(int i=0;i<tmp.length-1;i++){
                res=res+tmp[i].charAt(0);
            }
            if(arr.containsKey(res)){
                arr.put(res, arr.get(res)+1);
                System.out.println(res+arr.get(res)+"@ptit.edu.vn");
            } else {
                System.out.println(res+"@ptit.edu.vn");
                arr.put(res, 1);
            }
        }
    }
}