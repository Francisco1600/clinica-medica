package med.saude.beans;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "PACIENTE")
public class Paciente extends AbstractEntity<Long>{
	
	private String nome;
	private String comorbidade;
	private int matricula;
	private int dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComorbidade() {
		return comorbidade;
	}
	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
