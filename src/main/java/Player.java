import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Player {
    private int id;
    private String username;
    private boolean isDead;
    private boolean isProtected;

    public boolean isDead() {
        return isDead;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void login() {
    }

    public void createRoom() {
    }

    public void vote() {

    }

    public void joinRoom() {

    }

    public void leaveRoom() {

    }

    public void enableRole() {

    }

    public void disableRole() {

    }

}
