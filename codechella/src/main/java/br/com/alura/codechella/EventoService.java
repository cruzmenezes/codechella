package br.com.alura.codechella;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class EventoService {

    @Autowired
    private EventoRepositary repositario;

    public Flux<EventoDto> obterTodos(){
        return repositario.findAll()
                .map(EventoDto::toDto);
    }

}
