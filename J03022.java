import java.util.Scanner;

/**
 * xu li van ban
 */
public class J03022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            } else {
                sb.append(line).append("\n");
            }
        }

        String str[] = sb.toString().split("\\.|\\?|\\!");

        for (String i : str) {
            String tmp[] = i.trim().split("\\s+");
            for (int j = 0; j < tmp.length; j++) {
                if(tmp[j].length()>0){
                    if (j == 0) {
                        System.out.print(tmp[0].substring(0, 1).toUpperCase() + tmp[0].substring(1).toLowerCase() + " ");
                    } else {
                        System.out.print(tmp[j].toLowerCase() + " ");
                    }
                }
            }        
            System.out.println();
        }
        scanner.close();
    }
}