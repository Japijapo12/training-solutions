package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C3POTest {

  @Test
    public void C3POWalkToTest() {
      Point start = new Point(0,0,10);

      C3PO c3PO = new C3PO(start);

          Point target = new Point(3,6,0);


          //When
      c3PO.moveTo(target);

      //Then
      assertEquals(target.getX(), c3PO.getPath().get(0).getX());
  }

}
