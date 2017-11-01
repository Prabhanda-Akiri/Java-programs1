package Mypack1;

public class AttendanceManagement
{
	String name;
	int Roll;
	double Attendance;

	public AttendanceManagement(String n,int r,double a)
	{
		name=n;
		Roll=r;
		Attendance=a;
	}

	public void show()
	{
		System.out.println("\nName:	"+name+"\nRoll.no:	"+Roll+"\nAttendance Status:	"+Attendance+"\n");
	}
}
