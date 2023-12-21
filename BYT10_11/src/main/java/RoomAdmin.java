import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoomAdmin extends Player
{
    public RoomAdmin(int id, boolean isDead, boolean isProtected) {
        super(id, isDead, isProtected);
    }

    public void enableRole(Role role) {}
    public void disableRole(Role role) {}
    public void startGame() {}
}
