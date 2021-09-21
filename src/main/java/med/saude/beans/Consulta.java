package med.saude.beans;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "CONSULTAS")
public class Consulta extends AbstractEntity<Long>{
	Especialidade especialidade;
	Medico medicos;

}
