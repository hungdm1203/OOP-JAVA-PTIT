
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TH6
 */
public class TH6 {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DATA.in"));
        ArrayList<String> arr=new ArrayList<>();
        while (scanner.hasNext()) {
            String s=scanner.next();
            int check=1;
            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))){
                    check=0;break;
                }
            }
            if(check==1) arr.add(s);
        }
        
        long sum=0;
        for (String s : arr) {
            try {
                if((Long.valueOf(s)>Integer.MAX_VALUE && Long.valueOf(s)<=Long.MAX_VALUE) || (Long.valueOf(s)<Integer.MIN_VALUE && Long.valueOf(s)>=Long.MIN_VALUE)){
                    sum+=Long.valueOf(s);
                }
            } catch(NumberFormatException e){}
        }
        System.out.println(sum);
    }
}