package svg.ironhack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 1, max = 50, message = "Name length must be between 10 and 200 characters")
    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @Column(name = "renewal_date")
    private String renewalDate;
}
