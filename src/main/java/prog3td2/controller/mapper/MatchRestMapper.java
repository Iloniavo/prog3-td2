package prog3td2.controller.mapper;

import org.springframework.stereotype.Component;
import prog3td2.model.MatchEntity;
import prog3td2.model.response.MatchResponse;

@Component
public class MatchRestMapper {

    public MatchResponse toRest (MatchEntity domain){
        return MatchResponse.builder()
                .team_a(domain.getTeam_a().getName())
                .team_b(domain.getTeam_b().getName())
                .date(domain.getDate_time().toLocalDate())
                .time(domain.getDate_time().toLocalTime())
                .build();
    }

}
