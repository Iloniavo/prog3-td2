package prog3td2.controller.mapper;

import org.springframework.stereotype.Component;
import prog3td2.model.PlayerEntity;
import prog3td2.model.response.PlayerResponse;

@Component
public class PlayerRestMapper {

    public PlayerResponse toRest(PlayerEntity domain){
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

}
