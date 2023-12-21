import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Room
{
    String link;
    boolean isProtected;
    List<Role> additionalRoles;
    boolean gameStarted;
    int currentTurn;
    boolean gameEnded;
    List<Player> players;


}
