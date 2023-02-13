package game.Volleyball.controller;

import game.Volleyball.model.Player;
import game.Volleyball.service.teamservice.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class TeamController {

    private final TeamService teamService;

    @RequestMapping("/generateTeam")
    public List<Player> generateTeam(@RequestBody List<Player> players) {
        return teamService.generateTeam(players);
    }
}
