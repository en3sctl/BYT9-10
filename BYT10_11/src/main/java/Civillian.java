import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Civillian extends Player
{

    public Civillian(int id, boolean isDead, boolean isProtected) {
        super(id,isDead, isProtected);
    }
}