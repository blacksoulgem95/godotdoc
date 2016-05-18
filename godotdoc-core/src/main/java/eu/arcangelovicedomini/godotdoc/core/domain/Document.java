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
@Table(name = "DOCUMENT")
public class Document {

	@Id
	@GeneratedValue(generator = "documentGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "documentGenerator", sequenceName = "S_DOCUMENT")
	@Column(name = "ID")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "DOCUMENT_TITLE")
	private String documentTitle;

	public String getDocumentTitle() {
		return documentTitle;
	}

	public void setDocumentTitle(String documentTitle) {
		this.documentTitle = documentTitle;
	}
	
	@Column(name = "DOCUMENT_DESCRIPTION")
	private String documentDescription;
	
	public String getDocumentDescription() {
		return documentDescription;
	}
	
	public void setDocumentDescription(String documentDescription) {
		this.documentDescription = documentDescription;
	}
	
	@OneToMany(mappedBy = "DOCUMENT_ID", targetEntity = DocumentVersion.class)
	private List<DocumentVersion> documentVersions;
	
	public List<DocumentVersion> getDocumentVersions() {
		return documentVersions;
	}
	
	public void setDocumentVersions(List<DocumentVersion> documentVersions) {
		this.documentVersions = documentVersions;
	}
}
