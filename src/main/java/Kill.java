import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kill {
    private Killer killer;
    private Civillian civilian;

    public Kill(Killer killer, Civillian civilian) {
        this.killer = killer;
        this.civilian = civilian;
    }

    public void executeKill() {
        // the logic for the kill
        if (!civilian.isProtected()) {
            civilian.setDead(true);
        }
    }
}
