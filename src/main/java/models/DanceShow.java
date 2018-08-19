package models;

import models.Dancers.Dancer;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "danceshows")

public class DanceShow {

    private int id;
    private String title;
    private Director director;
    private List<Dancer> dancers;
    private int budget;
//    ADD VENUE


    public DanceShow(String title, int budget, Director director) {
        this.title = title;
        this.director = director;
        this.dancers = new ArrayList<Dancer>();
        this.budget = budget;
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


    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(
            name = "dancers_shows",
            joinColumns = {@JoinColumn(name = "dance_show_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "dancer_id", nullable = false, updatable = false)}
    )
    public List<Dancer> getDancers() {
        return dancers;
    }

    public void setDancers(List<Dancer> dancers) {
        this.dancers = dancers;
    }

    public void addDancers (Dancer dancer){
        this.dancers.add(dancer);
    }


    public boolean payDancer(Dancer dancer, int payment){
        if (payment <= budget){
            budget -= payment;
            dancer.addToSalary(payment);
            return true;
        }
        return false;

    }


}
