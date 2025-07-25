package br.com.alura.codechella;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EventoRepositary extends ReactiveCrudRepository<Evento, Long> {
}
