package models;

import javax.persistence.*;

@Entity
@Table(name = "choreographers")

public class Choreographer {

    private int id;
    private String nameChoreographer;
    private String choreography;

    public Choreographer(String nameChoreographer, String choreography) {
        this.nameChoreographer = nameChoreographer;
        this.choreography = choreography;
    }

    public Choreographer() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name_choreographer")
    public String getNameChoreographer() {
        return nameChoreographer;
    }


    public void setNameChoreographer(String nameChoreographer) {
        this.nameChoreographer = nameChoreographer;
    }

    @Column(name = "choreography")
    public String getChoreography() {
        return choreography;
    }

    public void setChoreography(String choreography) {
        this.choreography = choreography;
    }
}
