package prog3td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import prog3td2.model.PlayerEntity;
import prog3td2.model.TeamEntity;
import prog3td2.repository.PlayerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {

    private final PlayerRepository repository;

    public List<PlayerEntity> getPlayers(){
        return repository.findAll();
    }

    public List<PlayerEntity> createTeams(List<PlayerEntity> list){
        return repository.saveAll(list);
    }

    public List<PlayerEntity> updateTeams(List<PlayerEntity> list){
        return repository.saveAll(list);
    }

    public void deleteTeamById(Integer id){
         repository.deleteById(id);
    }

    public PlayerEntity getById(Integer id){
        return repository.getById(id);
    }
}
