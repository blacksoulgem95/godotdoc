package eu.arcangelovicedomini.godotdoc.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ATTRIBUTE")
public class Attribute {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "attributeGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "attributeGenerator", sequenceName = "S_ATTRIBUTE")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
