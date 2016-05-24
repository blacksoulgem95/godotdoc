package eu.arcangelovicedomini.godotdoc.core.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "USER")
public class User {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "userGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "userGenerator", sequenceName = "S_USER")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
