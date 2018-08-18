import db.*;
import models.*;
import models.Dancers.BalletDancer;
import models.Dancers.ContemporaryDancer;
import models.Dancers.Dancer;
import models.Dancers.HipHopDancer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        BalletDancer ballerina;
        ContemporaryDancer contemporaryDancer;
        HipHopDancer hipHopDancer;
        Director director1;
        Director director2;
        Choreographer choreographer1;
        Choreographer choreographer2;
        DanceShow danceShow1;
        DanceShow danceShow2;
        Venue venue1;
        Venue venue2;
        PT physio1;
        PT physio2;

//        CRUD FOR CHOREOGRAPHER
        choreographer1 = new Choreographer("Malvin", "Famous Strike");
        choreographer2 = new Choreographer("Jasmin", "Great Dances");

        DBHelper.save(choreographer1);
        DBHelper.save(choreographer2);

////        CRUD FOR DANCER
        ballerina = new BalletDancer("Ana", "Ballerina", 5, "ballet", choreographer1);
        DBHelper.save(ballerina);

        contemporaryDancer = new ContemporaryDancer("Digory", "Moomin", 8, "contemporary", choreographer1);
        DBHelper.save(contemporaryDancer);

        hipHopDancer = new HipHopDancer("Stoo", "Stooby Doo", 9, "Hip Hop", choreographer2);
        DBHelper.save(hipHopDancer);

        hipHopDancer.setShoeSize(9);
        DBHelper.update(hipHopDancer);

        List<Dancer> dancersFound =  DBHelper.getAll(Dancer.class);
        Dancer dancerFound = DBHelper.findById(Dancer.class, 1);

//
////    CRUD FOR DIRECTOR
        director1 = new Director("James Flint");
        director2 = new Director("Jacob Base");

        DBHelper.save(director1);
        DBHelper.save(director2);

        List<Director> directorsFound = DBHelper.getAll(Director.class);
        Director directorFond = DBHelper.findById(Director.class, 2);
//
//
//
////    CRUD FOR DANCESHOW
//
        danceShow1 = new DanceShow("Swan Lake", director1);
        danceShow2 = new DanceShow("Highland Fling", director1);

        DBHelper.save(danceShow1);
        DBHelper.save(danceShow2);

        List<DanceShow> danceShows = DBHelper.getAll(DanceShow.class);

////     CRUD FOR VENUE
        venue1 = new Venue("Festival Theatre");
        venue2 = new Venue("The Lyceum");

        DBHelper.save(venue1);
        DBHelper.save(venue2);

////      CRUD FOR PT + LOOK FOR DANCER
        physio1 = new PT("James", ballerina);
        DBHelper.save(physio1);
        physio2 = new PT ("Anna", contemporaryDancer);
        DBHelper.save(physio2);

////        TODO: Get dancer for physio
        PT getPTofDancer = DBDancer.getPTForDancer(ballerina);
//
////        TODO: Get all dancers for choreographer and check dancer's choreographer
        List<Dancer> dancersOfChoreographer = DBChoreographer.getDanceCrew(choreographer1);
////        Choreographer choreographer = DBDancer.getChoreographerofDancer(ballerina);
//
////        TODO: Get all shows of director, check the director of the danceshow
//
        List<DanceShow> danceShowOfDirector = DBDirector.getDanceShowsOfDirector(director1);
        List<DanceShow> danceShowOfDirector2 = DBDirector.getDanceShowsOfDirector(director2);
////        Director director = DBDanceShow.getDirectorOfShow(danceShow1);
//
        DBDancer.addDancerToDanceShow(ballerina, danceShow1);
        DBDancer.addDancerToDanceShow(contemporaryDancer, danceShow2);
//
        List<DanceShow> dancers = DBDancer.getListOfDanceShowsforDancer(ballerina);
        List<Dancer> cast = DBDanceShow.getCastOfTheShow(danceShow1);

    }
}