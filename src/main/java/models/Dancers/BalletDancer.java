package models.Dancers;

import models.Choreographer;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "ballet_dancers")
@Inheritance(strategy = InheritanceType.JOINED)


public class BalletDancer extends Dancer {


    public BalletDancer(String name, String stageName, int shoeSize, DanceType danceType, int salary, Choreographer choreographer) {
        super(name, stageName, shoeSize, danceType, salary, choreographer);
    }

    public BalletDancer() {
    }
}
