package prog3td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import prog3td2.model.SponsorEntity;
import prog3td2.repository.SponsorRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {

    private final SponsorRepository repository;

    public List<SponsorEntity> getTeams(){
        return repository.findAll();
    }

    public List<SponsorEntity> createTeams(List<SponsorEntity> list){
        return repository.saveAll(list);
    }

    public List<SponsorEntity> updateTeams(List<SponsorEntity> list){
        return repository.saveAll(list);
    }

    public void deleteTeamById(Integer id){
         repository.deleteById(id);
    }

    public SponsorEntity getById(Integer id){
        return repository.getById(id);
    }
}
