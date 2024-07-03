package Week3.Jpa3;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.ResponseStatus;

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ResponseStatus status;

    // Getters and Setters
}




