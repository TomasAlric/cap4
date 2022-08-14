package br.com.fiap.smartcities.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_mercado")
public class Mercado {

    @Id
    @Column(name = "id_mercado")
    private Long id;

    @Column(name = "nome_mercado", nullable = false)
    private String nome;

    @Column(name = "ds_cnpj", nullable = false, unique = true)
    private String cnpj;

    @Column(name = "numero_funcionarios")
    private int numeroFuncionarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
}
