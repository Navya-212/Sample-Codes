import java.util.*;
import java.io.*;

class Customer{
    int accno;
    String name,type;
    double balance;
    Customer(int accno,String name,String type,double balance){
        this.accno=accno;
        this.name=name;
        this.type=type;
        this.balance=balance;
    }
    public void display(){
        System.out.println("Account no.:"+accno+"  Name:"+name+"  Acc type"+type+"  Balance"+balance);
    }
}

class Bank{
    Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        ArrayList<Customer> cust=new ArrayList<>();
		int ch;
		do{
			System.out.print("1.Add Customers\n 2.Withdraw\n 3.Deposit\n 4.search\n 5show_accounts\n 6.exit\n");
			System.out.print("Enter your choice\n");
			ch=sc.nextInt();
			switch(ch){
				case 1: addcustomer(cust);
						break;
				case 2: withdraw(cust);
						break;
				case 3: deposit(cust);
						break;
				case 4: search(cust);
						break;
				case 5: show_accounts(cust);
                        break;
                case 6: break;
                }
            }while(ch!=6);
	   }
	public static void addcustomer(ArrayList<Customer> cust){
            Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of customers u want to add");
		int n=sc.nextInt();
		while(n-->0){
			System.out.print("Enter acc no.\n");
			int acc_temp=sc.nextInt();
			     System.out.print("Enter accoutn holder name\n");
			String name_temp=sc.next();
			     System.out.print("Enter account type\n");
			String type_temp=sc.next();
			     System.out.print("Enter balance\n");
			double bal_temp=sc.nextDouble();
			Customer s=new Customer(acc_temp,name_temp,type_temp,bal_temp);
            cust.add(s);
			     System.out.print("account created\n");
		}
	}
	public static void withdraw(ArrayList<Customer> cust){
            Scanner sc=new Scanner(System.in);
		int flag=-1;
		System.out.println("enter account number");
		int id=sc.nextInt();
        for(Customer x: cust){
            if(x.accno==id){
                flag=1;
                System.out.println("enter amount of balance to be withdrawn");
                double bal=sc.nextDouble();
                x.balance-=bal;
                x.display();
            }
        }
        if(flag==-1)
            System.out.println("account not found");
		
	}
	public static void deposit(ArrayList<Customer> cust){
            Scanner sc=new Scanner(System.in);
		int flag=-1;
		System.out.println("enter account number");
		int n=sc.nextInt();
        for(Customer x: cust){
            if(x.accno==n){
                flag=1;
                System.out.println("enter amount of balance to be deposited");
                double bal=sc.nextDouble();
                x.balance+=bal;
                x.display();
            }
        }
        if(flag==-1)
            System.out.println("account not found");
	}
	public static void search(ArrayList<Customer> cust){
            Scanner sc=new Scanner(System.in);
		int flag=-1;
		System.out.println("enter account number");
		int n=sc.nextInt();
        for(Customer x: cust){
            if(x.accno==n){
                flag=1;
                x.display();
            }
        }
        if(flag==-1)
            System.out.println("account not found");
	}
    public static void show_accounts(ArrayList<Customer> cust){
        for(Customer x:cust){
            x.display();
        }
    }
	
}
