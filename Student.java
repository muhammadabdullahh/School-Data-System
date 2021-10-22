import java.time.*;
class Student implements Comparable<Student>
{
	private int studentID;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Student(int studentID, String firstName, String lastName)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = null;
	}
	
	public Student(int studentID, String firstName, String lastName, LocalDate dateOfBirth)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public Student(Student other)
	{
		this.studentID = other.studentID;
		this.firstName = other.firstName;
		this.lastName = other.lastName;
		this.dateOfBirth = other.dateOfBirth;
	}
	public void replaceStudent(Student other)
	{
		this.studentID = other.studentID;
		this.firstName = other.firstName;
		this.lastName = other.lastName;
		this.dateOfBirth = other.dateOfBirth;
	}
	public Student(int studentID)
	{
		this.studentID = studentID;
		this.firstName = null;
		this.lastName = null;
		this.dateOfBirth = null;
	}
	public Student()
	{
		this.studentID = 0;
		this.firstName = null;
		this.lastName = null;
		this.dateOfBirth = null;
	}
	
	//ACCESSORS
	public int getStudentID()
	{
		return this.studentID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public java.time.LocalDate getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	
	//MUTATORS
	public void setFirstName(String firstName)
	{
		if(firstName != null)
			this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		if(lastName != null)
			this.lastName = lastName;
	}
	public void setDateOfBirth(java.time.LocalDate dateOfBirth)
	{
		if(dateOfBirth != null)
			this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString()
	{
		return "\n[Student ID]: "+this.studentID+"\n" + "[First Name]: "+this.firstName+"\n"+"[Last Name]: "+this.lastName+"\n"+"[Birth Date]: "+this.dateOfBirth + "\n";
	}
	public boolean equals(Student other)
	{
		if(this == other)
			return true;
		return false;
	}
	public int compareTo(Student other)
	{
		if(this.lastName.equalsIgnoreCase(other.lastName))
			return this.firstName.compareTo(other.firstName);
		return this.lastName.compareTo(other.lastName);
	}
	public int compareID(Student other) {
		if(this.studentID == other.studentID)
		{
			return 0;
		}
		return -1;
	}
}
