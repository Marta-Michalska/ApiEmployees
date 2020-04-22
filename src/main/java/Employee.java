import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames=false)
public class Employee {

    @ToString.Exclude
    private int id;

    private String name;

    @ToString.Exclude
    private Double salary;

    @ToString.Exclude
    private Double age;
}
