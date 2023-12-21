import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomAdminTest {

    @Test
    void testRoomAdmin() {
        RoomAdmin roomAdmin = new RoomAdmin(1, false, true);

        assertEquals(1, roomAdmin.getGuestId());
        assertFalse(roomAdmin.isDead());
        assertTrue(roomAdmin.isProtected());

        roomAdmin.setGuestId(2);
        roomAdmin.setDead(true);
        roomAdmin.setProtected(false);

        assertEquals(2, roomAdmin.getGuestId());
        assertTrue(roomAdmin.isDead());
        assertFalse(roomAdmin.isProtected());
    }
}
