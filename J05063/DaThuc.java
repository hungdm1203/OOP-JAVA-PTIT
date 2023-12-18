package J05063;

import java.util.*;

public class DaThuc {
    private TreeMap<Integer,Integer> arr;


    public DaThuc(TreeMap<Integer, Integer> arr) {
        this.arr = arr;
    }

    public DaThuc(String s){
        this.arr=new TreeMap<>();
        String tmp[]=s.trim().split("\\s+");
        for(String i: tmp){
            if(!i.equals("+")){
                String ss[]=i.split("\\*x\\^");
                this.arr.put(Integer.valueOf(ss[1]),Integer.valueOf(ss[0]));
            }
        }
    }

    public DaThuc cong(DaThuc d){
        TreeMap<Integer,Integer> ts=this.arr;
        for(Integer i:d.arr.keySet()){
            if (ts.containsKey(i)) {
                ts.put(i, ts.get(i)+d.arr.get(i));
            } else{
                ts.put(i, d.arr.get(i));
            }
        }
        return new DaThuc(ts);
    }

    @Override
    public String toString() {
        String res="";
        for(Integer i:this.arr.keySet()){
            res=this.arr.get(i)+"*x^"+i+" + "+res;
        }

        return res.substring(0,res.length()-3);
    }
    
}

