import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Player
{
    int guestId;
    boolean isDead;
    boolean isProtected;
}