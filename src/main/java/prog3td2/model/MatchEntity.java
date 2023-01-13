package prog3td2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import prog3td2.model.response.GoalResponse;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @ManyToOne
    @JoinColumn(name = "id_team_a")
    private TeamEntity team_a;

    @ManyToOne
    @JoinColumn(name = "id_team_b")
    private TeamEntity team_b;

    @Column(name = "datetime")
    private LocalDateTime date_time;
    private String stadium;

    public int scoreA(){
       return goalsA().size();
    }

    public int scoreB(){
        return goalsB().size();
    }
    //<>
    @OneToMany(mappedBy = "match")
    @JsonIgnore
    private List<GoalEntity> AllGoals;

    public List<GoalEntity> goalsA(){
        List<GoalEntity> list = new ArrayList<>();
        for(GoalEntity goal : AllGoals){
            if( (!goal.getIsOwnGoal() || goal.getScorer().getTeam() == team_a) && (goal.getIsOwnGoal() || goal.getScorer().getTeam() == team_b) ){
                list.add(goal);
            }
        } return list;
    };

    public List<GoalEntity> goalsB(){
        List<GoalEntity> list = new ArrayList<>();
        for(GoalEntity goal : AllGoals){
            if( (!goal.getIsOwnGoal() || goal.getScorer().getTeam() == team_b) && (goal.getIsOwnGoal() || goal.getScorer().getTeam() == team_a) ){
                list.add(goal);
            }
        } return list;
    };

}




