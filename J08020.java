import java.util.*;

/**
 * kiem tra day ngoac dung
 */
public class J08020 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            Deque<Integer> dq=new ArrayDeque<>();
            int check=1;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                    dq.addFirst(i);
                } else if (!dq.isEmpty() && s.charAt(dq.getFirst())=='[' && s.charAt(i)==']'){
                    dq.removeFirst();
                } else if (!dq.isEmpty() && s.charAt(dq.getFirst())=='{' && s.charAt(i)=='}'){
                    dq.removeFirst();
                } else if (!dq.isEmpty() && s.charAt(dq.getFirst())=='(' && s.charAt(i)==')'){
                    dq.removeFirst();
                } else{
                    check=0;
                    break;
                }
            }
            if(check==1){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
}