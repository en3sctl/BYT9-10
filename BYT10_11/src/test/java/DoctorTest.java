import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    @Test
    void testDoctor() {
        Doctor player = new Doctor(10, false, false);

        assertEquals(10, player.getGuestId());
        assertFalse(player.isDead());
        assertFalse(player.isProtected());

        player.setGuestId(20);
        player.setDead(true);
        player.setProtected(true);

        assertEquals(20, player.getGuestId());
        assertTrue(player.isDead());
        assertTrue(player.isProtected());
    }
}
