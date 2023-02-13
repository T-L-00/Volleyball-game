package game.Volleyball.service.playerservice;

import game.Volleyball.model.Player;
import game.Volleyball.repository.PlayerRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.NoSuchElementException;

public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Player createPlayer(@RequestBody Player player) {
        Player newPlayer = new Player();
        newPlayer.setId(player.getId());
        newPlayer.setFullName(player.getFullName());
        newPlayer.setAge(player.getAge());
        newPlayer.setPosition(player.getPosition());
        newPlayer.setExperience(player.getExperience());
        newPlayer.setScoredPoints(player.getScoredPoints());
        newPlayer.setLostPoints(player.getLostPoints());

        return newPlayer;
    }

    @Override
    public Player updatePlayer(Long id, Player player) throws NullPointerException {
        Player existingPlayer = playerRepository.findById(id).orElse(null);

        if(existingPlayer != null) {
            existingPlayer.setFullName(player.getFullName());
            existingPlayer.setAge(player.getAge());
            existingPlayer.setTeam(player.getTeam());
            existingPlayer.setPosition(player.getPosition());
            existingPlayer.setScoredPoints(player.getScoredPoints());
            existingPlayer.setLostPoints(player.getLostPoints());
            playerRepository.save(existingPlayer);
        }
        return existingPlayer;

    }

    @Override
    public void deletePlayer(Long playerId) {
        Player player = playerRepository.findById(playerId).orElseThrow(() ->
                new NoSuchElementException("Player not found for this id :: " + playerId));
        playerRepository.delete(player);
    }
}
