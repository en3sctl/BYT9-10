import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Investigator extends Player
{
    public Investigator(int id,String username, boolean isDead, boolean isProtected) {
        super(id, username,isDead, isProtected);
    }

    public void revealRole(int id) {}

    @Override
    public void login() {

    }

    @Override
    public void createRoom() {

    }

    @Override
    public void vote() {

    }

    @Override
    public void joinRoom() {

    }

    @Override
    public void leaveRoom() {

    }

    @Override
    public void enableRole() {

    }

    @Override
    public void disableRole() {

    }
}