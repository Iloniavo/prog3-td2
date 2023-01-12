package prog3td2.controller.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import prog3td2.model.MatchEntity;
import prog3td2.model.response.MatchResponse;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private final GoalRestMapper goalRestMapper;
    public MatchResponse toRest (MatchEntity domain){
        return MatchResponse.builder()
                .team_a(domain.getTeam_a().getName())
                .team_b(domain.getTeam_b().getName())
                .date(domain.getDate_time().toLocalDate())
                .time(domain.getDate_time().toLocalTime())
                .score_a(domain.getScore_a())
                .score_b(domain.getScore_b())
                .goals(domain.getGoals().stream().map(goalRestMapper::toRest).toList())
                .build();
    }

}
