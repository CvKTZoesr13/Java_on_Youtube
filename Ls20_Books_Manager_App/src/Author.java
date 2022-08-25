
public class Author {
	private String authorName;
	private Date birthday;
	public Author(String authorName, Date birthday) {
		this.authorName = authorName;
		this.birthday = birthday;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.authorName + "-" + this.birthday;
	}
}
