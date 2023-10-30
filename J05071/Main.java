package J05071;

import java.util.*;

/**
 * tinh cuoc dien thoai co dinh-1
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<ThanhPho> dsTP=new ArrayList<>();
        ArrayList<ThueBao> dsTB=new ArrayList<>();
        ArrayList<String> dsID=new ArrayList<>();
        
        while (t-->0) {
            scanner.nextLine();
            String id=scanner.nextLine();
            dsTP.add(new ThanhPho(id, scanner.nextLine(), scanner.nextInt()));
            dsID.add(id);
        }
        dsTP.add(new ThanhPho("", "Noi mang", 800));

        t=scanner.nextInt();scanner.nextLine();
        while (t-->0) {
            String arr[]=scanner.nextLine().split("\\s+");
            if(arr[0].charAt(0)=='0'){
                int x=dsID.indexOf(arr[0].substring(1,3));
                dsTB.add(new ThueBao(arr[0],arr[1],arr[2],dsTP.get(x)));
            } else dsTB.add(new ThueBao(arr[0], arr[1], arr[2], dsTP.get(dsTP.size()-1)));
        }

        Collections.sort(dsTB);
        for (ThueBao tb : dsTB) {
            System.out.println(tb);
        }
        scanner.close();
    }
}
