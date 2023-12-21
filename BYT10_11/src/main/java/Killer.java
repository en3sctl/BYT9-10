import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Killer extends Player
{
    public Killer(int id, boolean isDead, boolean isProtected) {
        super(id, isDead, isProtected);
    }

    public void Kill(int id) {}
}
