package models.Dancers;


import models.Choreographer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contemporary_dancers")
public class ContemporaryDancer extends Dancer {

    public ContemporaryDancer(String name, String stageName, int shoeSize, DanceType danceType, int salary, Choreographer choreographer) {
        super(name, stageName, shoeSize, danceType, salary, choreographer);
    }

    public ContemporaryDancer() {
    }
}
