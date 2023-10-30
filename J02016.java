import java.util.*;

/**
 * bo ba so pytago
 */
public class J02016 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            ArrayList<Long> a=new ArrayList<>();
            for (int i=0;i<n;i++) {
                long x=scanner.nextLong();
                a.add(x*x);
            }
            int check=0;
            Collections.sort(a);
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(Collections.binarySearch(a,a.get(i)+a.get(j))>0){
                        check=1;break;
                    }
                }
                if(check==1) break;
            }
            if(check==0) System.out.println("NO");
            else System.out.println("YES");
        }
        scanner.close();
    }
    
}
