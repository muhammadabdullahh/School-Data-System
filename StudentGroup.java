import java.util.ArrayList;
import java.util.Arrays;

class StudentGroup
{
	private ArrayList<Student> students;
	
	public StudentGroup()
	{
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student)
	{
		if(student instanceof Student)
			students.add(student);
	}
	
	public void removeStudent(Student student)
	{
		if(student instanceof Student)
			students.remove(student);
	}
	
	public void removeStudent(int index)
	{
		if(students.size()> index)
			students.remove(index);
	}
	public Student getStudent(int index)
	{
		return students.get(index);
	}
	public Student get(Student c)
	{
		if(students.contains(c))
			return(c);
		return null;
	}
		
	public int size()
	{
		return(students.size());
	}
	
	public boolean hasStudent(Student student)
	{
		if(students.contains(student))
			return true;
		return false;
	}
	public void sortGroup()
	{
		StudentGroup tempGroup = new StudentGroup();
		for(int j = 0; j < this.size(); j ++)
		{
			tempGroup.addStudent(this.getStudent(j));
		}
		boolean sorted = false;
		Student temp = new Student();
		while(!sorted) 
		{
			sorted = true;
			for (int i = 0; i < this.size() - 1; i++) 
			{
				
				if(tempGroup.getStudent(i).compareTo(tempGroup.getStudent(i+1)) > 1) 
				{
					temp.replaceStudent(tempGroup.getStudent(i));
					tempGroup.getStudent(i).replaceStudent(tempGroup.getStudent(i+1));
					tempGroup.getStudent(i+1).replaceStudent(temp);
					sorted = false;
				}
			}      
		}
		System.out.println(tempGroup);
		//return tempGroup;
	}
	
	@Override
	public String toString()
	{
		return(""+ students);
	}
}
