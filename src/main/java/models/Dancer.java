package models;

import models.PT;

import javax.persistence.*;

@Entity
@Table(name = "dancers")

public class Dancer {

    private int id;
    private String name;
    private String stageName;
    private int shoeSize;
    private String danceStyle;
    private PT pt;
    private Choreographer choreographer;

    public Dancer(String name, String stageName, int shoeSize, String danceStyle, Choreographer choreographer) {
        this.name = name;
        this.stageName = stageName;
        this.shoeSize = shoeSize;
        this.danceStyle = danceStyle;
        this.pt = pt;
        this.choreographer = choreographer;
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
}
