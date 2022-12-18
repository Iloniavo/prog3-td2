package prog3td2.controller.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/matchs")
    public List<MatchResponse> getMatchs(){
        return service.getMatchs().stream().map(mapper::toRest).toList();
    }
}
