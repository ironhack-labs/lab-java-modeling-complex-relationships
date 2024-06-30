import jakarta.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String status; // ATTENDING, NOT_ATTENDING, or NO_RESPONSE

    @ManyToOne
    private Event event;
    // Other properties, getters, and setters
}
