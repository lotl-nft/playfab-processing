package land.metadefi;

import land.metadefi.model.PlayFabLand;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("rabbitmq:play-fab?queue=PlayFabLand&routingKey=playFab.Land")
            .log("Queue: PlayFabLand")
            .unmarshal().json(JsonLibrary.Gson, PlayFabLand.class)
            .bean("playFabBean", "playFabLand");
    }
}