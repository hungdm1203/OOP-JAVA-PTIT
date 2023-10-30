import java.util.Scanner;

/**
 * day uu the
 */
public class J02037 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String str[]=scanner.nextLine().split("\\s+");
            build(str);
        }
        scanner.close();
    }

    public static void build(String str[]){
        int dem=0;
        for (String i : str) {
            if(Integer.parseInt(i)%2==0){
                dem++;
            }
        }
        if((dem>str.length-dem && str.length%2==0) || (dem<str.length-dem && str.length%2!=0)){
            System.out.println("YES");
        } else System.out.println("NO");
    }
}