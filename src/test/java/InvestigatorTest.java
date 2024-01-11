import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvestigatorTest {

    @Test
    void testInvestigator() {
        Investigator investigator = new Investigator(10,"Name", false, false);

        assertEquals(10, investigator.getId());
        assertFalse(investigator.isDead());
        assertFalse(investigator.isProtected());

        investigator.setId(20);
        investigator.setDead(true);
        investigator.setProtected(true);

        assertEquals(20, investigator.getId());
        assertTrue(investigator.isDead());
        assertTrue(investigator.isProtected());
    }
}
