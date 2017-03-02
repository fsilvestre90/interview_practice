import java.util.*;

public class MeetingCoordinator {
    public static ArrayList<Meeting> mergeRanges(ArrayList<Meeting> meetings) {
        // sort by start times
        ArrayList<Meeting> sortedMeetings = new ArrayList<Meeting>(meetings);
        Collections.sort(sortedMeetings, new Comparator<Meeting>() {
            public int compare(Meeting m1, Meeting m2)  {
                return m1.getStart() - m2.getStart();
            }
        });

        // initialize mergedMeetings with the earliest meeting
        ArrayList<Meeting> mergedMeetings = new ArrayList<Meeting>();
        mergedMeetings.add(sortedMeetings.get(0));

        for (Meeting currentMeeting : sortedMeetings) {

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            // if the current and last meetings overlap, use the latest end time
            if (currentMeeting.startTime <= lastMergedMeeting.endTime) {
                lastMergedMeeting.endTime = Math.max(lastMergedMeeting.endTime, currentMeeting.endTime);

            // add the current meeting since it doesn't overlap
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;
    }
    
    public static void main(String[] args) {
        ArrayList<Meeting> meetings = new ArrayList<Meeting>();
        meetings.add(new Meeting(1, 10));
        meetings.add(new Meeting(3, 5));
        meetings.add(new Meeting(4, 8));
        meetings.add(new Meeting(10, 12));
        meetings.add(new Meeting(9, 10));
        
        System.out.println(mergeRanges(meetings));
    }
}