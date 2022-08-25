
public class Date2 {
	private int day, month, year;

	public Date2(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day >= 1 && day <=31) {
			this.day = day;
		}else {
			this.day = 1;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month >= 1 && month <=12) {
			this.month = month;
		}else {
			this.month = 1;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >= 1) {
			this.year = year;
		}else {
			this.year = 1;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day + "/" + this.month + "/" + this.year;
				
	}
}
