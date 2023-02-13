package game.Volleyball.service.teamservice;

import game.Volleyball.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {

    List<Player> generateTeam(List<Player> players);
}
