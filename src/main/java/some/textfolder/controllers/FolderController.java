package some.textfolder.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import some.textfolder.client.FolderClient;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class FolderController {
    private final FolderClient folderClient;

    @PostMapping("/folder")
    public Flux<String> getFolder(@RequestBody Mono<String> path) {
        return folderClient.send(path).map(x -> {
                    return x + " ";
                })
                .doOnNext(System.out::println);
    }


}
