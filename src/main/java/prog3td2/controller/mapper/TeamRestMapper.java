package prog3td2.controller.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import prog3td2.model.TeamEntity;
import prog3td2.model.response.TeamResponse;

@Component
@AllArgsConstructor
public class TeamRestMapper {

    private final PlayerRestMapper playerRestMapper;
    public TeamResponse toRest(TeamEntity domain){
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .players(domain.players().stream().map(playerRestMapper::toRest).toList())
                .sponsors(domain.getSponsors())
                .build();
    }
}
