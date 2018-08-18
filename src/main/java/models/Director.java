package models;

import javax.persistence.*;

@Entity
@Table(name = "directors")

public class Director {

    private int id;
    private String directorName;

    public Director(String directorName) {
        this.directorName = directorName;
    }

    public Director() {
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

    @Column(name = "director_name")
    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
