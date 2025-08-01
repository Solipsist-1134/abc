package some.textfolder.client;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class FolderClient {
    private final WebClient webClient;

    public Flux<String> send(Mono<String> path) {
        return webClient.post()
                .uri("http://localhost:8081/folder/read")
                .body(path, String.class)
                .retrieve()
                .bodyToFlux(String.class);
    }
}
