import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type")
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Duration duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event")
    private List<Guest> guests;
    // Other properties, getters, and setters
}
