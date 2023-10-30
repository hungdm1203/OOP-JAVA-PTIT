import java.util.*;
/**
 * liet ke va dem
 */
public class J08011 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line="";
        LinkedHashMap<String,Integer> ds=new LinkedHashMap<>();
        ArrayList<String> list=new ArrayList<>();
        int max=0;
        while (scanner.hasNextLine()) {
            line=scanner.nextLine();
            if(line.isEmpty()) break;
            String str[]=line.trim().split("\\s+");
            for (String s : str) {
                if(check(s)){
                    if(ds.containsKey(s)) {
                        ds.put(s, ds.get(s)+1);
                        max=Math.max(max, ds.get(s));
                    }
                    else {
                        ds.put(s, 1);
                        list.add(s);
                    }
                }
            }

        }

        int tmp=0;
        while (!list.isEmpty()) {
            for (int i=0;i<list.size();i++) {
                if(ds.get(list.get(i))==max) {
                    System.out.println(list.get(i)+" "+max);
                    list.remove(i);
                    i--;
                }
                else tmp=Math.max(tmp,ds.get(list.get(i)));
            }
            max=tmp;
            tmp=0;
        }
        scanner.close();
        
    }

    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)) return false;
        }
        return true;
    }
    
}
