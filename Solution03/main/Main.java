package by.introduction.fifth.OOP3.main;
/* 
5. Basics of OOP
   Задача 3.
   
   Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить 
   информацию о выходных и праздничных днях.
 */
import java.util.List;

import by.introduction.fifth.OOP3.bean.Calendar;
import by.introduction.fifth.OOP3.bean.Calendar.Day;

public class Main {

	public static void main(String[] args) {

		Calendar c = new Calendar();

		Day day1 = c.new Day(1, 02, 2030, false, false);
		Day day2 = c.new Day(2, 02, 2030, false, false);
		Day day3 = c.new Day(3, 02, 2030, false, true);
		Day day4 = c.new Day(4, 02, 2030, false, false);
		Day day5 = c.new Day(5, 02, 2030, false, false);
		Day day6 = c.new Day(6, 02, 2030, true, false);
		Day day7 = c.new Day(7, 02, 2030, true, false);

		c.addDayOffHoliday(day1);
		c.addDayOffHoliday(day2);
		c.addDayOffHoliday(day3);
		c.addDayOffHoliday(day4);
		c.addDayOffHoliday(day5);
		c.addDayOffHoliday(day6);
		c.addDayOffHoliday(day7);

		List<Day> dates = c.getDates();
		for (int i = 0; i < dates.size(); i++) {
			System.out.println(dates.get(i).toString());
		}
	}
}
