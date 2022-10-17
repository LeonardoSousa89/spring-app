package admin.adminapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="mutantes")
public class Mutantes implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pais;
	private String uf;
	private String cidade;
	private String nome;
	private String habilidade;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Administrator id_mutantes;
	
	public Mutantes() {}
	    
	
    public Mutantes(Long id, String pais, String uf, String cidade, String nome, String habilidade, Administrator id_mutantes) {
        this.id = id;
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.nome = nome;
        this.habilidade = habilidade;
        this.id_mutantes = id_mutantes;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
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
		Mutantes other = (Mutantes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
}
