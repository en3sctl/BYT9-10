import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvestigatorTest {

    @Test
    void testInvestigator() {
        Investigator investigator = new Investigator(10, false, false);

        assertEquals(10, investigator.getGuestId());
        assertFalse(investigator.isDead());
        assertFalse(investigator.isProtected());

        investigator.setGuestId(20);
        investigator.setDead(true);
        investigator.setProtected(true);

        assertEquals(20, investigator.getGuestId());
        assertTrue(investigator.isDead());
        assertTrue(investigator.isProtected());
    }
}
