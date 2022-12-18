package prog3td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import prog3td2.model.MatchEntity;
import prog3td2.model.SponsorEntity;
import prog3td2.repository.MatchRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {

    private final MatchRepository repository;

    public List<MatchEntity> getMatchs(){
        return repository.findAll();
    }

    public List<MatchEntity> createMatchs(List<MatchEntity> list){
        return repository.saveAll(list);
    }

    public List<MatchEntity> updateMatchs(List<MatchEntity> list){
        return repository.saveAll(list);
    }

    public void deleteMatchById(Integer id){
        repository.deleteById(id);
    }

    public MatchEntity getById(Integer id){
        return repository.getById(id);
    }

}
