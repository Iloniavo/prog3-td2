package prog3td2.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamGoalResponse {
    private int id;
    private String name;
    private int goals;
    private List<GoalResponse> scorers;
}
