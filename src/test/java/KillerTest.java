import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KillerTest {

    @Test
    void testKiller() {
        Killer killer = new Killer(10,"Name",false, true);

        assertFalse(killer.isDead());
        assertTrue(killer.isProtected());

        killer.setDead(true);
        killer.setProtected(false);

        assertTrue(killer.isDead());
        assertFalse(killer.isProtected());

    }
}
