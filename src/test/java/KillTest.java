import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KillTest {

    @Test
    public void testExecuteKill() {
        Civillian civilian = new Civillian(10,"Name", false, false);
        Killer killer = new Killer(1, "TestKiller", false, false);
        Kill killAssociation = new Kill(killer, civilian);
        assertFalse(civilian.isDead());
        killAssociation.executeKill();
        assertTrue(civilian.isDead());
    }
}
