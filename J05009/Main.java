package J05009;

import java.util.*;

/**
 * tim thu khoa cua ki thi
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<ThiSinh> dsTS=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            scanner.nextLine();
            ThiSinh ts=new ThiSinh(i,scanner.nextLine(),scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
            dsTS.add(ts);
        }

        Collections.sort(dsTS);
        double dmax=dsTS.get(0).getDiem();
        for (ThiSinh thiSinh : dsTS) {
            if(thiSinh.getDiem()!=dmax) break;
            System.out.println(thiSinh);
        }
        scanner.close();
    }
}