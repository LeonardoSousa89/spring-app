package admin.adminapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "admin")
public class Administrator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idadmin;
	private String nome;
	
	@Column(unique = true)
	private String email;
	
	private String senha;
	
	//se inserir essa assinatura[@JsonIgnore] na classe mutantes, ele envia o objeto de referência como nulo não associando as classes.
	@JsonIgnore
	@OneToMany(mappedBy = "id_admin")
	private Set<Mutantes> registroDeMutantes=new HashSet<>();
	
	public Administrator() {}

	public Administrator(Long idadmin, String nome, String email, String senha) {
		this.idadmin = idadmin;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Long getIdadmin() {
		return idadmin;
	}

	public void setIdadmin(Long idadmin) {
		this.idadmin = idadmin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public Set<Mutantes> getRegistroDeMutantes() {
		return registroDeMutantes;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idadmin == null) ? 0 : idadmin.hashCode());
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
		Administrator other = (Administrator) obj;
		if (idadmin == null) {
			if (other.idadmin != null)
				return false;
		} else if (!idadmin.equals(other.idadmin))
			return false;
		return true;
	}
	
}
