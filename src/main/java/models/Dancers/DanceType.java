package models.Dancers;

public enum DanceType {

    BALLET("Ballet"),
    CONTEMPORARY("Contemporary"),
    HIPHOP("Hip Hop"),
    COMMERCIAL("Commercial"),
    LYRICAL("Lyrical");

    private String danceType;

    DanceType(String danceType) {
        this.danceType = danceType;
    }


    public String getDanceType() {
        return danceType;
    }

    public void setDanceType(String danceType) {
        this.danceType = danceType;
    }
}
