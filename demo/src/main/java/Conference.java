import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
@DiscriminatorValue("CONFERENCE")
public class Conference extends Event {
    @ManyToMany
    private List<Speaker> speakers;
    // Other properties, getters, and setters
}
