package crud;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PublicationData",schema = "data")
public class Publication {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long publicationId;
	private String publicationName,country,city;
	@OneToOne
	private Book book;
	
	public Long getPublicationId() {
		return publicationId;
	}
	public void setPublicationId(Long publicationId) {
		this.publicationId = publicationId;
	}
	public String getPublicationName() {
		return publicationName;
	}
	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((publicationId == null) ? 0 : publicationId.hashCode());
		result = prime * result + ((publicationName == null) ? 0 : publicationName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publication other = (Publication) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (publicationId == null) {
			if (other.publicationId != null)
				return false;
		} else if (!publicationId.equals(other.publicationId))
			return false;
		if (publicationName == null) {
			if (other.publicationName != null)
				return false;
		} else if (!publicationName.equals(other.publicationName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Publication [publicationId=" + publicationId + ", publicationName=" + publicationName + ", country="
				+ country + ", city=" + city + "]";
	}
	
}
