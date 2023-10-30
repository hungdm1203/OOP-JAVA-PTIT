import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * tim tu thuan nghich dai nhat
 */
public class J03020 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        //xu ly xuong dong
        String line;
        while (scanner.hasNextLine()) {
            line=scanner.nextLine();
            if (line.isEmpty()) {
                break;
            } else {
                sb.append(line).append("\n");
            }
        }
        

        String strIp[]=sb.toString().split("\\s+");
        build(strIp);
        scanner.close();
    }


    public static void build(String strIp[]){
        LinkedHashMap<String, Integer> strMap = new LinkedHashMap<>();
        int strLen=0;

        for (String s : strIp) {
            if(!strMap.containsKey(s) && check(s) && s.length()>=strLen){
                strMap.put(s, 1);
                strLen=s.length();
            } else if(strMap.containsKey(s)){
                strMap.put(s, strMap.get(s)+1);
            }
        }

        for (String s : strMap.keySet()) {
            if(s.length()==strLen){
                System.out.println(s+" "+strMap.get(s));
            }
        }
    }

    public static boolean check(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }
}
