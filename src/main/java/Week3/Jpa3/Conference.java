package Week3.Jpa3;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Conference extends Event{

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Speaker> speakers;
    public Conference() {}

    //Getters and Setters
}
