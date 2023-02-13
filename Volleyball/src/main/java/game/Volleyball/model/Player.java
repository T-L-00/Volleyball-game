package game.Volleyball.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String position;
    private int age;
    private int experience;
    private int scoredPoints;
    private int lostPoints;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
