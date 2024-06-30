import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> members;
    // Other properties, getters, and setters
}

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Duration presentationDuration;

// Other properties, getters, and setters
