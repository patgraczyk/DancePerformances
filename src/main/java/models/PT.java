package models;

import javax.persistence.*;


@Entity
@Table(name = "pts")

public class PT {

    private int id;
    private Dancer dancer;
    private String namePT;

    public PT(String namePT, Dancer dancer) {
        this.dancer = dancer;
        this.namePT = namePT;
    }

    public PT() {
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

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "dancer_id", nullable = false)
        public Dancer getDancer() {
            return dancer;
        }

        public void setDancer(Dancer dancer) {
            this.dancer = dancer;
        }

        @Column(name = "namePT")
        public String getNamePT() {
            return namePT;
        }

        public void setNamePT(String namePT) {
            this.namePT = namePT;
        }
}


