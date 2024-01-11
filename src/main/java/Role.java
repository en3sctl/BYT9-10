import lombok.*;

@Getter
@AllArgsConstructor
@ToString
public enum Role
{
    Killer, Doctor, Civilian, Investigator;
}