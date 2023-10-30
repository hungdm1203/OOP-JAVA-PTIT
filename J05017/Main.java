package J05017;

import java.util.*;

/**
 * hoa don tien nuoc
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<Client> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new Client(i, scanner.nextLine(), scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(ds);
        for (Client client : ds) {
            System.out.println(client);
        }
        scanner.close();
    }
    
}
