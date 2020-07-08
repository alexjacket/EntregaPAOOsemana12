package br.com.exercicio.model.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//Parte da semana 12
@Entity
@Table (name="tb_pessoa")
public class Pessoa {

	@Id
	@Column (nullable=false, length = 200)
	private Long identificacao;
	@Column (nullable=false, length = 100)
	private String nome;
	
	@OneToMany (mappedBy = "veiculo", cascade = CascadeType.ALL)
	
	
	public Long getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(Long identificacao) {
		this.identificacao = identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
