package models.Dancers;

import models.Choreographer;
import models.DanceShow;
import models.PT;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dancers")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Dancer {

    private int id;
    private String name;
    private String stageName;
    private int shoeSize;
    private String danceStyle;
    private PT pt;
    private Choreographer choreographer;
    private List<DanceShow> danceShows;

    public Dancer(String name, String stageName, int shoeSize, String danceStyle, Choreographer choreographer) {
        this.name = name;
        this.stageName = stageName;
        this.shoeSize = shoeSize;
        this.danceStyle = danceStyle;
        this.pt = pt;
        this.choreographer = choreographer;
        this.danceShows = new ArrayList<DanceShow>();
    }

    public Dancer() {
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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "stage_name")
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    @Column(name = "shoe_size")
    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Column(name = "dance_style")
    public String getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    @OneToOne(mappedBy = "dancer", fetch = FetchType.LAZY)
    public PT getPt() {
        return pt;
    }

    public void setPt(PT pt) {
        this.pt = pt;
    }

    @ManyToOne
    @JoinColumn(name = "choreographer_id", nullable = false)
    public Choreographer getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Choreographer choreographer) {
        this.choreographer = choreographer;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(
            name = "dancers_shows",
            joinColumns = {@JoinColumn(name = "dancer_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "dance_show_id", nullable = false, updatable = false)}
    )
    public List<DanceShow> getDanceShows() {
        return danceShows;
    }

    public void setDanceShows(List<DanceShow> danceShows) {
        this.danceShows = danceShows;
    }

    public void addDanceShow(DanceShow danceShow){
        this.danceShows.add(danceShow);
    }
}
