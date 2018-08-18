package models;

import javax.persistence.*;

@Entity
@Table(name = "danceshows")

public class DanceShow {

    private int id;
    private String title;
    private Director director;
//    ADD VENUE


    public DanceShow(String title, Director director) {
        this.title = title;
        this.director = director;
    }

    public DanceShow() {
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable =false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
