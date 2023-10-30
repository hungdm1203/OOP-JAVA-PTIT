package J07012;

public class Word implements Comparable<Word> {
    private String s;
    private int value;
    
    public Word(String s, int value) {
        this.s = s;
        this.value = value;
    }

    public int compareTo(Word w){
        if(this.value<w.value) return 1;
        else if(this.value>w.value) return -1;
        return this.s.compareTo(w.s);
    }

    @Override
    public String toString() {
        return s + " " + value;
    }

}


// package J07012;

// public class Word implements Comparable<Word>
// {
//     private String word;
//     private int f;

//     public Word(String word, int f)
//     {
//         this.word = word;
//         this.f = f;
//     }
    
//     @Override
//     public String toString()
//     {
//         return word + " " + f;
//     }

//     @Override
//     public int compareTo(Word o)
//     {
//         if (f != o.f)
//             return o.f - f;
//         return word.compareTo(o.word);
//     }
// }