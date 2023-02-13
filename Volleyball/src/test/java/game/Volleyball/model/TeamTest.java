package game.Volleyball.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.NoSuchElementException;

@RunWith(SpringRunner.class)
public class TeamTest {

    Team team;

    private final ErrorCollector ec = new ErrorCollector();

    @Before
    public void setUp() {
        team = new Team();
    }

    @Test
    public void getId() {
        Long id = 1L;
        team.setId(1L);
        Assert.assertEquals(id, team.getId());
    }

    @Test
    public void getName() {
        String name = "FirstTeam";
        team.setName("FirstTeam");
        Assert.assertEquals(name, team.getName());
    }

    @Test
    public void setId() {
        Long expected = 1L;
        try {
            Assert.assertNotEquals(expected, team.getId());
        }
        catch (Exception e) {
            ec.addError(e);
        }

        team.setId(1L);
        Long actual = 1L;
        expected =team.getId();
        try {
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            ec.addError(e);
        }
    }

    @Test
    public void setName() {
        String fullName = "Dijana Jokić";
        try {
            Assert.assertNotEquals(fullName, team.getName());
        } catch (NullPointerException npe) {
            ec.addError(npe);
        }
        team.setName("Dragana Jokić");
        String actual = "Dragana Jokić";
        try {
            Assert.assertEquals(actual, team.getName());
        } catch (NoSuchElementException nse) {
            ec.addError(nse);
        }
    }
}