package J07059;

public class CaThi implements Comparable<CaThi> {
    private String id, date, time, room;

    public CaThi(int id, String date, String time, String room) {
        this.id = String.format("C%03d", id);
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public int compareTo(CaThi c) {
        String a[] = this.date.split("/"), b[] = this.time.split(":");
        String x[] = c.date.split("/"), y[] = c.time.split(":");
        int d1 = Integer.valueOf(a[0]) + Integer.valueOf(a[1]) * 30 + Integer.valueOf(a[2]) * 365, d2 = Integer.valueOf(x[0]) + Integer.valueOf(x[1]) * 30 + Integer.valueOf(x[2]) * 365;
        int t1 = Integer.valueOf(b[0]) * 60 + Integer.valueOf(b[1]), t2 = Integer.valueOf(y[0]) * 60 + Integer.valueOf(y[1]);
        if (d1 < d2) return -1;
        else if (d1 > d2) return 1;
        else {
            if (t1 < t2) return -1;
            else if (t1 > t2) return 1;
            return this.id.compareTo(c.id);
        }
    }

    @Override
    public String toString() {
        return id + " " + date + " " + time + " " + room;
    }

    

}