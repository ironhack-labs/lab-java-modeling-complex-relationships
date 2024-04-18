package svg.ironhack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 1, max = 50, message = "Name length must be between 10 and 200 characters")
    private String name;

    @Enumerated(EnumType.STRING)
    private District district;

    @OneToOne
    private Member president;

    @OneToMany
    private List<Member> members;
}
