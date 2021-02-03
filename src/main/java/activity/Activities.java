package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

/*
    public int numberOfTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithTrack) {
                counter ++;
            }
        }
        return counter;
    }
*/
    //instanceof használata nélkül


/*    public int numberOfTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (activity.getType().isHasTrack()) {
                counter++;
            }
        }
        return counter;
    }

*/

// Activity interfészben boolean hasTrack metódussal?

    public int numberOfTrackActivities() {
    int counter = 0;
    for (Activity activity : activities) {
        if (activity.hasTrack()) {
            counter++;
        }
    }
    return counter;
}

    public int numberOfWithoutTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (!activity.hasTrack()) {
                counter++;
            }
        }
        return counter;
    }

    public List<Report> distanceByTypes() {
                    //A values() az összes enum értéket tartalmazó tömböt ad vissza.
        double[] sum = new double[ActivityType.values().length];
        for ( Activity activity : activities) {
            sum[activity.getType().ordinal()] += activity.getDistance();
        }

        List<Report> result = new ArrayList<>();

        for (ActivityType activityType : ActivityType.values()) {
            result.add(new Report(activityType, sum[activityType.ordinal()]));
        }
        return result;
    }

}



