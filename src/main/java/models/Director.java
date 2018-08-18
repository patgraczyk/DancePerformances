package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directors")

public class Director {

    private int id;
    private String directorName;
    private List<DanceShow> danceShows;

    public Director(String directorName) {
        this.directorName = directorName;
        this.danceShows = new ArrayList<DanceShow>();
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


    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    public List<DanceShow> getDanceShows() {
        return danceShows;
    }

    public void setDanceShows(List<DanceShow> danceShows) {
        this.danceShows = danceShows;
    }
}
