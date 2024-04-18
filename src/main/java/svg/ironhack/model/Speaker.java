package svg.ironhack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 1, max = 50, message = "Name length must be between 10 and 200 characters")
    private String name;
    @Column(name = "presentation_duration", nullable = false)
    private int presentationDuration;

}
