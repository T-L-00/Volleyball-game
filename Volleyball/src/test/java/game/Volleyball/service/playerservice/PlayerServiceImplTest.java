package game.Volleyball.service.playerservice;

import game.Volleyball.model.Player;
import game.Volleyball.model.Team;
import game.Volleyball.repository.PlayerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
    public class PlayerServiceImplTest {

        @Mock
        PlayerService playerService;
        PlayerRepository playerRepository;

        @Before
        public void setUp() {
            MockitoAnnotations.openMocks(this);
            playerService = new PlayerServiceImpl(playerRepository);
        }

        @Test
        public void createPlayer() {
            Player player1 = playerService.createPlayer(new Player());
            Player player2 = playerService.createPlayer(new Player());

            Assert.assertNotNull(player1);
            Assert.assertNotNull(player2);
        }


/*
    @Test
    public void updatePlayer() {
    Long id = 1L;
    Long id2 = 2L;
    Player updatePlayer = new Player(id, "Dragana Pekić", "Setter", 25, 12, 48, 21, new Team());
        Player updatePlayer2 = new Player(id2, "Ivana Igić", "Opposite", 29, 17, 126, 47, new Team());

        playerRepository.save(updatePlayer);
        playerRepository.save(updatePlayer2);

        Mockito.when(playerRepository.findById(id)).thenReturn(Optional.of(updatePlayer));
        Mockito.when(playerRepository.findById(id2)).thenReturn(Optional.of(updatePlayer2));

        Assert.assertNotNull(updatePlayer);
        Assert.assertNotNull(updatePlayer2);

    }

    @Test
    public void deletePlayer() {
        Player existingPlayer = new Player(1L, "Dragana Pekić", "Setter", 24, 11, 43, 19, new Team());
        playerRepository.save(existingPlayer);
        Long id = existingPlayer.getId();
        playerRepository.deleteById(id);

        Optional<Player> deletedPlayer = playerRepository.findById(id);

        Assert.assertTrue(deletedPlayer.isPresent());

    }
*/
    
}