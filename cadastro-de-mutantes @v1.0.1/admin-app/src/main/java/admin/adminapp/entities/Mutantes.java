package admin.adminapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mutantes")
public class Mutantes implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_mutante;	
	
	private String pais;
	private String uf;
	private String cidade;
	private String nome;
	private String habilidade;
	
	@ManyToOne
	@JoinColumn(name = "id_admin")
	private Administrator id_admin;
	
	public Mutantes() {}

	public Mutantes(Long id_mutante, String pais, String uf, String cidade, String nome, String habilidade,
			Administrator id_admin) {
		this.id_mutante = id_mutante;
		this.pais = pais;
		this.uf = uf;
		this.cidade = cidade;
		this.nome = nome;
		this.habilidade = habilidade;
		this.id_admin = id_admin;
	}

	public Long getId_mutante() {
		return id_mutante;
	}

	public void setId_mutante(Long id_mutante) {
		this.id_mutante = id_mutante;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public Administrator getId_admin() {
		return id_admin;
	}

	public void setId_admin(Administrator id_admin) {
		this.id_admin = id_admin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_mutante == null) ? 0 : id_mutante.hashCode());
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
		Mutantes other = (Mutantes) obj;
		if (id_mutante == null) {
			if (other.id_mutante != null)
				return false;
		} else if (!id_mutante.equals(other.id_mutante))
			return false;
		return true;
	}
	
}
