package game.Volleyball.service.playerservice;

import game.Volleyball.model.Player;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService {

    Player createPlayer(Player player);
    Player updatePlayer(Long id, Player player);
    void deletePlayer(Long playerId);
}
