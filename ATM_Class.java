package atm;
import java.util.Scanner;

public class ATM_Class {
	
	private int balance=10000,amt,deposit;
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("*****choice*****");
			System.out.println("1:Withdraw Money ");
			System.out.println("2:Deposit Money ");	
			System.out.println("3:Check Balance ");
			System.out.println("4:exit ");
			System.out.println("Enter The Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:	
					System.out.println("Enter the Amount to Withdraw: ");
					amt=sc.nextInt();
					if(amt>10000)
					{
						System.err.println("Insufficient Amount");	
					}
					else
					{
						balance=balance-amt;
						System.out.println
					("\nTransaction Successfull:"+"\n Available balance : "+balance);
					} 
					break;
				case 2:
				{
					System.out.println("Enter the Amount To Deposit:");
					deposit=sc.nextInt();
					balance=balance+deposit; 
					System.out.println
				("Transaction Completed Successfully"+" \nAvl Bal :"+balance);
					break;
					
				}
					case 3:
						System.out.println("Available Balance: "+balance);
						break;
						
					case 4:
					System.exit(0);				
			}
		
		}
	}
	
	public static void main(String[] args)
	{
		ATM_Class obj =new ATM_Class();
		obj.run();
		

	}

} 



