import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String status; // ACTIVE or LAPSED
    private LocalDate renewalDate;

    @ManyToOne
    private Chapter chapter;
    // Other properties, getters, and setters
}
