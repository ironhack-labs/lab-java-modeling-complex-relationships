package svg.ironhack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private int duration;
    private String location;
    private String title;
    @ManyToMany
    private List<Guest> guests;
    @Enumerated(EnumType.STRING)
    private EventType eventType;

}
