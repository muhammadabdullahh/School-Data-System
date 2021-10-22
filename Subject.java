enum Subject
{
	COMPUTER_STUDIES,
	BUSINESS,
	MATH,
	MUSIC,
	TECHNOLOGY,
	UNKNOWN;


	public String getFullName()
	{
		switch(this)
		{
			case COMPUTER_STUDIES: return "Computer Studies";
			case BUSINESS: return "Business";
			case MATH: return "Math";
			case MUSIC: return "Music";
			case TECHNOLOGY: return "Technology";
			case UNKNOWN: return "Unknown";
		}
		return "invalid subject";
	}
	
	public String getPrefix()
	{
		switch(this)
		{
			case COMPUTER_STUDIES:	return "ICS";
			case BUSINESS:	return "BUS";
			case MATH:	return "MPM";
			case MUSIC:	return "MUS";
			case TECHNOLOGY:	return "TER";
			case UNKNOWN: return "NA";
		}
		return "invalid subject";
	}

}
