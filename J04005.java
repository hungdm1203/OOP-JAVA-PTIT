// import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * khai bao lop thi sinh 
 */


class ThiSinh {
        private String name,nsinh;
        private float d1,d2,d3;

        
        public ThiSinh(String name, String nsinh, float d1, float d2, float d3) {
            this.name = name;
            this.nsinh = nsinh;//new SimpleDateFormat("dd/MM/yyyy").format(nsinh);
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }


        @Override
        public String toString() {
            return name + " " + nsinh + " " + String.format("%.1f", d1+d2+d3);
        }
               
} 



public class J04005 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ThiSinh sv=new ThiSinh(scanner.nextLine(), scanner.nextLine(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        System.out.println(sv);
        scanner.close();
    }

}


