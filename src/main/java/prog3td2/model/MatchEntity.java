package prog3td2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "game")
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "id_team_a")
    private TeamEntity team_a;

    @OneToOne
    @JoinColumn(name = "id_team_b")
    private TeamEntity team_b;

    @Column(name = "datetime")
    private LocalDateTime date_time;
    private String stadium;

    @Transient
    private int score_a;

    @Transient
    private int score_b;
    //<>
    @OneToMany(mappedBy = "match")
    @JsonIgnore
    private List<GoalEntity> goals;
}




