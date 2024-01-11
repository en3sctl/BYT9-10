import java.util.Date;

public class Game {
    public enum Status {
        NOT_STARTED, IN_PROGRESS, ENDED
    }

    private Date timeStart;
    private Date timeEnd;
    private Status gameStatus;
    private boolean gameStarted;
    private boolean gameEnded;
    private Result gameResult;

    public Game() {
        this.gameStatus = Status.NOT_STARTED;
        this.gameStarted = false;
        this.gameEnded = false;
    }

    public void startGame() {
        if (!gameStarted) {
            timeStart = new Date();
            gameStarted = true;
            gameStatus = Status.IN_PROGRESS;
            System.out.println("Game started!");
        } else {
            System.out.println("Game has already started.");
        }
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public Status getGameStatus() {
        return gameStatus;
    }

    public boolean isGameStarted() {
        return gameStarted;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public Result getGameResult() {
        return gameResult;
    }

    public enum Result {
        WIN, LOSE, DRAW
    }
}
