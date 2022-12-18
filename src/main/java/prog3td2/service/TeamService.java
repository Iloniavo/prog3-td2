package prog3td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import prog3td2.model.TeamEntity;
import prog3td2.repository.TeamRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    public List<TeamEntity> getTeams(){
        return teamRepository.findAll();
    }

    public List<TeamEntity> createTeams(List<TeamEntity> list){
        return teamRepository.saveAll(list);
    }

    public List<TeamEntity> updateTeams(List<TeamEntity> list){
        return teamRepository.saveAll(list);
    }

    public void deleteTeamById(Integer id){
         teamRepository.deleteById(id);
    }

    public TeamEntity getById(Integer id){
        return teamRepository.getById(id);
    }
}
