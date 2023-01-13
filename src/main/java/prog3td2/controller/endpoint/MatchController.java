package prog3td2.controller.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import prog3td2.controller.mapper.MatchRestMapper;
import prog3td2.model.response.MatchResponse;
import prog3td2.service.MatchService;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {

    private final MatchService service;
    private final MatchRestMapper mapper;

    @GetMapping("/matches")
    public List<MatchResponse> getMatches(){
        return service.getMatchs().stream().map(mapper::toRest).toList();
    }

    @GetMapping("/matches/{id}")
    public MatchResponse getMatchById(@PathVariable int id){
        return mapper.toRest(service.getById(id));
    }
}
