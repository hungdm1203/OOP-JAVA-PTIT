package J07011;
import java.io.*;
import java.util.*;
/**
 * thong ke tu khac nhau trong file van ban
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("VANBAN.in"));
        int n=Integer.valueOf(scanner.nextLine());
        TreeMap<String,Integer> str=new TreeMap<>();
        while (scanner.hasNextLine()) {
            String tmp=scanner.nextLine().toLowerCase(), res="";
            for (int i=0;i<tmp.length();i++) {
                if(Character.isAlphabetic(tmp.charAt(i)) || Character.isDigit(tmp.charAt(i))){
                    res=res+tmp.charAt(i);
                } else if(!res.isEmpty()){
                    if(str.containsKey(res)) str.put(res, str.get(res)+1);
                    else str.put(res, 1);
                    res="";
                }
            }
            if(!res.isEmpty()){
                if(str.containsKey(res)) str.put(res, str.get(res)+1);
                else str.put(res, 1);
                res="";
            }
        }

        ArrayList<Build> ds=new ArrayList<>();
        for (String s : str.keySet()) {
            ds.add(new Build(s, str.get(s)));
        }
        Collections.sort(ds);
        for (Build build : ds) {
            System.out.println(build);
        }
    }

    
    
}
