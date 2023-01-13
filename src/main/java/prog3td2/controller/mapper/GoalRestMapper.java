package prog3td2.controller.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import prog3td2.model.GoalEntity;
import prog3td2.model.response.GoalResponse;

@Component
@AllArgsConstructor
public class GoalRestMapper {

    private final PlayerRestMapper playerRestMapper;

    public GoalResponse toRest(GoalEntity domain){
        return GoalResponse.builder()
                .minutes(domain.getTime())
                .player(playerRestMapper.toRest(domain.getScorer()))
                .isOwnGoal(domain.getIsOwnGoal())
                .build();
    }

}
