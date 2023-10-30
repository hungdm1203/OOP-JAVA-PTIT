package J05069;

public class Match implements Comparable<Match> {
    private String idMatch;
    private long ticket;
    private Club cl;


    public Match(String idMatch, long ticket, Club cl) {
        this.idMatch = idMatch;
        this.ticket = ticket;
        this.cl=cl;
    }

    public long getTicket(){
        return this.ticket;
    }



    @Override
    public String toString() {
        return idMatch + " " + cl;
    }

    public int compareTo(Match m){
        if(this.cl.getDoanhthu()<m.cl.getDoanhthu())
            return 1;
        else if(this.cl.getDoanhthu()>m.cl.getDoanhthu())
            return -1;
        return this.cl.getName().compareTo(m.cl.getName());
    }


    
}