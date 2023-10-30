package J05079;

import java.util.*;
/*
 * lop hoc phan 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        ArrayList<HocPhan> ds=new ArrayList<>();
        while(t-->0){
            ds.add(new HocPhan(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(ds);
        t=scanner.nextInt();scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            int check=0;
            for (HocPhan hocPhan : ds) {
                if(hocPhan.getId().equals(s)){
                    if(check==0){
                        System.out.println("Danh sach nhom lop mon "+hocPhan.getName()+":");
                        check=1;
                    }
                    System.out.println(hocPhan);
                }
            }
        }
        scanner.close();
    }
}

