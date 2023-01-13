package prog3td2.controller.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import prog3td2.model.GoalEntity;
import prog3td2.model.MatchEntity;
import prog3td2.model.TeamEntity;
import prog3td2.model.response.GoalResponse;
import prog3td2.model.response.MatchResponse;
import prog3td2.model.response.TeamGoalResponse;

import java.util.List;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private final GoalRestMapper goalRestMapper;

    public TeamGoalResponse toGoal(List<GoalEntity> goals, TeamEntity team){
        int goal = goals.size();
        return TeamGoalResponse.builder()
                .id(team.getId())
                .name(team.getName())
                .scorers(goals.stream().map(goalRestMapper::toRest).toList())
                .goals(goal)
                .build();
    };
    public MatchResponse toRest (MatchEntity domain){
        return MatchResponse.builder()
                .id(domain.getId())
                .team_a(toGoal(domain.goalsA(), domain.getTeam_a()))
                .team_b(toGoal(domain.goalsB(), domain.getTeam_b()))
                .date(domain.getDate_time().toLocalDate())
                .time(domain.getDate_time().toLocalTime())
                .build();
    }

}
