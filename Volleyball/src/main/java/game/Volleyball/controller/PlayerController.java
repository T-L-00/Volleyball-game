package game.Volleyball.controller;

import game.Volleyball.model.Player;
import game.Volleyball.repository.PlayerRepository;
import game.Volleyball.service.playerservice.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
@RequestMapping("/players")
public class PlayerController {
    private PlayerRepository playerRepository;
    private PlayerService playerService;

    //create new player
    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    //update existing player
    @PutMapping("/updatePlayer/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable("id") Long id, @RequestBody Player player) {
        return ResponseEntity.ok(playerService.updatePlayer(id, player));
    }

    //Find all players from repository
    @GetMapping
    public List<Player> findAllPlayers() {
        return (List<Player>) playerRepository.findAll();
    }


    //Get each player by id
    @GetMapping("/{id}")
    public ResponseEntity<Player> findById(@PathVariable(value = "id") long id) {
        Optional<Player> player = playerRepository.findById(id);

        return player.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //delete existing player
    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable Long playerId) {
        playerService.deletePlayer(playerId);
    }
}

