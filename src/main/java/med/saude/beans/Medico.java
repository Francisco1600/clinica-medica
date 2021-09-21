package med.saude.beans;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "MEDICO")
public class Medico extends AbstractEntity<Long> {
	
	private String nome;
	private int crm;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}

	
}
