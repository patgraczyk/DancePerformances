package models.Dancers;


import models.Choreographer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contemporary_dancers")
public class ContemporaryDancer extends Dancer {

    public ContemporaryDancer(String name, String stageName, int shoeSize, String danceStyle, Choreographer choreographer) {
        super(name, stageName, shoeSize, danceStyle, choreographer);
    }

    public ContemporaryDancer() {
    }
}
