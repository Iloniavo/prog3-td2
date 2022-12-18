package prog3td2.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import prog3td2.model.PlayerEntity;
import prog3td2.model.SponsorEntity;
import prog3td2.model.TeamEntity;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponse {
    private int id;
    private String name;
    private List<PlayerResponse> players;
    private List<SponsorEntity> sponsors;
}
