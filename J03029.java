import java.util.ArrayList;
import java.util.Scanner;

/**
 * chuan hoa cau
 */
public class J03029 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line;
        ArrayList<String> str=new ArrayList<>();
        while (scanner.hasNextLine()) {
            line=scanner.nextLine();
            if(line.isEmpty())
                break;
            str.add(line.toLowerCase());
        }
        for (String string : str) {
            build(string);
        }
        scanner.close();
    }


    public static void build(String string){
        String tmp[]=string.trim().split("\\.\\?\\!");

        for (String s : tmp) {
            String res[]=s.split("\\s+");
            res[0]=res[0].substring(0, 1).toUpperCase()+res[0].substring(1);
            if(res[res.length-1].equals(".")||res[res.length-1].equals("!")||res[res.length-1].equals("?")){
                res[res.length-2]=res[res.length-2]+res[res.length-1];
                res[res.length-1]="";
            }
            
            for (int i = 0; i < res.length; i++) {
                if(i!=res.length-1){
                    System.out.print(res[i]+" ");
                } else{
                    if(res[i].length()>0 && res[i].charAt(res[i].length()-1)!='.' && res[i].charAt(res[i].length()-1)!='!' && res[i].charAt(res[i].length()-1)!='?'){
                        System.out.println(res[i]+".");
                    } else System.out.println(res[i]);
                }
            }
        }
    }
}

