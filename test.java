JKT013 
JKT014
JKT015
J08023
J08026
  

// // /**
// //  * test
// //  */

// // // import java.io.*;
// import java.util.*;


// import java.io.*;
// // public class test {

// //     public static void main(String[] args) {
// //         // System.out.println("Hello PTIT.");
// //         // if("b".equals("a")==true){
// //         //     System.out.println(1);
// //         // } else System.out.println(0);
// //         // ArrayList<ArrayList> a=new ArrayList<>();
// //         // Scanner scanner=new Scanner(System.in);
// //         // int n=scanner.nextInt();
// //         // for (int i = 0; i < n; i++) {
// //         //     ArrayList<Integer> b=new ArrayList<>();
// //         //     int d=scanner.nextInt();
// //         //     for (int j = 0; j < d; j++) {
// //         //         b.add(scanner.nextInt());
// //         //     }
// //         //     a.add(b);
// //         // }
// //         // System.out.println(a);
// //         // System.out.println(a.get(1).get(3));
// //         // scanner.close();


// //         // Scanner scanner=new Scanner(System.in);
// //         // String A=scanner.next();
// //         // StringBuilder s=new StringBuilder(A);
// //         // s=s.reverse();
// //         // String ss=s.toString();
// //         // System.out.println(ss);
// //         // if (ss.equals(A)) {
// //         //     System.out.println("Yes");
// //         // } else System.out.println("No");
// //         // scanner.close();


// //         // String s[]=scanner.nextLine().split("\\.");
// //         // System.out.println(s.length);
// //         // for (String i : s) {
// //         //     System.out.println(i.toUpperCase());
// //         // }
// //         // scanner.close();
// //         // Scanner sc=new Scanner(System.in);
// //         // int t=sc.nextInt();
// //         // sc.nextLine();
// //         // while(t-->0){
// //         //     String s[]=sc.nextLine().split("\\s+");
// //         //     ArrayList<String> str=new ArrayList<String>();
// //         //     for(String i:s){
// //         //         if(!i.toLowerCase()){
// //         //             str.add(i.toLowerCase());
// //         //             System.out.print(i.toLowerCase()+" ");
// //         //         }
// //         //     }  
// //         //     System.out.println(); 
// //         // Scanner scanner=new Scanner(System.in);
// //         // int t=scanner.nextInt();
// //         // scanner.nextLine();
// //         // while (t-->0) {
// //         //     String s=scanner.next();
// //         //     int check=1;
// //         //     for (int i = 0; i < s.length(); i++) {
// //         //         if(Character.isDigit(s.charAt(0)) || (Character.isLetterOrDigit(s.charAt(i)) || Character.compare(s.charAt(i), '_')!=0) ){
// //         //             System.out.println(0);
// //         //             break;
// //         //         }
                
// //         //     }
// //         // }
// //         Scanner scanner = new Scanner(System.in);

// //         System.out.println("Nhập đoạn văn bản (nhấn Enter để kết thúc):");

// //         // Sử dụng phương thức nextLine() để đọc toàn bộ đoạn văn bản từ bàn phím
// //         // Khi người dùng nhấn Enter, văn bản sẽ được đọc và lưu vào biến inputText
// //         String inputText = scanner.nextLine();

// //         System.out.println("Đoạn văn bản đã nhập:");
// //         System.out.println(inputText);

// //         // Đóng đối tượng Scanner sau khi sử dụng xong
// //         scanner.close();
// //     }
// // }





// // // ***---lop triagle 1*****
// // // import java.util.*;

// // // public class test {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         int t = sc.nextInt();
// // //         while (t-- > 0) {
// // //             Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
// // //             if (!a.valid()) {
// // //                 System.out.println("INVALID");
// // //             } else {
// // //                 System.out.println(a.getPerimeter());
// // //             }
// // //         }
// // //     }
// // // }

// // // class Point {
// // //     double x, y;

// // //     public Point(double x, double y) {
// // //         this.x = x;
// // //         this.y = y;
// // //     }

// // //     public double getX() {
// // //         return this.x;
// // //     }

// // //     public double getY() {
// // //         return this.y;
// // //     }

// // //     public static Point nextPoint(Scanner sc) {
// // //         return new Point(sc.nextDouble(), sc.nextDouble());
// // //     }
// // // }

// // // class Triangle {
// // //     Point a, b, c;

// // //     public Triangle(Point a, Point b, Point c) {
// // //         this.a = a;
// // //         this.b = b;
// // //         this.c = c;
// // //     }

// // //     public boolean valid() {
// // //         double ab = Math
// // //                 .sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
// // //         double bc = Math
// // //                 .sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
// // //         double ca = Math
// // //                 .sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
// // //         return (ab + bc > ca && bc + ca > ab && ca + ab > bc);
// // //     }

// // //     public String getPerimeter() {
// // //         double ab = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) +
// // //                 (b.getY() - a.getY()) * (b.getY() - a.getY()));
// // //         double bc = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) +
// // //                 (c.getY() - b.getY()) * (c.getY() - b.getY()));
// // //         double ca = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) +
// // //                 (a.getY() - c.getY()) * (a.getY() - c.getY()));
// // //         return String.format("%.3f", ab + bc + ca);
// // //     }
// // // }

// // // import java.util.Set;
// // // import java.util.TreeSet;

// // // public class test {
// // //     public static void main(String[] args) {
// // //         Set<Integer> set = new TreeSet<>();

// // //         set.add(5);
// // //         set.add(2);
// // //         set.add(8);
// // //         set.add(2); // Thêm lại số 2, nhưng không có hiệu lực vì Set không chứa phần tử trùng lặp
// // //         set.add(4);
// // //         System.out.println(set); // Kết quả: [2, 5, 8]
// // //     }
// // // }

// // import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         // String[] s = {"apple", "banana", "orange"};

//         // Set<String> set = new HashSet<>();
//         // set.addAll(Arrays.asList(s));

//         // System.out.println(set); // Kết quả: [apple, banana, orange]
        
//         // System.out.println(s[0].compareTo(s[1]));


//         // Scanner scanner=new Scanner(System.in);
//         // int t=scanner.nextInt();
//         // scanner.nextLine();
//         // while (t-->0) {
//         //     String s=scanner.nextLine();
//         //     int check=1;
//         //     if(s.charAt(0)<'a' && s.charAt(0)>'z' && s.charAt(0)<'A' &&s.charAt(0)>'Z' || s.length()<8)
//         //         check=0;
//         //     System.out.println(check);
//         //     if(check!=0){
//         //         for (int i = 0; i < s.length(); i++) {
//         //             if(!(s.charAt(i)>='a' && s.charAt(i)<='z') || !(s.charAt(i)>='A' &&s.charAt(i)<='Z') || !(s.charAt(i)>='0' && s.charAt(i)<='9') || s.charAt(i)!='_'){
//         //                 check=0;
//         //                 break;
//         //             }
//         //         }
//         //     }
//         //     if(check==1)
//         //         System.out.println("VALID");
//         //     else System.out.println("INVALID");
//         // }
//         // scanner.close();
//         // double x=7.649999999999999;
//         // System.out.println(Math.round(x*10));
//         // String name="do manh hung";
//         // String s[]=name.toLowerCase().trim().split("\\s+"),tmp="";
//         // for (String string : s) {
//         //     string=string.substring(0, 1).toUpperCase()+string.substring(1);
//         //     tmp=tmp+string;
//         //     System.out.println(string);
//         // }
//         // System.out.println(tmp);

//         Scanner sc = new Scanner(System.in);
//         int t = Integer.parseInt(sc.nextLine());
//         while(t-->0){
//             String s=sc.nextLine();
//             String ss=sc.nextLine();
//             TreeMap<Integer,Integer> arr=new TreeMap<>();
//             String str[]=s.trim().split("\\s+");
//             for (String string : str) {
//                 if(!string.equals("+") && !string.equals("-")){
//                     String tmp[]=string.split("\\*x\\^");
//                     for (String string2 : tmp) {
//                         System.out.println(string2);
//                     }
//                     // arr.put(Integer.valueOf(tmp[1]), Integer.valueOf(tmp[0]));
//                 }
//             }
//             // for(Integer i: arr.keySet()){
//             //     System.out.println(i+" "+arr.get(i));
//             // }
//         }
//         sc.close();
//     }
// }

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;
// /**
//  *
//  * @author Houta
//  */
// public class test {
//     static int stt = 1;
//     private static class HocSinh implements Comparable<HocSinh>{
//         private String id,name,type;
//         private double diemTB;
        
//         HocSinh(Scanner sc){
//             this.id = getId(stt++);
//             this.name = sc.nextLine();
//             this.diemTB = sc.nextDouble();
//             if(this.diemTB<5) this.type = "Yeu";
//             else if(this.diemTB<7) this.type = "Trung Binh";
//             else if(this.diemTB<9) this.type = "Kha";
//             else this.type = "Gioi";
//         }
//         static String getId(int n){
//             String s = String.valueOf(n);
//             if(s.length()==1) s = '0'+s;
//             return "HS"+s;
//         }

//         @Override
//         public int compareTo(HocSinh o) {
//             if(this.diemTB<o.diemTB) return 1;
//             return -1;
//         }
        
//     }
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         ArrayList<HocSinh> ds = new ArrayList<>();
//         while(t-->0){
//             sc.nextLine();
//             ds.add(new HocSinh(sc));
//         }
//         ArrayList<HocSinh> tmp = (ArrayList<HocSinh>) ds.clone();
//         Collections.sort(tmp);
//         Map map = new HashMap();
//         map.put(tmp.get(0).id, 1);
//         for(int i = 1;i<tmp.size();i++){
//             if(tmp.get(i).diemTB==tmp.get(i-1).diemTB)
//                 map.put(tmp.get(i).id, map.get(tmp.get(i-1).id));
//             else
//                 map.put(tmp.get(i).id, i+1);
//         }
//         for(HocSinh i: ds) 
//             System.out.printf("%s %s %.1f %s %d\n",i.id,i.name,i.diemTB,i.type,map.get(i.id));
//     }
// }



/**
 * test
 */
public class test {

    public static void main(String[] args) {
        // String s="123456798";
        // while (s.length()>=2) {
        //     int sum=0;
        //     for(int i=0;i<s.length();i++){
        //         sum+=(s.charAt(i)-'0');
        //     }
        //     s=String.valueOf(sum);
        //     System.out.println(s);
        // }
        int a[]={1,2,3,4};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
