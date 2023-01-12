package prog3td2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "goals")
public class GoalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "score_time")
    private int time;
    @ManyToOne
    private PlayerEntity scorer;

    @Column(name="is_own_goal")
    private Boolean isOwnGoal;

    @ManyToOne
    @JoinColumn(name = "id_match")
    private MatchEntity match;

}
