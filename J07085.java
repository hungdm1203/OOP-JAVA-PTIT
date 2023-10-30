import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * tong chu so
 */
public class J07085 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list=(ArrayList<String>) ip.readObject();
        for (String s : list) {
            String res="";
            int sum=0;
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    sum=sum+s.charAt(i)-'0';
                    if(res.isEmpty()&&s.charAt(i)=='0'){

                    }else res=res+s.charAt(i);
                }
            }
            if(!res.isEmpty()) System.out.println(res+" "+sum);
        }
    }
}