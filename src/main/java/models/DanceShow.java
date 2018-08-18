package models;

import javax.persistence.*;

@Entity
@Table(name = "dance_shows")

public class DanceShow {

    private int id;
    private String title;
//    ADD VENUE


    public DanceShow(String title) {
        this.title = title;
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
}
