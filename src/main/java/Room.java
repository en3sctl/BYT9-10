import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Room
{
    String link;
    List<Role> additionalRoles;
    int currentTurn;
    List<Player> players;


}
