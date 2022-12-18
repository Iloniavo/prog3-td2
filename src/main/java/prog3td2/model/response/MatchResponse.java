package prog3td2.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MatchResponse {
    private String team_a;
    private String team_b;
    private LocalDate date;
    private LocalTime time;
}
