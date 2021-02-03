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


    public double getRectangleArea() {
        Coordinate min = findMinimumCoordinate();
        Coordinate max = findMaximumCoordinate();

        return max.getLatitude() - min.getLatitude() * max.getLongitude() - min.getLongitude();
    }

    public double getFullElevation() {
        double elevation = 0;

        for (int i = 0; i < trackPoints.size() - 1; i++) {
            TrackPoint actual = trackPoints.get(i);
            TrackPoint next = trackPoints.get(i + 1);
            if (actual.higherThan(next)) {                  //Trackpointban van ez a metódus
                elevation += actual.elevationDifference(next); //Trackpointban
            }
        }
        return elevation;
    }

           /*  foreach használatával
        TrackPoint prev = trackPoints.get(0);
        for (TrackPoint actual : trackPoints) {
            if (actual.higherThan(prev)) {
                elevation += actual.elevationDifference(prev);
            }
            prev = actual;
        }
        return elevation;
     }
    */

    public double getFullDecrease() {
        double decreaseSum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            TrackPoint actual = trackPoints.get(i);
            TrackPoint next = trackPoints.get(i + 1);
            if (next.higherThan(actual)) {                  //Trackpointban van ez a metódus
                decreaseSum += actual.elevationDifference(next);
            }
        }
        return decreaseSum;

    }

    public double getDistance() {
        double sum = 0;
        TrackPoint prev = trackPoints.get(0);
        for ( TrackPoint actual : trackPoints) {
            sum += prev.getDistanceFrom(actual);
            prev = actual;
        }
        return sum;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}


