package bankingsystem;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;




public class OptionsMenu extends Account{
	
	Scanner menuInput= new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'Rs '###,##0.00");
	int selection;
	HashMap<Integer, Integer> data=new HashMap<>();
	
	
	public void getLogin() throws IOException {
		int x=1;
		
		
		do {
			try {
				data.put(8254901, 7235);
				data.put(3629754, 8211);
				
				System.out.println("Welcome!");
				 System.out.println("Enter the Customer Number:");
				 setCustomerNumber(menuInput.nextInt());
				 
				 System.out.println("Enter the Pin Number: ");
				 setPinNumber(menuInput.nextInt());
			}catch (Exception e) {
				
				System.out.println("\n" + "Invalid character(s).Only numbers." + "\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
		}while (x==1);
	}
		
		/* Display Account Type Menu with selection    */
		
		
		public void getAccountType() {
			
			System.out.println("Select the Account you want to Access: ");
			System.out.println("1 - Current Account");
			System.out.println("2 - Saving Account");
			System.out.println("3 - Exit");
			System.out.print("Choice: ");
			
			selection = menuInput.nextInt();
			
			switch(selection) {
			
			case 1: 
				getCurrent();
				break;
				
			case 2:
				getSaving();
				break;
				
				
			case 3:
				System.out.println("Thank you for using this System, Bye.");
				break;
				
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getAccountType();
				
				
			}
			
		}
		/* Display Current Account menu with selections */
		
		public void getCurrent() {
			System.out.println("Current Account: ");
			System.out.println("1 - View Balance");
			System.out.println("2 - Withdraw Funds");
			System.out.println("3 - Deposit Funds");
			System.out.println("4 - Exit");
			System.out.println("Choice: ");
			
			selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Current Account Balance: " + moneyFormat.format(getCurrentBalance()));
				getAccountType();
				break;
				
			case 2: 
				getCurrentWithdrawInput();
				getAccountType();
				break;
				
			case 3: 
				getCurrentDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank you for using this System, bye");
				
			default:
				System.out.println("\n"  + "Invalid choice." + "\n");
				getCurrent();
			}
		}
		/* Displaying Saving Account menu with selection */
		
		public void getSaving() {
			
			System.out.println("Saving Account");
			System.out.println("1 - View Balance");
			System.out.println("2 - Withdraw Funds");
			System.out.println("3 - Deposit Funds");
			System.out.println("4 - Exit");
			System.out.println("Choice: ");
			
			selection=menuInput.nextInt();
			
			
			switch(selection) {
			
			case 1:
				System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
				
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
				
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				
			}
			
		}
			
		
			
	

}
