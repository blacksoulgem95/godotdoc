package eu.arcangelovicedomini.godotdoc.core.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@Column(name = "ATTRIBUTE_CODE")
	private String attributeCode;
	
	public String getAttributeCode() {
		return attributeCode;
	}
	
	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}
	
	/**
	 * I18N key for the description
	 * Since an attribute can be used from various users
	 * from different organizations* which will may use
	 * different languages, with a key you can use the same attribute
	 * and show it's name in the user language
	 * 
	 * *Org System will probably not be implemented in v1.0.0 but
	 * it's programmed for at least the v2.0.0
	 */
	@Column(name = "ATTRIBUTE_DESCRIPTION_KEY")
	private String attributeDescriptionKey;
	
	public String getAttributeDescriptionKey() {
		return attributeDescriptionKey;
	}
	
	public void setAttributeDescriptionKey(String attributeDescriptionKey) {
		this.attributeDescriptionKey = attributeDescriptionKey;
	}
	
	@OneToMany(mappedBy = "ATTRIBUTE_ID", targetEntity = LocalAttributeName.class)
	private List<LocalAttributeName> localAttributeNames;
	
	public List<LocalAttributeName> getLocalAttributeNames() {
		return localAttributeNames;
	}
	
	public void setLocalAttributeNames(List<LocalAttributeName> localAttributeNames) {
		this.localAttributeNames = localAttributeNames;
	}
	
}
