import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void testGameInitialization() {
        Game game = new Game();

        assertNotNull(game);
        assertEquals(Game.Status.NOT_STARTED, game.getGameStatus());
        assertFalse(game.isGameStarted());
        assertFalse(game.isGameEnded());
        assertNull(game.getTimeStart());
        assertNull(game.getTimeEnd());
        assertNull(game.getGameResult());
    }

    @Test
    public void testStartGame() {
        Game game = new Game();

        // starting the game for the first time
        game.startGame();

        assertEquals(Game.Status.IN_PROGRESS, game.getGameStatus());
        assertTrue(game.isGameStarted());
        assertFalse(game.isGameEnded());
        assertNotNull(game.getTimeStart());
        assertNull(game.getTimeEnd());
        assertNull(game.getGameResult());

        // trying to start the game again
        game.startGame();

        //the game status should remain IN_PROGRESS, and the start time should not change
        assertEquals(Game.Status.IN_PROGRESS, game.getGameStatus());
        assertTrue(game.isGameStarted());
        assertFalse(game.isGameEnded());
        assertNotNull(game.getTimeStart());
        assertNull(game.getTimeEnd());
        assertNull(game.getGameResult());
    }
}
