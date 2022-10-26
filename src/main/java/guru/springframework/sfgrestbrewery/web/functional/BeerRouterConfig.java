package guru.springframework.sfgrestbrewery.web.functional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class BeerRouterConfig {
    public static final String BEER_V2_PATH = "/api/v2/beer/";
    public static final String BEER_V2_PATH_UPC = "/api/v2/beerUpc/";

    @Bean
    public RouterFunction<ServerResponse> beerRoutesV2(BeerHandlerV2 handler) {
        return route()
                .GET(BEER_V2_PATH + "{beerId}", accept(APPLICATION_JSON), handler::getBeerById)
                .GET(BEER_V2_PATH_UPC + "{upc}",accept(APPLICATION_JSON), handler::getBeerByUPC)
                .build();
    }

}
