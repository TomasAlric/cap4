package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tbl_estabelecimento")
public class Estabelecimento {

	@Id
	@SequenceGenerator(name="estabelecimento",sequenceName="sq_tbl_estabelecimento",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="estabelecimento")
	@Column(name = "id_estabelecimento")
	private Integer id;

	@Column(name = "nome_estabelecimento", length = 50)
	private String nome;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_criacao")
	private Calendar dataCriacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
}