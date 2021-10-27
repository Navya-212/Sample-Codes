import java.util.*;
import java.io.*;

class A{
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> accno=new ArrayList<Integer>();
	ArrayList<String> name=new ArrayList<String>();
	ArrayList<String> type=new ArrayList<String>();
	ArrayList<Double> balance=new ArrayList<Double>();
	int acc_temp;
	String name_temp,type_temp;
	double bal_temp;
	void addcustomer(){
		System.out.println("Enter number of customers u want to add");
		int n=sc.nextInt();
		while(n-->0){
			System.out.print("Enter acc no.\n");
			acc_temp=sc.nextInt();
			accno.add(acc_temp);
			System.out.print("Enter accoutn holder name\n");
			name_temp=sc.next();
			name.add(name_temp);
			System.out.print("Enter account type\n");
			type_temp=sc.next();
			type.add(type_temp);
			System.out.print("Enter balance\n");
			bal_temp=sc.nextDouble();
			balance.add(bal_temp);
			System.out.print("account created\n");
		}
	}
	void show_accounts(){
		for(int i=0;i<accno.size();i++){
			System.out.println("account number: "+accno.get(i)+"  account name: "+name.get(i)+"  account type: "+type.get(i)+"  Balance: "+balance.get(i));
		}
	}
	void withdraw(){
		int flag=-1;
		System.out.println("enter account number");
		int n=sc.nextInt();
		for(int i=0;i<accno.size();i++){
			if(accno.get(i)==n){
				flag=i;
				break;
			}
		}
		if(flag!=-1){
			System.out.println("enter amount to be withdrawn");
			double amt=sc.nextDouble();
			if(amt<=balance.get(flag)){
				balance.set(flag, balance.get(flag)-amt);
			}
			else
				System.out.println("suuficient amount is not there!");
			System.out.println("account number: "+accno.get(flag)+"  account name: "+name.get(flag)+"  account type: "+type.get(flag)+"  Balance: "+balance.get(flag));
		}
		else{
			System.out.println("account not found");
		}
	}
	void deposit(){
		int flag=-1;
		System.out.println("enter account number");
		int n=sc.nextInt();
		for(int i=0;i<accno.size();i++){
			if(accno.get(i)==n){
				flag=i;
				break;
			}
		}
		if(flag!=-1){
			System.out.println("enter amount to be deposited");
			double amt=sc.nextDouble();
			balance.set(flag,balance.get(flag)+amt);
			System.out.println("account number: "+accno.get(flag)+"  account name: "+name.get(flag)+"  account type: "+type.get(flag)+"  Balance: "+balance.get(flag));
		}
		else{
			System.out.println("account not found");
		}
	}
	void search(){
		int flag=-1;
		System.out.println("enter account number");
		int n=sc.nextInt();
		for(int i=0;i<accno.size();i++){
			if(accno.get(i)==n){
				flag=i;
				break;
			}
		}
		if(flag!=-1){
			System.out.println("account number: "+accno.get(flag)+"  account name: "+name.get(flag)+"  account type: "+type.get(flag)+"  Balance: "+balance.get(flag));
		}
		else{
			System.out.println("account not found");
		}
	}
}
class Bank{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		A oa=new A();
		int ch;
		do{
			System.out.print("1.Add Customers\n 2.Show Accounts\n 3.Withdraw\n 4.Deposit\n 5.search\n 6.exit\n");
			System.out.print("Enter your choice\n");
			ch=sc.nextInt();
			switch(ch){
				case 1: oa.addcustomer();
						break;
				case 2: oa.show_accounts();
						break;
				case 3: oa.withdraw();
						break;
				case 4: oa.deposit();
						break;
				case 5: oa.search();
						break;
				case 6: break;
			}
		}while(ch!=6);
	}
}