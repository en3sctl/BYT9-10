import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Investigation{
    private Investigator investigator;
    private Civillian civilian;

    public Investigation(Investigator investigator, Civillian civilian) {
        this.investigator = investigator;
        this.civilian = civilian;
    }

    public Role investigate() {
        //  the logic for investigation
        return null;
    }
}

