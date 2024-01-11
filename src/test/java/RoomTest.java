import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class RoomTest {

    @Test
    public void testRoomInitialization() {
        // create a room with sample data
        List<Role> additionalRoles = Arrays.asList(Role.Killer, Role.Doctor, Role.Civilian);
        List<Player> players = Arrays.asList(new Investigator(1, "Player1", false, false),
                new Killer(2, "Player2", false, false));

        Room room = new Room("sampleLink", additionalRoles, 1, players);

        assertNotNull(room);
        assertEquals("sampleLink", room.getLink());
        assertEquals(additionalRoles, room.getAdditionalRoles());
        assertEquals(1, room.getCurrentTurn());
        assertEquals(players, room.getPlayers());
    }
}
