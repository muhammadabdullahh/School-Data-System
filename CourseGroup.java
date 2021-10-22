import java.util.ArrayList;

public class CourseGroup
{
	private ArrayList<Course> courses;
	
	public CourseGroup()
	{
		courses = new ArrayList<Course>();
	}
	
	public void addCourse(Course c)
	{
		if(c != null)
		{
			courses.add(c);
		}
	}
	
	public void removeCourse(Course c)
	{
		if(courses.contains(c))
			courses.remove(c);
	}
	
	public void removeCourse(int index)
	{
		if(index < courses.size())
			courses.remove(index);
	}
	
	public Course get(Course c)
	{
		if(courses.contains(c))
			return(c);
		return null;
	}
	
	public Course get(int index)
	{
		if(index < courses.size())
			return (courses.get(index));
		return null;
	}
	
	public int size()
	{
		return(courses.size());
	}
	
	
	public String toString()
	{
		return("[COURSES]: "+courses);
	}
}
