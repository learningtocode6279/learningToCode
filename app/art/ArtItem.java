package art;

import java.time.LocalDate;

public class ArtItem {
	private String name;
	private String sourceUrl;
	private LocalDate date;

	public ArtItem(String name, String sourceUrl, LocalDate date) {
		this.name = name;
		this.sourceUrl = sourceUrl;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
