package Program;

public class Task2of5
{
	int seconds;
	int minutes;
	int hours;
	public Task2of5(int hours, int minutes, int seconds)
	{
	this.hours = hours;
	this.minutes = minutes;
	this.seconds = seconds;
	}
	public static void main(String[] args) {
	Task2of5 start = new Task2of5(12, 34, 55),
	stop = new Task2of5(8, 12, 15),
	diff;
	diff = difference(start, stop);
	System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
	System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
	System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
	}
	public static Task2of5 difference(Task2of5 start, Task2of5 stop)
	{
	Task2of5 diff = new Task2of5(0, 0, 0);
	if(stop.seconds > start.seconds){
	--start.minutes;
	start.seconds += 60;
	}
	diff.seconds = start.seconds - stop.seconds;
	if(stop.minutes > start.minutes){
	--start.hours;
	start.minutes += 60;
	}
	diff.minutes = start.minutes - stop.minutes;
	diff.hours = start.hours - stop.hours;
	return(diff);
	}

}
