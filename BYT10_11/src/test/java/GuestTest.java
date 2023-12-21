import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void testGuest() {
        Guest guest = new Guest("john");

        assertEquals("john", guest.getUsername());

        guest.setUsername("new_username");
        assertEquals("new_username", guest.getUsername());
    }
}
