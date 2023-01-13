package prog3td2.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MatchResponse {
    private int id;
    private TeamGoalResponse team_a;
    private TeamGoalResponse team_b;
    private LocalDate date;
    private LocalTime time;

    private int score_a;
    private int score_b;
}
