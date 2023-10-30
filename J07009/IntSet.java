package J07009;

import java.util.*;

public class IntSet {
    private int a[];

    public IntSet(int[] a) {
        this.a = a;
    }

    public IntSet intersection(IntSet is){
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < this.a.length; i++) {
            if(!arr.contains(this.a[i])) arr.add(this.a[i]);
        }
        ArrayList<Integer> tmp=new ArrayList<>();
        for (int i = 0; i < is.a.length; i++) {
            if(arr.contains(is.a[i]) && !tmp.contains(is.a[i])) tmp.add(is.a[i]); 
        }
        Collections.sort(tmp);
        int myArr[]=new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            myArr[i]=tmp.get(i);
        }
        return new IntSet(myArr);
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
