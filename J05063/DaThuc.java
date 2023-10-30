package J05063;

import java.util.*;

public class DaThuc {
    // private ArrayList<String> arr;
    private TreeMap<Integer,Integer> arr;

    

    public DaThuc(TreeMap<Integer, Integer> arr) {
        this.arr = arr;
    }

    public DaThuc(String s){
        this.arr=new TreeMap<>();
        String str[]=s.trim().split("\\s+");
        for (String string : str) {
            if(!string.equals("+") && !string.equals("-")){
                String tmp[]=string.split("\\*x\\^");
                this.arr.put(Integer.valueOf(tmp[1]), Integer.valueOf(tmp[0]));
            }
        }
    }

    public DaThuc cong(DaThuc dt){
        TreeMap<Integer,Integer> res=new TreeMap<>(this.arr);
        for(Integer i:dt.arr.keySet()){
            if(res.containsKey(i)){
                res.put(i,res.get(i)+dt.arr.get(i));
            } else res.put(i, dt.arr.get(i));
        }
        return new DaThuc(res);
    }

    @Override
    public String toString() {
        String s="";
        for (Integer i: this.arr.keySet()) {
            if(!s.isEmpty()){
                s=this.arr.get(i)+"*x^"+i+" + "+s;
            } else s=this.arr.get(i)+"*x^"+i+s;
        }
        return s;
    }


    

    
}
