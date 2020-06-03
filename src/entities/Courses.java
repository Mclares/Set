package entities;

public class Courses {
	
	private Integer ide;
	private String course;
	
	public Courses(Integer ide, String course) {
		this.ide = ide;
		this.course = course;
	}

	public Integer getIde() {
		return ide;
	}

	public void setIde(Integer ide) {
		this.ide = ide;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ide == null) ? 0 : ide.hashCode());
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
		Courses other = (Courses) obj;
		if (ide == null) {
			if (other.ide != null)
				return false;
		} else if (!ide.equals(other.ide))
			return false;
		return true;
	}	
	
}
