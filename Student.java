import java.util.List;

public class Student {
	private int id;
	private String name;

	List<Course> studentCourses;

	public Student(int id, String name, List<Course> studentCourse) {
		super();
		this.id = id;
		this.name = name;
		this.studentCourses = studentCourse;

	}

	public List<Course> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<Course> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
