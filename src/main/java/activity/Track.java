package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackpoint) {
        trackPoints.add(trackpoint);
    }

    public Coordinate findMaximumCoordinate() {
        if (trackPoints.isEmpty()) {
            throw new IllegalStateException("No points");
        }

        double maxLat = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLong = trackPoints.get(0).getCoordinate().getLongitude();
        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() > maxLat) {
                maxLat = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() > maxLong) {
                maxLong = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLat, maxLong);
    }

    public Coordinate findMinimumCoordinate() {

        Coordinate coordinateMinLat = null;
        double minLat = trackPoints.get(0).getCoordinate().getLatitude();
        double minLong = trackPoints.get(0).getCoordinate().getLongitude();
        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() < minLat) {
                minLat = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() < minLong) {
                minLong = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLat, minLong);
    }






    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

 //   public double getDistance() {

  //  }
}
