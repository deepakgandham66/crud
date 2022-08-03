package crud;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="AuthorData")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long authorid;
	@Column(columnDefinition = "author name",
			insertable = true,
			length=50,
			name="Author_Name",
			nullable=true,
			precision=2,
			scale=1,
			table="AuthorData",
			unique=false,
			updatable=true)
	private String authorName;
	private String country;
	private String city;
	@OneToMany(mappedBy = "authors",cascade = CascadeType.ALL,
			targetEntity = Phone.class, fetch=FetchType.LAZY,
			orphanRemoval = true)
	private List<Phone> phones;
	public Long getAuthorid() {
		return authorid;
	}
	public void setAuthorid(Long authorid) {
		this.authorid = authorid;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((authorid == null) ? 0 : authorid.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		Author other = (Author) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (authorid == null) {
			if (other.authorid != null)
				return false;
		} else if (!authorid.equals(other.authorid))
			return false;
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
		return true;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorName=" + authorName + ", country=" + country + ", city=" + city
				+ "]";
	}
	
	
}
