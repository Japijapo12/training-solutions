package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderStateTest {

    @Test
    public void NewCanDeleteTest() {
        Orderstate orderstate = Orderstate.NEW;

        assertTrue(orderstate.canDelete());
    }

    @Test
    public void ConfirmedCanDeleteTest() {
        Orderstate orderstate = Orderstate.CONFIRMED;

        assertTrue(orderstate.canDelete());
    }

    @Test
    public void PreparedCanDeleteTest() {
        Orderstate orderstate = Orderstate.PREPARED;

        assertTrue(orderstate.canDelete());
    }

     @Test
    public void OnboardCanDeleteTest() {
        Orderstate orderstate = Orderstate.ONBOARD;

        assertFalse(orderstate.canDelete());
    }

     @Test
    public void DeliveredCanDeleteTest() {
        Orderstate orderstate = Orderstate.DELIVERED;

        assertFalse(orderstate.canDelete());
    }

     @Test
    public void DeletedCanDeleteTest() {
        Orderstate orderstate = Orderstate.DELETED;

        assertFalse(orderstate.canDelete());
    }



}
