package prog3td2.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class GoalResponse {
    private int minutes;
    private PlayerResponse player;
    private boolean isOwnGoal;
}
