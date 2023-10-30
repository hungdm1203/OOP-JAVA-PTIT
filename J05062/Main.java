package J05062;

import java.util.*;


/**
 * hoc bong sinh vien
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(), s=scanner.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        ArrayList<SinhVien> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            scanner.nextLine();
            String name=scanner.nextLine();
            double gpa=scanner.nextDouble();
            int rl=scanner.nextInt();
            ds.add(new SinhVien(name, gpa, rl));
            arr.add(new SinhVien(name, gpa, rl));
        }


        Collections.sort(arr);

        for (SinhVien sinhVien : ds) {
            if(sinhVien.getGPA()>=arr.get(s-1).getGPA() && !sinhVien.getHB().equals("x")) {
                System.out.println(sinhVien);
            }
            else System.out.println(sinhVien.getName()+": KHONG");
        }
        scanner.close();
    }
    
}
