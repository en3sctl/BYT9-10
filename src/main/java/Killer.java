import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Killer extends Player
{
    public Killer(int id, String username, boolean isDead, boolean isProtected) {
        super(id, username, isDead, isProtected);
    }

    public void Kill(int id) {}

}
