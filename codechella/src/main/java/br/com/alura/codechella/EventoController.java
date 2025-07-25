package br.com.alura.codechella;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.awt.*;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoRepositary repositary;


    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Evento> obterTodos(){
        return repositary.findAll();
    }

}
