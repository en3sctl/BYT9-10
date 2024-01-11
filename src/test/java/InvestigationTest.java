import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvestigationTest {

    @Test
    public void testInvestigate() {
        Civillian civilian = new Civillian(10,"Name", false, false);
        Investigator investigator = new Investigator(1, "TestInvestigator", false, false);
        Investigation investigationAssociation = new Investigation(investigator, civilian);
        Role result = investigationAssociation.investigate();
        assertNull(result);
    }
}

