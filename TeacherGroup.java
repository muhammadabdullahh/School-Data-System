import java.util.ArrayList;

class TeacherGroup
{
	private ArrayList<Teacher> teachers;
	
	public TeacherGroup()
	{
		teachers = new ArrayList<Teacher>();
	}
	public void addTeacher(Teacher teacher)
	{
		if(teacher instanceof Teacher)
			teachers.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher)
	{
		if(teacher instanceof Teacher)
			teachers.remove(teacher);
	}
	
	public void removeTeacher(int index)
	{
		if(teachers.size()> index)
			teachers.remove(index);
	}
	
	public Teacher getTeacher(int index)
	{
		return teachers.get(index);
	}
	public Teacher getTeacher(Teacher c)
	{
		if(teachers.contains(c))
			return(c);
		return null;
	}
	public int size()
	{
		return(teachers.size());
	}
	
	public boolean hasTeacher(Teacher teacher)
	{
		if(teachers.contains(teacher))
			return true;
		return false;
	}
	public void sortGroup()
	{
		TeacherGroup tempGroup = new TeacherGroup();
		for(int j = 0; j < this.size(); j ++)
		{
			tempGroup.addTeacher(this.getTeacher(j));
		}
		boolean sorted = false;
		Teacher temp = new Teacher();
		while(!sorted) 
		{
			sorted = true;
			for (int i = 0; i < this.size() - 1; i++) 
			{
				
				if(tempGroup.getTeacher(i).compareTo(tempGroup.getTeacher(i+1)) > 1) 
				{
					temp.replaceTeacher(tempGroup.getTeacher(i));
					tempGroup.getTeacher(i).replaceTeacher(tempGroup.getTeacher(i+1));
					tempGroup.getTeacher(i+1).replaceTeacher(temp);
					sorted = false;
				}
			}      
		}
		System.out.println(tempGroup);
		//return tempGroup;
	}
	
	public String toString()
	{
		return(""+ teachers);
	}
}
