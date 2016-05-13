package eu.arcangelovicedomini.godotdoc.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DOCUMENT")
public class Document {

	@Id
	@GeneratedValue(generator = "documentGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "documentGenerator", sequenceName = "S_DOCUMENT")
	@Column(name = "DOCUMENT_ID")
	private Long documentId;
	
	public Long getDocumentId() {
		return documentId;
	}
	
	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}
}
