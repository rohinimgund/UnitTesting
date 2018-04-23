package Homework_7;

public class calcNextDaysDate {

	private int day, month, year;	

	public calcNextDaysDate (int monthno, int dayno, int yearno) {
		this.day=dayno;
		this.month=monthno;
		this.year=yearno;
	}

	public void calcNextDay ()
	{
		int daysIn[] = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if ((getYear() % 400 != 0) && ((getYear() % 100 == 0) || (getYear() % 4 != 0)))
		  daysIn[2] = 28; 
		else
		  daysIn[2] = 29;
		
		if (getDay()==daysIn[getMonth()]) {
			setDay(1);
			if (getMonth()==12) {
				setMonth(1);
				setYear(getYear()+1);
			}
			else
				setMonth(getMonth()+1);
		}
		else
			setDay(getDay()+1);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}