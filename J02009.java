import java.util.Scanner;

/**
 * xep hang
 */
public class J02009 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n], b[]=new int[n];
        for (int i=0;i<n;i++) {
            a[i]=scanner.nextInt();
            b[i]=scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                    tmp=b[i]; b[i]=b[j]; b[j]=tmp;
                } else if(a[i]==a[j]){
                    if(b[i]>b[j]){
                        int tmp=b[i];
                        b[i]=b[j];
                        b[j]=tmp;
                    }
                }
            }
        }

        int t=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>t) t=a[i];
            t+=b[i];
        }
        scanner.close();
        System.out.println(t);
    }
    
}
