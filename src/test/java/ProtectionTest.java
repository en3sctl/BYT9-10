import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProtectionTest {

    @Test
    public void testProtect() {
        Civillian civilian = new Civillian(10,"Name", false, false);
        Doctor doctor = new Doctor(1, "TestDoctor", false, false);
        Protection protectionAssociation = new Protection(doctor, civilian);
        assertFalse(civilian.isProtected());
        protectionAssociation.protect();
        assertTrue(civilian.isProtected());
    }
}

