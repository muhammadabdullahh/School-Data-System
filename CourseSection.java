public class CourseSection
{
	private Course course;
	private StudentGroup students;
	private Teacher teacher;
	private Location location;
	
	public CourseSection(Course course, Teacher teacher, Location location)
	{
		this.course = course;
		this.students = new StudentGroup();
		this.teacher = teacher;
		this.location = location;
	}
	public CourseSection()
	{
		this.course = null;
		this.students = new StudentGroup();
		this.teacher = null;
		this.location = null;
	}
	public void replaceCourseSection(CourseSection other)
	{
		this.course = other.course;
		this.students = other.students;
		this.teacher = other.teacher;
		this.location = other.location;
	}
	
	public Course getCourse()
	{
		return course;
	}	
	public Teacher getTeacher()
	{
		return teacher;
	}	
	public Location getLocation()
	{
		return location;
	}
	public StudentGroup getStudentGroup()
	{
		return students;
	}
		
	public void setLocation(Location location)
	{
		if(location instanceof Location)
			this.location = location;
	}
	
	public void setCourse(Course course)
	{
		if(course instanceof Course)
			this.course = course;
	}
	
	public void setTeacher(Teacher teacher)
	{
		if(teacher instanceof Teacher)
			this.teacher = teacher;
	}
	
	public void addStudent(Student student)
	{
		if(student instanceof Student)
			students.addStudent(student);
	}
	
	public void removeStudent(Student student)
	{
		if(students.hasStudent(student))
			students.removeStudent(student);
	}
	
	public void removeStudent(int index)
	{
		if(students.size() > index)
			students.removeStudent(index);
	}
	public boolean hasStudent(Student student)
	{
		for(int i = 0; i < this.getStudentGroup().size(); i++)
		{
			if(this.getStudentGroup().getStudent(i).equals(student))
			{
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
		return "\n*********************************\n\n[COURSE]: " + this.course + "[TEACHER]: " + this.teacher  + "\n[ALL STUDENTS]: "+ this.students + "\n[LOCATION]: " + this.location + "\n*********************************";
	}
	public int compareCode(CourseSection other)
	{
		if(this.getCourse().getCode() == other.getCourse().getCode())
			return 0;
		return -1;
	}
	public int compareTo(CourseSection other)
	{
		return this.getCourse().getName().compareTo(other.getCourse().getName());
	}
		
}
