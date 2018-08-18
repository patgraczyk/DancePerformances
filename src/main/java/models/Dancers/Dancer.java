package models.Dancers;

import javax.persistence.*;

@Entity
@Table(name = "dancers")

public class Dancer {

    private int id;
    private String name;
    private String stageName;
    private int shoeSize;
    private String danceStyle;


    public Dancer(String name, String stageName, int shoeSize, String danceStyle) {
        this.name = name;
        this.stageName = stageName;
        this.shoeSize = shoeSize;
        this.danceStyle = danceStyle;
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
}
