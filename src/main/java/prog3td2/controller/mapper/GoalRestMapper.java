package prog3td2.controller.mapper;

import org.springframework.stereotype.Component;
import prog3td2.model.GoalEntity;
import prog3td2.model.response.GoalResponse;

@Component
public class GoalRestMapper {

    public GoalResponse toRest(GoalEntity domain){
        return GoalResponse.builder()
                .time(domain.getTime())
                .scorer(domain.getScorer().getName())
                .isOwnGoal(domain.getIsOwnGoal())
                .build();
    }

}
