import java.util.*;
/**
 * tim tu thuan nghich dai nhat
 */
public class J08010 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line="";
        LinkedHashMap<String,Integer> ds=new LinkedHashMap<>();
        int max=0;
        while (scanner.hasNextLine()) {
            line=scanner.nextLine();
            if(line.isEmpty()) break;
            String str[]=line.trim().split("\\s+");
            for (String string : str) {
                if(check(string)>0){
                    if(ds.containsKey(string)) ds.put(string, ds.get(string)+1);
                    else ds.put(string, 1);
                    max=Math.max(max,check(string));
                }
            }

        }

        for(String s:ds.keySet()){
            if(s.length()==max) System.out.println(s+" "+ds.get(s));
        }
        scanner.close();
        
    }

    public static int check(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        if(s.equals(sb.toString())) return s.length();
        return -1;
    }
    
}
