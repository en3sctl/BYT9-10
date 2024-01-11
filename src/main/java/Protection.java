import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Protection{
    private Doctor doctor;
    private Civillian civilian;

    public Protection(Doctor doctor, Civillian civilian) {
        this.doctor = doctor;
        this.civilian = civilian;
    }

    public void protect() {
        //  the logic for protection
        civilian.setProtected(true);
    }
}
