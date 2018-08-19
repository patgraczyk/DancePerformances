package models.Dancers;

import models.Choreographer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prima_ballerinas")

public class PrimaBallerina extends BalletDancer {

    private String rank;

    public PrimaBallerina(String name, String stageName, int shoeSize, DanceType danceType, int salary, Choreographer choreographer, String rank) {
        super(name, stageName, shoeSize, danceType, salary, choreographer);
        this.rank = rank;
    }

    public PrimaBallerina() {
    }

    @Column(name = "rank")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
