import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * J07021
 */
public class J07021 {

    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(new File("DATA.in"));
        ArrayList<String> arr=new ArrayList<>();
        while(scanner.hasNextLine()){
            String str=scanner.nextLine();
            if(str.equals("END")) break;
            arr.add(str.toLowerCase().trim());
        }
        for (String s : arr) {
            String str[]=s.split("\\s+"),res="";
            
            for (String ss : str) {
                res=res+ss.substring(0, 1).toUpperCase()+ss.substring(1)+" ";
            }
            System.out.println(res);
        }
    }
}