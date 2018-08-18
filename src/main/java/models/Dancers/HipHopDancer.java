package models.Dancers;

import models.Choreographer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hip_hop_dancers")
public class HipHopDancer extends Dancer {

    public HipHopDancer(String name, String stageName, int shoeSize, String danceStyle, Choreographer choreographer) {
        super(name, stageName, shoeSize, danceStyle, choreographer);
    }

    public HipHopDancer() {
    }
}
