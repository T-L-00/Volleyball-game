package game.Volleyball.model;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.NoSuchElementException;


@RunWith(SpringRunner.class)
public class PlayerTest {

    Player player;

    private final ErrorCollector ec = new ErrorCollector();

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void getId() {
        Long id = 1L;
        player.setId(1L);
        Assert.assertEquals(id, player.getId());
    }

    @Test
    public void getFullName() {
        String fullName = "Ivana Mikić";
        player.setFullName("Ivana Mikić");
        Assert.assertEquals(fullName, player.getFullName());
    }

    @Test
    public void getPosition() {
        String position = "Setter";
        player.setPosition("Receiver");
        Assert.assertNotEquals(position, player.getFullName());
    }

    @Test
    public void getAge() {
        int age = 24;
        player.setAge(24);
        Assert.assertEquals(age, player.getAge());
    }

    @Test
    public void getExperience() {
        int experience = 13;
        player.setExperience(13);
        Assert.assertEquals(experience, player.getExperience());
    }

    @Test
    public void getScoredPoints() {
        int scoredPoints = 68;
        player.setScoredPoints(68);
        Assert.assertEquals(scoredPoints, player.getScoredPoints());
    }

    @Test
    public void getLostPoints() {
        int lostPoints = 26;
        player.setLostPoints(26);
        Assert.assertEquals(lostPoints, player.getLostPoints());
    }

    @Test
    public void setId() {
        Long expected = 1L;
        try {
            Assert.assertNotEquals(expected, player.getId());
        }
        catch (Exception e) {
            ec.addError(e);
        }

        player.setId(1L);
        Long actual = 1L;
        expected =player.getId();
        try {
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            ec.addError(e);
        }
    }

    @Test
    public void setFullName() {
        String fullName = "Dijana Jokić";
        try {
            Assert.assertNotEquals(fullName, player.getFullName());
        } catch (NullPointerException npe) {
            ec.addError(npe);
        }
        player.setFullName("Dragana Jokić");
        String actual = "Dragana Jokić";
        try {
            Assert.assertEquals(actual, player.getFullName());
        } catch (NoSuchElementException nse) {
            ec.addError(nse);
        }
    }

    @Test
    public void setPosition() {
        String position = "Setter";
        try {
            Assert.assertNotEquals(position, player.getPosition());
        } catch (NullPointerException npe) {
            ec.addError(npe);
        }
        player.setPosition("Setter");
        String actual = "Setter";
        try {
            Assert.assertEquals(actual, player.getPosition());
        } catch (NoSuchElementException nse) {
            ec.addError(nse);
        }
    }

    @Test
    public void setAge() {
        int age = 24;
        try {
            Assert.assertNotEquals(age, player.getAge());
        } catch (NullPointerException npe) {
            ec.addError(npe);
        }
        player.setAge(24);
        int actual = 24;
        try {
            Assert.assertEquals(actual, player.getAge());
        } catch (NoSuchElementException nse) {
            ec.addError(nse);
        }
    }

    @Test
    public void setExperience() {
        int experience = 13;
        try {
            Assert.assertNotEquals(experience, player.getExperience());
        } catch (NullPointerException npe) {
            ec.addError(npe);
        }
        player.setExperience(13);
        int actual = 13;
        try {
            Assert.assertEquals(actual, player.getExperience());
        } catch (NoSuchElementException nse) {
            ec.addError(nse);
        }
    }

    @Test
    public void setScoredPoints() {
        int scoredPoints = 72;
        try {
            Assert.assertNotEquals(scoredPoints, player.getScoredPoints());
        } catch (NullPointerException npe) {
            ec.addError(npe);
        }
        player.setScoredPoints(72);
        int actual = 72;
        try {
            Assert.assertEquals(actual, player.getScoredPoints());
        } catch (NoSuchElementException nse) {
            ec.addError(nse);
        }
    }

    @Test
    public void setLostPoints() {
        int lostPoints = 18;
        try {
            Assert.assertNotEquals(lostPoints, player.getLostPoints());
        } catch (NullPointerException npe) {
            ec.addError(npe);
        }
        player.setLostPoints(18);
        int actual =18;
        try {
            Assert.assertEquals(actual, player.getLostPoints());
        } catch (NoSuchElementException nse) {
            ec.addError(nse);
        }
    }
}