package br.com.exercicio.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//Parte da semana 12
@Entity
@Table (name = "tb_placa")
public class Placa {
	@Id
	@Column (nullable=false, length = 200)
	private Long id;
	@Column (nullable=false, length = 200)
	private String cidade;
	
	@OneToOne(mappedBy = "veiculo")
	
	
	public Long getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Placa other = (Placa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
