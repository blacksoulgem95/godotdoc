package eu.arcangelovicedomini.godotdoc.core.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ATTRIBUTE_APPLICATION")
public class AttributeApplication {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "attributeApplicationGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "attributeApplicationGenerator", sequenceName = "S_ATTRIBUTE_APPLICATION")
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "NUMBER_VALUE")
	private Long numberValue;
	
	public Long getNumberValue() {
		return numberValue;
	}
	
	public void setNumberValue(Long numberValue) {
		this.numberValue = numberValue;
	}
	
	@Column(name = "DECIMAL_VALUE")
	private Double decimalValue;
	
	public Double getDecimalValue() {
		return decimalValue;
	}
	
	public void setDecimalValue(Double decimalValue) {
		this.decimalValue = decimalValue;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATETIME_VALUE")
	private Date dateTimeValue;
	
	public Date getDateTimeValue() {
		return dateTimeValue;
	}
	
	public void setDateTimeValue(Date dateTimeValue) {
		this.dateTimeValue = dateTimeValue;
	}
	
	@Column(name = "ATTRIBUTE_ID")
	@ManyToOne(optional = false, targetEntity = Attribute.class)
	private Attribute attribute;
	
	public Attribute getAttribute() {
		return attribute;
	}
	
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	@Column(name = "DOCUMENT_ID")
	@ManyToOne(optional = false, targetEntity = DocumentVersion.class)
	private DocumentVersion document;
	
	public DocumentVersion getDocument() {
		return document;
	}
	
	public void setDocument(DocumentVersion document) {
		this.document = document;
	}
}
