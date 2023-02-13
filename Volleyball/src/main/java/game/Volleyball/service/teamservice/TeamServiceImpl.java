package game.Volleyball.service.teamservice;

import game.Volleyball.model.Player;
import game.Volleyball.repository.TeamRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
public class TeamServiceImpl implements TeamService{

    TeamRepository teamRepository;

    @Override
    public List<Player> generateTeam(List<Player> teamList) {
         return teamList.stream()
                .sorted(Comparator.comparing(Player::getExperience).reversed()
                .thenComparing(Player::getPosition)
                .thenComparing(Player::getScoredPoints))
                .distinct()
                .limit(6)
                .toList();
    }

}
