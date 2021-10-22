public class Course implements Comparable<Course>
{
	private String name;
	private Subject subject;
	private String code;
	private int grade;
	private Level level;
	private String description;
	
	public Course(String name, Subject subject, String code, int grade, Level level, String description)
	{
		this.name = name;
		this.subject = subject;
		this.code = code;
		this.grade = grade;
		this.level = level;
		this.description = description;
	}
	public Course(String code)
	{
		this.name = null;
		this.subject = null;
		this.code = code;
		this.grade = 0;
		this.level = null;
		this.description = null;
	}
	public Course(Course other)
	{
		this.name = other.name;
		this.subject = other.subject;
		this.code = other.code;
		this.grade = other.grade;
		this.level = other.level;
		this.description = other.description;
	}
	public Course()
	{
		this.name = null;
		this.subject = null;
		this.code = null;
		this.grade = 0;
		this.level = null;
		this.description = null;
	}
	public void replaceCourse(Course other)
	{
		this.name = other.name;
		this.subject = other.subject;
		this.code = other.code;
		this.grade = other.grade;
		this.level = other.level;
		this.description = other.description;
	}
	
	//ACCESSORS
	public String getName()
	{
		return name;
	}
	
	public Subject getSubject()
	{
		return subject;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public Level getLevel()
	{
		return level;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	//MUTATORS
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSubject(Subject subject)
	{
		this.subject = subject;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@Override
	public String toString()
	{
		return ("\nName: " + name + "\nSubject: " + subject.getFullName()  + "\nCode: " + code + "\nGrade: " + grade + "\nLevel: " + level.getFullName() + "\nDescription: " + description + "\n\n");
	}
	
	
	//OTHER
	@Override
	public boolean equals(Object other)
	{
		if(this == other)
		return true;
		
		if(!(other instanceof Course))
		return false;
			
		Course c = (Course)other;
		
		if(this.name == c.getName() && this.subject == c.getSubject() && this.code == c.getCode() && this.grade == c.getGrade() && this.level == c.getLevel() && this.description == c.getDescription())
			return true;
			
		return false;	
	}
	
	//CompareTo
	public int compareTo(Course other)
	{
		if(this.code.equalsIgnoreCase(other.code))
			return 0;
		return this.code.compareTo(other.code);
			
	}
}
