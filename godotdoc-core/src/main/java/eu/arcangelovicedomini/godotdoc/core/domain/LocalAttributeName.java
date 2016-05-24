package eu.arcangelovicedomini.godotdoc.core.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "LOCAL_ATTRIBUTE_NAME")
public class LocalAttributeName {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "attributeNameGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "attributeNameGenerator", sequenceName = "S_ATTRIBUTE_NAME")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "ATTRIBUTE_ID")
	@ManyToOne(targetEntity = Attribute.class, optional = false)
	private Attribute attribute;

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	@Column(name = "NAME")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
