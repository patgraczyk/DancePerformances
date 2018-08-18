import db.DBHelper;
import models.Choreographer;
import models.DanceShow;
import models.Dancers.Dancer;
import models.Director;
import models.Venue;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Dancer ballerina;
        Dancer contemporaryDancer;
        Dancer hipHopDancer;
        Director director1;
        Director director2;
        Choreographer choreographer1;
        Choreographer choreographer2;
        DanceShow danceShow1;
        DanceShow danceShow2;
        Venue venue1;
        Venue venue2;

//        CRUD FOR DANCER
        ballerina = new Dancer("Anna","Mona", 6, "Ballet" );
        DBHelper.save(ballerina);

        contemporaryDancer = new Dancer("Digory", "Moomin", 8, "contemporary");
        DBHelper.save(contemporaryDancer);

        hipHopDancer = new Dancer("Stoo", "Stooby Doo", 9, "Hip Hop");
        DBHelper.save(hipHopDancer);

        hipHopDancer.setShoeSize(9);
        DBHelper.update(hipHopDancer);

        List<Dancer> dancersFound =  DBHelper.getAll(Dancer.class);
        Dancer dancerFound = DBHelper.findById(Dancer.class, 1);


//        CRUD FOR DIRECTOR
        director1 = new Director("James Flint");
        director2 = new Director("Jacob Base");

        DBHelper.save(director1);
        DBHelper.save(director2);

        List<Director> directorsFound = DBHelper.getAll(Director.class);
        Director directorFond = DBHelper.findById(Director.class, 2);

//        CRUD FOR CHOREOGRAPHER
        choreographer1 = new Choreographer("Malvin", "Famous Strike");
        choreographer2 = new Choreographer("Jasmin", "Great Dances");

        DBHelper.save(choreographer1);
        DBHelper.save(choreographer2);

//        CRUD FOR DANCESHOW

        danceShow1 = new DanceShow("Swan Lake");
        danceShow2 = new DanceShow("Highland Fling");

        DBHelper.save(danceShow1);
        DBHelper.save(danceShow2);

        List<DanceShow> danceShows = DBHelper.getAll(DanceShow.class);

//     CRUD FOR VENUE
        venue1 = new Venue("Festival Theatre");
        venue2 = new Venue("The Lyceum");

        DBHelper.save(venue1);
        DBHelper.save(venue2);

    }
}