package br.com.alura.codechella;

import java.time.LocalDate;

public record EventoDto(Long id,
                        TipoEvento tipo,
                        String nome,
                        String sobreNome,
                        LocalDate data,
                        String descricao) {

    public static EventoDto toDto (Evento evento){
        return new EventoDto(evento.getId(), evento.getTipo(), evento.getNome(),
<<<<<<< HEAD
                evento.getDta(), evento.getDescricao(), evento.getsobreNome());
=======
                evento.getDta(), evento.getDescricao);
>>>>>>> 893737620d21e343781c0e57d03753e80b8e1ebf
    }
}
