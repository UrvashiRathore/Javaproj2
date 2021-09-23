
abstract class Worker
{
	abstract double calculateSalary();
	Worker()
	{
		System.out.println("worker object");
	}
}
class DailyWorker extends Worker
{
	double day = 25 ,spd = 100, salary;
	double calculateSalary() {
	salary = day*spd;
	return salary;
	}
	DailyWorker()
	{
		System.out.println("Dailyworker object");
	}
}
class SalaryWorker extends Worker
{
double basic = 30000 , salary ;
double calculateSalary() {
	salary = basic + (0.5*basic);
	return salary ;
}
SalaryWorker()
{
	System.out.println("Salaryworker object");
}
}

public class Exp4_Prog3{
	public static void main(String[] args) {
		Worker w;
		w = new DailyWorker();
		w.calculateSalary();
	}
}


