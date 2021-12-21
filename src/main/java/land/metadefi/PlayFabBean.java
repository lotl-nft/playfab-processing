package land.metadefi;

import io.quarkus.runtime.annotations.RegisterForReflection;
import land.metadefi.model.PlayFabLand;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Slf4j
@Named("playFabBean")
@RegisterForReflection
@ApplicationScoped
public class PlayFabBean {

    public void playFabLand(PlayFabLand event) {
//        log.info("ID: {}", event.getId());
//        log.info("Type: {}", event.getType());
    }
}
