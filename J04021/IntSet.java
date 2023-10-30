package J04021;

import java.util.*;

public class IntSet {
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }

    public IntSet union(IntSet is){
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < this.a.length; i++) {
            if(!arr.contains(this.a[i])){
                arr.add(this.a[i]);
            }
        }
        for (int i = 0; i < is.a.length; i++) {
            if(!arr.contains(is.a[i])){
                arr.add(is.a[i]);
            }
        }
        Collections.sort(arr);
        int res[]=new int[arr.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=arr.get(i);
        }
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String s="";
        for (int i : this.a) {
            s=s+i+" ";
        }
        return s;
    }


}
