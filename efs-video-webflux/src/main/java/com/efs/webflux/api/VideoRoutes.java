package com.efs.webflux.api;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class VideoRoutes {
	
	@Bean
    RouterFunction<ServerResponse> videoEndPoint(VideoRouteHandler videoRouteHandler) {
        return route().nest(path("/videos"), builder -> builder
                .nest(path("/{name}"), videoBuilder -> videoBuilder
                        .GET("", videoRouteHandler::getVideoByName)
                )
        ).build();
    }

}
