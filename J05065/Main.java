package J05065;

import java.util.*;

/*
 * liet ke nhan vien theo nhom
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); scanner.nextLine();
        ArrayList<NhanVien> ds=new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        while (n-->0) {
            String a=scanner.nextLine();
            int x=a.indexOf(" ");
            String id=a.substring(0, x), name=a.substring(x+1);
            String position=id.substring(0, 2), number=id.substring(4), step=id.substring(2, 4);
            if(position.equals("NV")){
                ds.add(new NhanVien(name, position, number, step));
            } else {
                if(position.equals("GD")){
                    if(hm.containsKey("GD")) ds.add(new NhanVien(name, "NV", number, step));
                    else {
                        ds.add(new NhanVien(name, position, number, step));
                        hm.put("GD", 1);
                    }
                }
                if(position.equals("TP")){
                    if(hm.containsKey("TP") && hm.get("TP")>3) ds.add(new NhanVien(name, "NV", number, step));
                    else{
                        if(!hm.containsKey("TP")) {
                            ds.add(new NhanVien(name, position, number, step));
                            hm.put("TP", 1);
                        } else {
                            if(hm.get("TP")<3){
                                ds.add(new NhanVien(name, position, number, step));
                                hm.put("TP", hm.get("TP")+1);
                            } else ds.add(new NhanVien(name, "NV", number, step));
                        }
                    }
                }
                if(position.equals("PP")){
                    if(hm.containsKey("PP") && hm.get("PP")>3) ds.add(new NhanVien(name, "NV", number, step));
                    else{
                        if(!hm.containsKey("PP")) {
                            ds.add(new NhanVien(name, position, number, step));
                            hm.put("PP", 1);
                        } else {
                            if(hm.get("PP")<3){
                                ds.add(new NhanVien(name, position, number, step));
                                hm.put("PP", hm.get("PP")+1);
                            } else ds.add(new NhanVien(name, "NV", number, step));
                        }
                    }
                }
            }
        }

        Collections.sort(ds);
        n=scanner.nextInt(); scanner.nextLine();
        while (n-->0) {
            String s=scanner.nextLine();
            for (NhanVien nhanVien : ds) {
                if(s.equals(nhanVien.getPosition())) System.out.println(nhanVien);
            }
            System.out.println();
        }
        scanner.close();
    }
}

