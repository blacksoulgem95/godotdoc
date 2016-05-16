package eu.arcangelovicedomini.godotdoc.core.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DOCUMENT_VERSION")
public class DocumentVersion {

	@Id
	@Column(name = "DOCUMENT_VERSION_ID")
	@GeneratedValue(generator = "documentVersionGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "documentVersionGenerator", sequenceName = "S_DOCUMENT_VERSION")
	private Long documentVersionId;
	
	public Long getDocumentVersionId() {
		return documentVersionId;
	}
	
	public void setDocumentVersionId(Long documentVersionId) {
		this.documentVersionId = documentVersionId;
	}
	
	@ManyToOne(optional = false)
	@Column(name = "DOCUMENT_ID")
	private Document document;
	
	public Document getDocument() {
		return document;
	}
	
	public void setDocument(Document document) {
		this.document = document;
	}
	
	@OneToOne(mappedBy = "successiveVersion", targetEntity = DocumentVersion.class)
	@Column(name = "PREC_VERSION_ID")
	private DocumentVersion precedentVersion;
	
	public DocumentVersion getPrecedentVersion() {
		return precedentVersion;
	}
	
	public void setPrecedentVersion(DocumentVersion precedentVersion) {
		this.precedentVersion = precedentVersion;
	}
	

	@OneToOne(mappedBy = "precedentVersion", targetEntity = DocumentVersion.class)
	@Column(name = "SUCC_VERSION_ID")
	private DocumentVersion successiveVersion;
	
	public DocumentVersion getSuccessiveVersion() {
		return successiveVersion;
	}
	
	public void setSuccessiveVersion(DocumentVersion successiveVersion) {
		this.successiveVersion = successiveVersion;
	}
	
	@Column(name = "CHANGE_LOG")
	private String changeLog;
	
	public String getChangeLog() {
		return changeLog;
	}
	
	public void setChangeLog(String changeLog) {
		this.changeLog = changeLog;
	}
	
	@Column(name = "VERSION_TITLE")
	private String versionTitle;
	
	public String getVersionTitle() {
		return versionTitle;
	}
	
	public void setVersionTitle(String versionTitle) {
		this.versionTitle = versionTitle;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VERSION_START_DATE")
	private Date versionStartDate;
	
	public Date getVersionStartDate() {
		return versionStartDate;
	}
	
	public void setVersionStartDate(Date versionStartDate) {
		this.versionStartDate = versionStartDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VERSION_END_DATE")
	private Date versionEndDate;
	
	public Date getVersionEndDate() {
		return versionEndDate;
	}
	
	public void setVersionEndDate(Date versionEndDate) {
		this.versionEndDate = versionEndDate;
	}
	
	@Column(name = "VERSION_NOTES")
	private String versionNotes;
	
	public String getVersionNotes() {
		return versionNotes;
	}
	
	public void setVersionNotes(String versionNotes) {
		this.versionNotes = versionNotes;
	}
	
	@Column(name = "FILE")
	private byte[] file;
	
	public byte[] getFile() {
		return file;
	}
	
	public void setFile(byte[] file) {
		this.file = file;
	}
}
