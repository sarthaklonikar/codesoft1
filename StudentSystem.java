package atm;
import java.util.Scanner;

public class StudentSystem
{
	int ma,eng,sci,hs,math,sns;int sum=0;
	String name,school,grade;
	double avg;
	Scanner sc=new Scanner(System.in);
	int max=100;
	public void info()
	{
		System.out.println("Enter Your name: ");
		name=sc.nextLine();
		System.out.println("Enter Your School Name: ");
		school=sc.nextLine();
		System.out.println("\n***Enter Your obtained Subject Marks[Out of 100]***");
		System.out.println("\n Marathi: ");
		int ma=sc.nextInt();
		
		System.out.println("English: ");
		int eng=sc.nextInt();
		
		System.out.println("Science: ");
		int sci=sc.nextInt();
		
		System.out.println("History & geography: ");
		int hs=sc.nextInt();
		
		System.out.println("Mathematics: ");
		int math=sc.nextInt();
		
		System.out.println("Sanskrit");
		int sns=sc.nextInt();
		sum=ma+eng+sci+hs+math+sns;
		avg=sum/6;
		System.out.println("Average is "+avg);	
	}
	public void findgrade()
	{
		if(avg>=90)
		{
			grade="A+";
		}
		else if(avg>=70 && avg<=90)
		{
			grade="A";
		}
		else if(avg>=45 && avg<70)
		{
			grade="B";
		} 
		else if(avg<45)
		{
			grade="C";
		}
	}
	
	public void displayinfo()
	{
		System.out.println("-------Student Information--------");
		System.out.println("\nName :"+name+ "\nSchool: "+school);
		System.out.println("Grade: "+grade);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentSystem obj=new StudentSystem();
		System.err.println("*** STUDENT GRADE CALCULATOR ***");
		obj.info();
		obj.findgrade();
		obj.displayinfo();
		
	}

}


