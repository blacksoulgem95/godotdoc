package eu.arcangelovicedomini.godotdoc.core.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "LANGUAGE")
public class Language {

	@Id
	@Column(name = "LANGUAGE_CODE")
	private String languageCode;
	
	public String getLanguageCode() {
		return languageCode;
	}
	
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	
	@Column(name = "LOCALIZED_NAME")
	private String localizedName;
	
	public String getLocalizedName() {
		return localizedName;
	}
	
	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}
	
	@Column(name = "ENGLISH_NAME")
	private String englishName;
	
	public String getEnglishName() {
		return englishName;
	}
	
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	
}
