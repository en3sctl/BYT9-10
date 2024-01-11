import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CivillianTest {

    @Test
    void testCivilian() {
        Civillian player = new Civillian(10,"Name", false, false);

        assertEquals(10, player.getId());
        assertFalse(player.isDead());
        assertFalse(player.isProtected());

        player.setId(20);
        player.setDead(true);
        player.setProtected(true);

        assertEquals(20, player.getId());
        assertTrue(player.isDead());
        assertTrue(player.isProtected());
    }
}
