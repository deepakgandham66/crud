package crud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PhoneData")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long contactid;
	private long ph_num;
	private String type;
	@ManyToOne
	@JoinColumn(name="Auth_Phonr")
	private Author author;
	public long getContactid() {
		return contactid;
	}
	public void setContactid(long contactid) {
		this.contactid = contactid;
	}
	public long getPh_num() {
		return ph_num;
	}
	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + (int) (contactid ^ (contactid >>> 32));
		result = prime * result + (int) (ph_num ^ (ph_num >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Phone other = (Phone) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (contactid != other.contactid)
			return false;
		if (ph_num != other.ph_num)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Phone [contactid=" + contactid + ", ph_num=" + ph_num + ", type=" + type + ", author=" + author + "]";
	}
		
}
