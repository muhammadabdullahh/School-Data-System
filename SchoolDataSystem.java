/*This class incorportes many different classes in order
 * to run a school data system. Allowing you to 
 * perform many tasks with a student, teacher, and course menu
 * @Author Muhammad Abdullah
 * January 24, 2021*/


import java.util.*;
import java.time.LocalDate;

class SchoolDataSystem
{
	private StudentGroup enrollmentList;
	private CourseGroup courseCalender;
	private CourseSectionGroup masterCourseList;
	private TeacherGroup teacherList;
	private int currentMenu;
	
	private final int MAIN_MENU = 0;
	private final int COURSE_MENU = 1;
	private final int STUDENT_MENU = 2;
	private final int TEACHER_MENU = 3;
	
	//MAIN METHOD
	public static void main(String[] args)
	{
		SchoolDataSystem school = new SchoolDataSystem();
		school.preAdds();
		school.menuSelection();
	}
	
	
	//CONTRUCTOR
	public SchoolDataSystem()
	{
		this.enrollmentList = new StudentGroup();
		this.courseCalender = new CourseGroup();
		this.masterCourseList = new CourseSectionGroup();
		this.teacherList = new TeacherGroup();
		this.currentMenu = 0;
	}
	
	public void preAdds()
	{
		//add teachers
		Teacher t1 = new Teacher(26793, "Charlotte", "Narly");
		Teacher t2 = new Teacher(23842, "Brian", "Kuff");
		Teacher t3 = new Teacher(26493, "Nick", "Buff");
		this.teacherList.addTeacher(t1);
		this.teacherList.addTeacher(t2);
		this.teacherList.addTeacher(t3);
		//add students
		Student s1 = new Student(3245, "Dude", "Sick", LocalDate.of(2003,06,23));
		Student s2 = new Student(5355, "Hairy", "Hotter", LocalDate.of(2002,02,13));
		Student s3 = new Student(3786, "Furry", "Brian", LocalDate.of(2003,10,5));
		Student s4 = new Student(8394, "Ben", "Simmons", LocalDate.of(2003,11,2));
		Student s5 = new Student(8363, "Lebron", "James", LocalDate.of(2003,2,5));
		Student s6 = new Student(8255, "Austin", "Matthews", LocalDate.of(2003,10,17));
		Student s7 = new Student(7438, "Rick", "Ross", LocalDate.of(2003,5,21));
		this.enrollmentList.addStudent(s1);
		this.enrollmentList.addStudent(s2);
		this.enrollmentList.addStudent(s3);
		this.enrollmentList.addStudent(s4);
		this.enrollmentList.addStudent(s5);
		this.enrollmentList.addStudent(s6);
		this.enrollmentList.addStudent(s7);
		//add courses
		Course c1 = new Course("Functions", Subject.MATH, "MCRC3U", 11, Level.U, "Math Related");
		Course c2 = new Course("Computer Tech", Subject.TECHNOLOGY, "TER3M", 11, Level.M, "Techy");
		Course c3 = new Course("Advanced Functions", Subject.MATH, "MHF4U", 12, Level.U, "Math Related");
		Course c4 = new Course("Math", Subject.MATH, "MHF1M", 9, Level.M, "Grade 9 Math");
		Course c5 = new Course("Computer Technology", Subject.COMPUTER_STUDIES, "ICS3M", 11, Level.M, "Grade 11 COMP TECH");
		Course c6 = new Course("Band", Subject.MUSIC, "MUS2O", 10, Level.O, "Grade 10 Band Class");
		this.courseCalender.addCourse(c1);
		this.courseCalender.addCourse(c2);
		this.courseCalender.addCourse(c3);
		this.courseCalender.addCourse(c4);
		this.courseCalender.addCourse(c5);
		this.courseCalender.addCourse(c6);
		//add course sections
		CourseSection cs1 = new CourseSection(c1, t1, Location.RM01);
		CourseSection cs2 = new CourseSection(c2, t2, Location.RM02);
		CourseSection cs3 = new CourseSection(c3, t3, Location.RM01);
		this.masterCourseList.addCourseSection(cs1);
		this.masterCourseList.addCourseSection(cs2);
		this.masterCourseList.addCourseSection(cs3);
		this.masterCourseList.getCourseSection(0).addStudent(s1);
		this.masterCourseList.getCourseSection(0).addStudent(s2);
		this.masterCourseList.getCourseSection(1).addStudent(s3);
		this.masterCourseList.getCourseSection(2).addStudent(s4);
		
		
		
	}
	
	//MENU SELECTOR
	public void menuSelection()
	{
		if(currentMenu == 0)
			mainMenu();
		if(currentMenu == 1)
			courseMenu();
		if(currentMenu == 2)
			studentMenu();
		if(currentMenu == 3)
			teacherMenu();
	}
		
	//MAIN MENU
	public void mainMenu()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("### Welcome to the School Data System ###");
		System.out.println("############## MAIN MENU ################");
		
		System.out.println("\t1. Course Menu");
		System.out.println("\t2. Student Menu");
		System.out.println("\t3. Teacher Menu");
		
		System.out.print("Your Choice: ");
		int Mainans = in.nextInt();
		
		this.currentMenu = Mainans;
	}
	
	//######################## SUB MENUS #####################
	
	public void courseMenu()												//COURSE MENU
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("############# Course Menu ############");
		
		System.out.println("\t0. Return to Main Menu");
		
		System.out.println("\t1. Add a Course");
		System.out.println("\t2. Delete a Courses");
		System.out.println("\t3. View a Course");
		System.out.println("\t4. View all Course");
		System.out.println("\t5. Add a Course Section");
		System.out.println("\t6. Delete a Course Section");
		System.out.println("\t7. View a Course Section");
		System.out.println("\t8. View all Course Sections");
		System.out.println("\t9. Add Student to Course Section");
		System.out.println("\t10. Delete Student from Course Section");
		
		System.out.print("You're Choice: ");
		int subAns = in.nextInt();
		
		if(subAns == 0)				//MAIN MENU
		{
			this.currentMenu = 0;
			menuSelection();
		}
		if(subAns == 1)				//ADD A COURSE
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Add a Course");
			
			System.out.print("Enter Course Name: ");
			String name = in.next();
			
			System.out.println("Choose a Subject");
			System.out.println("\t1.  Computer Studies");
			System.out.println("\t2.  Business");
			System.out.println("\t3.  Math");
			System.out.println("\t4.  Music");
			System.out.println("\t5.  Technology");
			System.out.print("Your Choice: ");
			int subject = in.nextInt();
			Subject tempSUB = Subject.UNKNOWN;
			if(subject == 1)
				tempSUB = Subject.COMPUTER_STUDIES;
			if(subject == 2)
				tempSUB = Subject.BUSINESS;
			if(subject == 3)
				tempSUB = Subject.MATH;
			if(subject == 4)
				tempSUB = Subject.MUSIC;
			if(subject == 5)
				tempSUB = Subject.TECHNOLOGY;
			
			System.out.println("Choose a Grade: ");
			System.out.println("\t1.  9");
			System.out.println("\t2.  10");
			System.out.println("\t3.  11");
			System.out.println("\t4.  12");
			System.out.println("Your Choice: ");
			int grade = in.nextInt();
			
			System.out.println("Choose a Level");
			System.out.println("\tC");
			System.out.println("\tM");
			System.out.println("\tU");
			System.out.println("\tO");
			Level tempLEV = Level.NA;
			if(subject == 1)
				tempLEV = Level.C;
			if(subject == 2)
				tempLEV = Level.M;
			if(subject == 3)
				tempLEV = Level.U;
			if(subject == 4)
				tempLEV = Level.O;
			
			System.out.print("Your Choice (Enter the letter itself): ");
			String level = in.next();
			level = level.toUpperCase();
			
			System.out.println("Enter a course description: ");
			String description = in.next();
			String code = tempSUB.getPrefix() + grade + tempLEV.getPrefix();
			this.courseCalender.addCourse(new Course(name, tempSUB, code, grade+8, tempLEV, description));
			System.out.print("\n\n\n\n\nCourse Succesfully Added");
			System.out.println(this.courseCalender.get(this.courseCalender.size()-1));
			System.out.print("Enter 0 to return to course menu: ");
			int subc1 = in.nextInt();
			if(subc1 == 0)
			{
				this.currentMenu = 1;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
			
		}
		if(subAns == 2)				//DELETE A COURSE
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Remove a Course");
			System.out.println("All Active Courses");
			System.out.println(this.courseCalender);
			System.out.print("Enter the Course Code of The course youd like to remove: ");
			String code = in.next();
			Course s1 = new Course(code);
			//System.out.println(s1);
			for(int i = 0; i < this.courseCalender.size(); i++)
			{
				int compare = s1.compareTo(this.courseCalender.get(i));
				if(compare == 0)
				{
					this.courseCalender.removeCourse(i);
					System.out.println("Course Succesfully REMOVED");
					System.out.print("\nEnter 0 to return to Course menu: ");
					int ans2 = in.nextInt();
					if(ans2 == 0)
					{
						this.currentMenu = 1;
						menuSelection();
					}
					else
					{
						System.out.println("Invalid input, automatically returned to main menu");
						this.currentMenu = 0;
						menuSelection();
					}
				}
			}
			System.out.println("Cannot Perform task, invalid info entered");
			this.currentMenu = 1;
			menuSelection();	
		}
		if(subAns == 3)				//VIEW A COURSE
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t View a Course");
			System.out.print("Enter the Course Code: ");
			String code = in.next();
			Course s1 = new Course(code);
			//System.out.println(s1);
			for(int i = 0; i < this.courseCalender.size(); i++)
			{
				int compare = s1.compareTo(this.courseCalender.get(i));
				if(compare == 0)
				{
					System.out.println("\n\n\nCourse Found");
					System.out.println(this.courseCalender.get(i));
					System.out.print("\nEnter 0 to return to Course menu: ");
					int ans2 = in.nextInt();
					if(ans2 == 0)
					{
						this.currentMenu = 1;
						menuSelection();
					}
					else
					{
						System.out.println("Invalid input, automatically returned to main menu");
						this.currentMenu = 0;
						menuSelection();
					}
				}
			}
			System.out.println("Cannot Perform task, invalid info entered");
			this.currentMenu = 1;
			menuSelection();	
				
		}
		if(subAns == 4)				//VIEW ALL COURSES
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("All Active Courses\n");
			System.out.println(this.courseCalender);
			System.out.print("\nEnter 0 to return to Course menu: ");
			int ans2 = in.nextInt();
			if(ans2 == 0)
			{
				this.currentMenu = 1;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid input, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
			
		}
		if(subAns == 5)				//ADD A COURSE SECTION
		{
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Add a Course Section");
			System.out.print("Would you like to see all courses? type yes or no: ");
			String courseAnsr = in.next();
			if(courseAnsr.equalsIgnoreCase("yes")){
				System.out.print(this.courseCalender);
			}
			System.out.print("Enter Course Code of the Course youd like to add: ");
			String code = in.next();
			Course c1 = new Course(code);
			Course temp = new Course();
			//System.out.println(s1);
			for(int i = 0; i < this.courseCalender.size(); i++)
			{
				int compare = c1.compareTo(this.courseCalender.get(i));
				if(compare == 0)
				{
					System.out.println("Course Found");
					temp.replaceCourse(this.courseCalender.get(i));
				}
			}
			System.out.println("Choose a Location");
			System.out.println("\t1. RMO1");
			System.out.println("\t2. RM02");
			Location location = Location.NA;
			int roomNumber = in.nextInt();
			if(roomNumber == 1)
			{
				location = Location.RM01;
			}
			if(roomNumber  == 2)
			{
				location = Location.RM02;
			}
			System.out.println("Enter the info of the teacher youd like to add");
			System.out.print("Would you like to view all current enrolled teachers for reference? Type yes or no: ");
			String ans12344 = in.next();
			if(ans12344.equalsIgnoreCase("yes"));
			{
				System.out.println(this.teacherList);
			}
			System.out.println("\n\nEnter the info of the teacher you'd wish to add");
			System.out.print("Enter Teacher ID: ");
			int teacherID = in.nextInt();

			boolean answer = false;
			Teacher t1 = new Teacher(teacherID);
			for(int j = 0; j < this.teacherList.size(); j++)
			{
				if(t1.getTeacherID() == this.teacherList.getTeacher(j).getTeacherID())
				{
					this.masterCourseList.addCourseSection(new CourseSection(temp, t1, location));
					
					System.out.println("Course Section Succesfully Created");
					answer = true;
				}
			}
			if(answer = false)
			{
				System.out.println("Invalid input, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
			System.out.print("Would you like to add a student? type yes or no: ");
			String ans123 = in.next();
			if(ans123.equalsIgnoreCase("yes"))
			{
				boolean loopAns = true;
				do
				{
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.print("Would you like to view all current enrolled students for reference? type yes or no: ");
					String ans1234 = in.next();
					if(ans1234.equalsIgnoreCase("yes"));
					{
						System.out.println(this.enrollmentList);
					}
					System.out.println("\n\nEnter the info of the student you'd wish to add");
					System.out.print("Enter Student ID: ");
					int studentID = in.nextInt();
					
					Student s1 = new Student(studentID);
					//System.out.println(s1);
					for(int i = 0; i < this.enrollmentList.size(); i++)
					{
						if(s1.getStudentID() == this.enrollmentList.getStudent(i).getStudentID())
						{
							this.masterCourseList.getCourseSection(this.masterCourseList.size()-1).addStudent(this.enrollmentList.getStudent(i));
							System.out.println("\n\n\nStudent Added to Section");
							System.out.print("\n\t1. Add another student: ");
							System.out.print("\n\t2. Return to Course Menu: ");
							int ans2 = in.nextInt();
							if(ans2 == 2)
							{
								this.currentMenu = 1;
								menuSelection();
							}
						}
					}
					System.out.println("Cannot Perform task, invalid info entered");
					this.currentMenu = 2;
					menuSelection();
				}
				while(loopAns == true);	
			}
			
			
		}
		if(subAns == 6)				//REMOVE A COURSE SECTION
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Remove a Course Section");
			System.out.print("Would you like to see all cours sections? type yes or no: ");
			String ans16 = in.next();
			if(ans16.equalsIgnoreCase("yes"))
			{
				System.out.println("ALL COURSE SECTION");
				for(int i = 0; i < this.masterCourseList.size(); i ++)
				{
					System.out.println((i+1) + ": " + this.masterCourseList.getCourseSection(i));
				}
			}
			System.out.print("Enter the number, which corresponds with your chosen section: ");
			int numAns = in.nextInt();
			this.masterCourseList.removeCourseSection(numAns - 1);
			System.out.print("Course Succesfully Removed");
			System.out.print("\nEnter 0 to return to course menu: ");
			int retAns  = in.nextInt();
			if(retAns == 0)
			{
				this.currentMenu = 1;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
		if(subAns == 7)				//VIEW A COURSE SECTION
		{
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t View a Course Section");
			System.out.print("Enter the Course Code of the course which is in the section: ");
			String code = in.next();
			System.out.println("All Course Sections which include this course");
			for(int i = 0; i < this.masterCourseList.size(); i++)
			{
				if(this.masterCourseList.getCourseSection(i).getCourse().getCode().equalsIgnoreCase(code))
				{
					System.out.println((i + 1) + ": " +  this.masterCourseList.getCourseSection(i));
				}
			}
			
			
			System.out.print("Enter 0 to return to Course Menu: ");
			int ans1 = in.nextInt();
			if(ans1 == 0)
			{
				this.currentMenu = 1;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
		if(subAns == 8)				//VIEW ALL COURSE SECTION
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t View All Course Sections");
			this.masterCourseList.sortSections();
			System.out.print("Enter 0 to return to Course Menu: ");
			int ans1 = in.nextInt();
			if(ans1 == 0)
			{
				this.currentMenu = 1;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
		if(subAns == 9)				//ADD STUDNENT TO COURSE SECTION
		{		
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Add a student to a Course Section");
			System.out.print("Type yes to print all course sections");
			String ans19 = in.next();
			System.out.println("All Course Sections");
			for(int i = 0; i < this.masterCourseList.size(); i++)
			{
				System.out.println((i+1)  +": " + this.masterCourseList.getCourseSection(i));
			}
			System.out.print("Enter the number which corresponds with your chosen section: ");
			int code = in.nextInt();
			System.out.print("Would you like to view all current enrolled students for reference? type yes or no: ");
			String ans1234 = in.next();
			if(ans1234.equalsIgnoreCase("yes"));
			{
				System.out.println(this.enrollmentList);
			}
			System.out.println("\n\nEnter the info of the student you'd wish to add");
			System.out.print("Enter Student ID: ");
			int studentID = in.nextInt();
					
			Student s1 = new Student(studentID);
			//System.out.println(s1);
			for(int j = 0; j < this.enrollmentList.size(); j++)
			{
				if(s1.getStudentID() == this.enrollmentList.getStudent(j).getStudentID())
				{
					this.masterCourseList.getCourseSection(code - 1).addStudent(this.enrollmentList.getStudent(j));
					System.out.println("\n\n\nStudent Added to Section");
				}
			}
			
			System.out.print("Enter 0 to return to Course Menu: ");
			int ans1 = in.nextInt();
			if(ans1 == 0)
			{
				this.currentMenu = 1;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
		if(subAns == 10)			//DELETE STUDENT FROM COURSE SECTION
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Delete a student from a Course Section");
			System.out.print("Type yes to print all course sections");
			String ans19 = in.next();
			System.out.println("All Course Sections");
			for(int i = 0; i < this.masterCourseList.size(); i++)
			{
				System.out.println((i+1)  +": " + this.masterCourseList.getCourseSection(i));
			}
			System.out.print("Enter the number which corresponds with your chosen section: ");
			int code = in.nextInt();
			System.out.print("Enter the studentID of the student youd like to remove from the section: ");
			int ID = in.nextInt();
			for(int i = 0; i < this.masterCourseList.getCourseSection(code - 1).getStudentGroup().size();i++)
			{
				if(this.masterCourseList.getCourseSection(code - 1).getStudentGroup().getStudent(i).getStudentID()== ID);
				{
					System.out.println("Student Succesfully Removed");
					this.masterCourseList.getCourseSection(code - 1).getStudentGroup().removeStudent(i);
				}
					
			}
			System.out.print("Enter 0 to return to Course Menu: ");
			int ans1 = in.nextInt();
			if(ans1 == 0)
			{
				this.currentMenu = 1;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
		
	}
	public void studentMenu()												//STUDENT MENU
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("############# Student Menu ############");
		
		System.out.println("\t0. Return to Main Menu");
		
		System.out.println("\t1. Enroll a Student");
		System.out.println("\t2. Remove a Student");
		System.out.println("\t3. View a Student");
		System.out.println("\t4. View all Students");
		
		System.out.print("You're Choice: ");
		int subAns = in.nextInt();
		
		if(subAns == 0)
		{
			this.currentMenu = 0;
			menuSelection();
		}
		
		if(subAns == 1)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Add a Student");
			
			System.out.print("Enter Student ID: ");
			int studentID = in.nextInt();
			
			System.out.print("First Name: ");
			String firstName = in.next();
			
			System.out.print("Last Name: ");
			String lastName = in.next();
			
			System.out.print("Birthdate Year - yyyy: ");
			int year = in.nextInt();
			
			System.out.print("Birthdate Month - mm: ");
			int month = in.nextInt();
			
			System.out.print("Birthdate Day - dd: ");
			int day = in.nextInt();
			
			this.enrollmentList.addStudent(new Student(studentID, firstName, lastName, LocalDate.of(year,month,day) ));
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\nNEW Student CREATED:\n" + (this.enrollmentList.getStudent(this.enrollmentList.size()-1)));
			
			System.out.println();
			System.out.print("Enter 0 to return to student menu: ");
			int ans1 = in.nextInt();
			if(ans1 == 0)
			{
				this.currentMenu = 2;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
		
		if(subAns == 2)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Remove a Student\n");
			System.out.println("All Enrolled Stuents");
			System.out.println(this.enrollmentList);
			
			
			System.out.print("Which Student would you like to remove\nEnter Student ID: ");
			int studentID = in.nextInt();
			
			System.out.print("First Name: ");
			String firstName = in.next();
			
			System.out.print("Last Name: ");
			String lastName = in.next();
			
			
			
			Student s1 = new Student(studentID, firstName, lastName);
			//System.out.println(s1);
			for(int i = 0; i < this.enrollmentList.size(); i++)
			{
				int compare = s1.compareTo(this.enrollmentList.getStudent(i));
				if(compare == 0)
				{
					this.enrollmentList.removeStudent(i);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Student Removed");
					System.out.print("Enter 0 to return to student menu: ");
					int ans2 = in.nextInt();
					if(ans2 == 0)
					{
						this.currentMenu = 2;
						menuSelection();
					}
					else
					{
						System.out.println("Invalid input, automatically returned to main menu");
						this.currentMenu = 0;
						menuSelection();
					}
					
				}
			}
			System.out.println("Cannot Perform task, invalid info entered");
			this.currentMenu = 2;
			menuSelection();
		}
		
		if(subAns == 3)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t View a Student\n");
			
			System.out.print("Which Student would you like to see\nEnter Student ID: ");
			int studentID = in.nextInt();
			
			System.out.print("First Name: ");
			String firstName = in.next();
			
			System.out.print("Last Name: ");
			String lastName = in.next();
			
			
			
			Student s1 = new Student(studentID, firstName, lastName);
			//System.out.println(s1);
			for(int i = 0; i < this.enrollmentList.size(); i++)
			{
				int compare = s1.compareTo(this.enrollmentList.getStudent(i));
				if(compare == 0)
				{
					System.out.println("\n\n\nStudent Found");
					System.out.println(this.enrollmentList.getStudent(i));
					System.out.println("\n ALL Enrolled Courses of this Student");
					for(int j = 0; j < this.masterCourseList.size(); j ++)
					{
						for(int e = 0; e < this.masterCourseList.getCourseSection(j).getStudentGroup().size(); e++)
						{
							if(this.masterCourseList.getCourseSection(j).getStudentGroup().getStudent(e).equals(this.enrollmentList.getStudent(i)))
							{
								System.out.println(this.masterCourseList.getCourseSection(j));
							}
						}
					}
					System.out.print("\nEnter 0 to return to student menu: ");
					int ans2 = in.nextInt();
					if(ans2 == 0)
					{
						this.currentMenu = 2;
						menuSelection();
					}
					else
					{
						System.out.println("Invalid input, automatically returned to main menu");
						this.currentMenu = 0;
						menuSelection();
					}
				}
			}
			System.out.println("Cannot Perform task, invalid info entered");
			this.currentMenu = 2;
			menuSelection();	
				
		}	
		
		if(subAns == 4)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\tAll Enrolled Students: ");
			//System.out.println(this.enrollmentList.sortGroup());
			this.enrollmentList.sortGroup();
			
			System.out.print("Enter 0 to return to student menu: ");
			int ans2 = in.nextInt();
			if(ans2 == 0)
			{
				this.currentMenu = 2;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid input, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
	}
	public void teacherMenu()												//TEACHER MENU
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("############# Teacher Menu ############");
		
		System.out.println("\t0. Return to Main Menu");
		
		System.out.println("\t1. Enroll a Teacher ");
		System.out.println("\t2. Remove a Teacher");
		System.out.println("\t3. View all Teachers");
		
		System.out.print("You're Choice: ");
		int subAns = in.nextInt();
		
		if(subAns == 0)
		{
			this.currentMenu = 0;
			menuSelection();
		}
		if(subAns == 1)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Add a Teacher");
			
			System.out.print("Enter Teacher ID: ");
			int teacherID = in.nextInt();
			
			System.out.print("First Name: ");
			String firstName = in.next();
			
			System.out.print("Last Name: ");
			String lastName = in.next();
			
			this.teacherList.addTeacher(new Teacher(teacherID, firstName, lastName));
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\nNEW TEACHER CREATED:\n" + (this.teacherList.getTeacher(this.teacherList.size()-1)));
			
			System.out.println();
			System.out.println("Enter 0 to return to teacher menu");
			int ans1 = in.nextInt();
			if(ans1 == 0)
			{
				this.currentMenu = 3;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid uinput, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
			
		}
		
		if(subAns == 2)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t Remove a Teacher\n");
			System.out.println("All Teachers");
			System.out.println(this.teacherList);
			
			
			System.out.print("Which Teacher would you like to remove\nEnter Teacher ID: ");
			int teacherID = in.nextInt();
			
			System.out.print("First Name: ");
			String firstName = in.next();
			
			System.out.print("Last Name: ");
			String lastName = in.next();
			
			Teacher s1 = new Teacher(teacherID, firstName, lastName);
			for(int i = 0; i < this.teacherList.size(); i++)
			{
				int compare = s1.compareTo(this.teacherList.getTeacher(i));
				if(compare == 0)
				{
					this.teacherList.removeTeacher(i);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Teacher Removed");
					System.out.print("Enter 0 to return to teacher menu");
					int ans2 = in.nextInt();
					if(ans2 == 0)
					{
						this.currentMenu = 3;
						menuSelection();
					}
					else
					{
						System.out.println("Invalid input, automatically returned to main menu");
						this.currentMenu = 0;
						menuSelection();
					}
					
				}
			}
			System.out.println("Cannot Perform task, invalid info entered");
			this.currentMenu = 3;
			menuSelection();
				
		}
		
		if(subAns == 3)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\tAll Teachers Listed: ");
			this.teacherList.sortGroup();
			
			System.out.print("Enter 0 to return to teacher menu");
			int ans2 = in.nextInt();
			if(ans2 == 0)
			{
				this.currentMenu = 3;
				menuSelection();
			}
			else
			{
				System.out.println("Invalid input, automatically returned to main menu");
				this.currentMenu = 0;
				menuSelection();
			}
		}
	}
	
}
		
