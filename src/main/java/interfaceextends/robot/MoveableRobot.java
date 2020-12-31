package interfaceextends.robot;

import java.util.List;

public interface MoveableRobot {

    void moveTo(Point position);

    void fastMoveTo(Point position);

    void rotate(int angle);

    List<Point> getPath();           //A getPath() metódus azoknak a pontoknak a listáját adja vissza,
                                    // amelyeket a robot mozgása során érintett
                                   // (a konkrét mozgató utasítások minden esetben bejegyzik a célként kapott Point objektumot).
}
