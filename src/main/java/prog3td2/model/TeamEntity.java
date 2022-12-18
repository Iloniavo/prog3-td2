package prog3td2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Comparator;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "team")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "have",
            joinColumns = @JoinColumn(name = "id_sponsor"),
            inverseJoinColumns = @JoinColumn(name = "id_team")
    )
    private List<SponsorEntity> sponsors;
    @OneToMany(mappedBy = "team")
    @JsonIgnore
    private List<PlayerEntity> players;

    public List<PlayerEntity> players(){
        Comparator<PlayerEntity> comparedByNumber = Comparator.comparingInt(PlayerEntity::getNumber);
        getPlayers().sort(comparedByNumber);
        return getPlayers();
    }

}
