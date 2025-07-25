package br.com.alura.codechella;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@Table
public class Evento {

    @Getter
    @Setter

    @Id
    private Long id;
    private TipoEvento tipo;
    private String nome;
    private LocalDate data;
    private String descricao;

}
