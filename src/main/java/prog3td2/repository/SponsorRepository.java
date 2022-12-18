package prog3td2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prog3td2.model.SponsorEntity;

@Repository
public interface SponsorRepository extends JpaRepository<SponsorEntity, Integer> {
}
