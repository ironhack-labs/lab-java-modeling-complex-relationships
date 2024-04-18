package svg.ironhack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 1, max = 50, message = "Name length must be between 10 and 200 characters")
    private String name;
    @NotNull
    @Enumerated(EnumType.STRING)
    private GuestStatus status;
}
