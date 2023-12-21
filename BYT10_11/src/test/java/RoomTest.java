import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testRoom() {
        Doctor doctor = new Doctor(1, false, false);
        Killer killer = new Killer(2, false, false);
        Room room = new Room("link", false, Arrays.asList(Role.Doctor, Role.Killer), true, 1, false, Arrays.asList(doctor, killer));

        assertEquals("link", room.getLink());
        assertFalse(room.isProtected());
        assertEquals(Arrays.asList(Role.Doctor, Role.Killer), room.getAdditionalRoles());
        assertTrue(room.isGameStarted());
        assertEquals(1, room.getCurrentTurn());
        assertFalse(room.isGameEnded());

        room.setLink("new_link");
        room.setProtected(true);
        room.setAdditionalRoles(Arrays.asList(Role.Investigator, Role.Civilian));
        room.setGameStarted(false);
        room.setCurrentTurn(2);
        room.setGameEnded(true);

        assertEquals("new_link", room.getLink());
        assertTrue(room.isProtected());
        assertEquals(Arrays.asList(Role.Investigator, Role.Civilian), room.getAdditionalRoles());
        assertFalse(room.isGameStarted());
        assertEquals(2, room.getCurrentTurn());
        assertTrue(room.isGameEnded());
    }
}
