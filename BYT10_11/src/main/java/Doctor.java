import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Doctor extends Player
{
    public Doctor(int id,boolean isDead, boolean isProtected) {
        super(id,isDead, isProtected);
    }

    public void Protect(int id) {}
}