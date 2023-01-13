package prog3td2.controller.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import prog3td2.controller.mapper.TeamRestMapper;
import prog3td2.model.TeamEntity;
import prog3td2.model.response.TeamResponse;
import prog3td2.service.TeamService;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {

    private final TeamService teamService;
    private final TeamRestMapper mapper;
    @GetMapping("/teams")
    public List<TeamResponse> getTeams(){
        return teamService.getTeams().stream().map(mapper::toRest).toList();
    }

    @GetMapping("/teams/{id}")
    public TeamResponse getTeamById(@PathVariable int id){
        return mapper.toRest(teamService.getById(id));
    }
}
