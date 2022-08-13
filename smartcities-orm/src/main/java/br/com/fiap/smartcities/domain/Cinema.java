package br.com.fiap.smartcities.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_cinema")
public class Cinema {

    @Id
    @SequenceGenerator(name = "cinema", sequenceName = "sq_tbl_cinema", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filme")
    private Long id;

    @Column(name = "nome_filme", length = 60)
    private String filme;

    @Column(name = "nome_sala")
    private String sala;

    @Column(name = "vl_preco")
    private Double preco;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_filme")
    private LocalDate dataFilme;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getDataFilme() {
        return dataFilme;
    }

    public void setDataFilme(LocalDate dataFilme) {
        this.dataFilme = dataFilme;
    }
}
