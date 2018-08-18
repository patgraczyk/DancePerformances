package models.Dancers;

import models.Choreographer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ballet_dancers")

public class BalletDancer extends Dancer {

    public BalletDancer(String name, String stageName, int shoeSize, String danceStyle, Choreographer choreographer) {
        super(name, stageName, shoeSize, danceStyle, choreographer);
    }

    public BalletDancer() {
    }
}
