class Teacher implements Comparable<Teacher>
{
	private int teacherID;
    private String firstName;
    private String lastName;
    
    public Teacher(int teacherID, String firstName, String lastName)
    {
		this.teacherID = teacherID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Teacher(int teacherID)
	{
		this.teacherID = teacherID;
		this.firstName = null;
		this.lastName = null;
	}
	public Teacher()
	{
		this.teacherID = 0;
		this.firstName = null;
		this.lastName = null;
	}
	public void replaceTeacher(Teacher other)
	{
		this.teacherID = other.teacherID;
		this.firstName = other.firstName;
		this.lastName = other.lastName;
	}
	
	//ACCESSORS
	public int getTeacherID() {
        return teacherID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    //MUTATORS
     public void setFirstName (String s){
        if(s != null){
            this.firstName.equals(s);
        }
    }

    public void setLastName(String s){
        if(s != null){
            this.lastName.equals(s);
        }
    }
    
    @Override
    public String toString()
    {
		return( "\nTEACHER ID: " + this.teacherID + "\nFIRST NAME: " + this.firstName + "\nLAST NAME: " + this.lastName + "\n");
    }
    public boolean equals(Teacher other)
    {
        if(other == this)
            return true;

        if(!(this instanceof Teacher))
            return false;

        return false;
    }
    public int compareTo(Teacher other) {
        if(this.lastName.equalsIgnoreCase(other.lastName))
			return this.firstName.compareTo(other.firstName);
		return this.lastName.compareTo(other.lastName);
    }
    public int compareID(Teacher other) {
		if(this.teacherID == other.teacherID)
		{
			return 0;
		}
		return -1;
	}
}
