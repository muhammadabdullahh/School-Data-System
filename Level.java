enum Level                        
{
	C,
	M,
	U,
	O,
	NA;
	
	
	public String getFullName()
	{
		switch(this)
		{
			case C: return "College";
			case M: return "Mixed";
			case U: return "University";
			case O: return "Open";
			case NA: return "UNKNOWN";
		}
		return "invalid course";
	}
	public String getPrefix()
	{
		switch(this)
		{
			case C: return "C";
			case M: return "M";
			case U: return "U";
			case O: return "O";
			case NA: return "NA";
		}
		return "invalid subject";
	}
}
