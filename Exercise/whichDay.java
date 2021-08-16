/*
Find the day of the week of a given date

Create a class  and Implement a Java-method called findDOW(int day,int month,int year)that prints out the day of the week for a given day (1..31), month (1..12) and year.

The day of the week of dates between March 1900 and February 2100 can be calculated as follows:

First, you have to calculate the total number of days from 1900/1/1 to the given date (see below, for details). 
Secondly, you divide this number by 7 with integer remainder: this now is the day of the week, with 0 as sunday, 1 as monday, etc.

To calculate the total number of days you have to implement the following steps:

Subtract 1900 from the given year and multiply the result by 365
Add the missing leaps years by adding (year - 1900) / 4.
If the year itself is a leap year and the month is January or February, you have to subtract 1 from the previous result.
Now add the all days of the year up to the given one to the result (in case of february always 28, because the additional day for a leap year already have been added).
*/

public class DOWFinder {
	
	public String findDOW(int day,int month,int year) {
		String dow = "";
		
		int numDays = (year - 1900) * 365;
		numDays += (year - 1900) / 4;
		
		if(year % 4 == 0 && month <= 2) {
			numDays--;
		}
		
		switch(month) {
		case 12: numDays += 30;
		case 11: numDays += 31;
		case 10: numDays += 30;
		case 9: numDays += 31;
		case 8: numDays += 31;
		case 7: numDays += 30;
		case 6: numDays += 31;
		case 5: numDays += 30;
		case 4: numDays += 31;
		case 3: numDays += 28;
		case 2: numDays += 31;
		}
		
		numDays += day;
		
		int dowIndex = numDays % 7;
		String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		dow = days[dowIndex];
		return dow;
	}

	public static void main(String[] args) {
		DOWFinder finder = new DOWFinder();
		String dow = finder.findDOW(26,9,1993);
		System.out.println(dow);

	}

}
