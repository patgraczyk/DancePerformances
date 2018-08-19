import models.Choreographer;
import models.DanceShow;
import models.Dancers.BalletDancer;
import models.Dancers.ContemporaryDancer;
import models.Dancers.DanceType;
import models.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestDanceShow {

    DanceShow danceShow1;
    DanceShow danceShow2;
    Director director1;
    BalletDancer ballerina;
    Choreographer choreographer1;
    ContemporaryDancer contemporaryDancer;



    @Before
    public void before(){
        danceShow1 = new DanceShow("Swan Lake", 400, director1);
        danceShow2 = new DanceShow("Highland Fling",10, director1);
        director1 = new Director("James Malone");
        ballerina = new BalletDancer("Ana", "Ballerina", 5, DanceType.BALLET, 120, choreographer1);
        contemporaryDancer = new ContemporaryDancer("Digory", "Moomin", 8, DanceType.COMMERCIAL, 430, choreographer1);

    }

    @Test
    public void hasTitle(){
        assertEquals("Swan Lake", danceShow1.getTitle());
    }

    @Test
    public void hasBudget(){
        assertEquals(400, danceShow1.getBudget());
    }

    @Test
    public void hasDirector(){
        assertEquals("James Malone", director1.getDirectorName());
    }

    @Test
    public void canPayDancer(){
        assertEquals(true, danceShow1.payDancer(ballerina, ballerina.getSalary()));
    }

    @Test
    public void cannotPayDancers(){
        assertEquals(false, danceShow2.payDancer(contemporaryDancer, contemporaryDancer.getSalary()) );
    }

}
