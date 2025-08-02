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

    public String getDescricao;
    @Getter
    @Setter

    @Id
    private Long id;
    private TipoEvento tipo;
    private String nome;
    private String sobreNome;
    private LocalDate data;
    private String descricao;

    public LocalDate getDta() {
    }

    public TipoEvento getTipo() {
    }

    public String getNome() {
        return nome;
    }

    public Object getDescricao() {
    }

    public Object getsobreNome() {
    }
}
