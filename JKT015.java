import java.util.*;

/**
 * go ban phim
 */
public class JKT015 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Stack<Character> res=new Stack<>();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='<'){
                if(!res.isEmpty()) st.add(res.pop());
            } else if(s.charAt(i)=='>'){
                if(!st.isEmpty()) res.add(st.pop());
            } else if(s.charAt(i)=='-') {
                if(!res.isEmpty()) res.pop();
            }
            else res.add(s.charAt(i));
        }
        while (!st.isEmpty()) {
            res.add(st.pop());
        }
        for (Character c : res) {
            System.out.print(c);
        }
        scanner.close();
    }
}