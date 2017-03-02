public class Meeting {

    int startTime;
    int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }
    public int getStart() {
        return startTime;
    }
    public int getEnd() {
        return endTime;
    }
    public String toString() {
        return String.format("(%d, %d)", startTime, endTime);
    }
}