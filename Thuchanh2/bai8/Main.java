package Thuchanh2.bai8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<User> list=new ArrayList<>();
        while (n-->0) {
            String str[]=scanner.nextLine().split("\\s+");
            list.add(new User(str[0],str[1]));
        }
        n=Integer.valueOf(scanner.nextLine());
        while(n-->0){
            String str[]=scanner.nextLine().split("\\s+");
            for (User u : list) {
                if(str[0].equals(u.getTnd()) && str[1].equals(u.getMk())) u.setTC();
            }
        }
        for (User user : list) {
            System.out.print(user.getTC()+" ");
        }
    }
}
