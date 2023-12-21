import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Investigator extends Player
{
    public Investigator(int id, boolean isDead, boolean isProtected) {
        super(id, isDead, isProtected);
    }

    public void revealRole(int id) {}
}