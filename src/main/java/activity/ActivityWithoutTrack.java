package activity;

public class ActivityWithoutTrack implements Activity {

    private ActivityType activityType;

    public ActivityWithoutTrack(ActivityType activityType) {
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }

    /* nem kell, mert az Activity interfészben defaulttá tettük
    return false -val
    @Override
       public boolean hasTrack() {
        return false;
    }  */
}
