import java.util.ArrayList;

class CourseSectionGroup
{
	private ArrayList<CourseSection> sections;
	
	public CourseSectionGroup()
	{
		sections = new ArrayList<CourseSection>();
	}
	
	public void addCourseSection(CourseSection courseSection)
	{
		if(courseSection instanceof CourseSection)
			sections.add(courseSection);
	}
	
	public void removeCourseSection(CourseSection courseSection)
	{
		if(courseSection instanceof CourseSection)
			sections.remove(courseSection);
	}
	
	public void removeCourseSection(int index)
	{
		if(sections.size()> index)
			sections.remove(index);
	}
	
	public CourseSection getCourseSection(int index)
	{
		return sections.get(index);
	}
	public CourseSection get(CourseSection c)
	{
		if(sections.contains(c))
			return(c);
		return null;
	}
	public int size()
	{
		return(sections.size());
	}
	public void sortSections()
	{
		CourseSectionGroup tempGroup = new CourseSectionGroup();
		for(int j = 0; j < this.size(); j ++)
		{
			tempGroup.addCourseSection(this.getCourseSection(j));
		}
		boolean sorted = false;
		CourseSection temp = new CourseSection();
		while(!sorted) 
		{
			sorted = true;
			for (int i = 0; i < this.size() - 1; i++) 
			{
				
				if(tempGroup.getCourseSection(i).compareTo(tempGroup.getCourseSection(i+1)) > 1) 
				{
					temp.replaceCourseSection(tempGroup.getCourseSection(i));
					tempGroup.getCourseSection(i).replaceCourseSection(tempGroup.getCourseSection(i+1));
					tempGroup.getCourseSection(i+1).replaceCourseSection(temp);
					sorted = false;
				}
			}      
		}
		System.out.println(tempGroup);
		//return tempGroup;
	}
	
	public boolean hasCourseSection(CourseSection courseSection)
	{
		if(sections.contains(courseSection))
			return true;
		return false;
	}
	
	public String toString()
	{
		return("[ALL COURSE SECTIONS]\n" + sections);
	}
}
