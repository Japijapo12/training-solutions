package activity;

public interface Activity {

    double getDistance();

    ActivityType getType();

    default boolean hasTrack() {   // csak akkor kell felülírni, ha true
        return false;
    }
}
