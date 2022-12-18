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
}
