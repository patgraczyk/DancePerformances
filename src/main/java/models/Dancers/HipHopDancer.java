package models.Dancers;

import models.Choreographer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hip_hop_dancers")
public class HipHopDancer extends Dancer {


    public HipHopDancer(String name, String stageName, int shoeSize, DanceType danceType, int salary, Choreographer choreographer) {
        super(name, stageName, shoeSize, danceType, salary, choreographer);
    }

    public HipHopDancer() {
    }
}
