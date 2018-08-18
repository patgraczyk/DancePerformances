package models;

import javax.persistence.*;

@Entity
@Table(name = "venues")

public class Venue {


    private int id;
    private  String nameOfVenue;


    public Venue(String nameOfVenue) {
        this.nameOfVenue = nameOfVenue;
    }

    public Venue() {
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

    public String getNameOfVenue() {
        return nameOfVenue;
    }

    public void setNameOfVenue(String nameOfVenue) {
        this.nameOfVenue = nameOfVenue;
    }
}
