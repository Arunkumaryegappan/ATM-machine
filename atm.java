import java.util.*;
import java .util.Scanner;
public class atm{
public static void main(String args[]){
bank a1=new bank();
a1.choices();
}
}
class bank{
int acc,mobile,balance=7000,choice,ammount,deposit,withdraw,amm,con;
String type;


Scanner s=new Scanner(System.in);
Scanner k=new Scanner(System.in);

void choices()
{
System.out.println("enter your choice( d for cardless deposit && ifor card insert): ");
type=k.nextLine();
if(type.equals("d"))
{

System.out.println("ENTER YOUR ACCOUNT NUMBER: ");
acc=s.nextInt();
System.out.println("ENTER YOUR MOBILE NUMBER: ");
mobile=s.nextInt();
System.out.println("ENTER YOUR ammount: ");
ammount=s.nextInt();
balance=balance+ammount;
System.out.println("YOUR BALANCE IS: "+balance);

}
else
{
do
{
System.out.println("1.withdraw 2.deposit 3.check balance 4.exit");
choice=s.nextInt();
switch(choice)
{
case 1:
System.out.println("ENTER YOUR withdraw ammount: ");
withdraw=s.nextInt();
System.out.println("please collect  your  cash");
balance=balance-withdraw;
System.out.println("your current balance: "+balance);
break;
case 2:
System.out.println("enter your ammount : ");
amm=s.nextInt();
deposit=balance+amm;
System.out.println("your ammount: "+deposit);
System.out.println("you have  depsited");
break;
case 3:
System.out.println("your balance: "+balance);
break;
case 4:
System.exit(0);
break;
}
System.out.println("press to 1");
con=s.nextInt();
}while(con==1);

}
}
}












