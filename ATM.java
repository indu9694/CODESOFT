import java.util.*;

class ATMworking{
    float balance;
    int pin=5678;
    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc =new Scanner(System.in);
        int enteredPin =sc.nextInt();
        if(enteredPin==pin){
            menu();
        }else{
          System.out.println("enter a valid pin");
          checkPin();
        }
    }
    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc =new Scanner(System.in);
        int opt =sc.nextInt();

        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                
                break;
            default:
                System.out.println("Enter your valid choice:");
                break;
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc =new Scanner(System.in);
        float amount =sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance.");
        }
        else {
            balance=balance-amount;
            System.out.println("Money withdrawl succesful  ");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount : ");
        Scanner sc =new Scanner(System.in);
        float amount =sc.nextFloat();
        
        balance=balance+amount;
        System.out.println("Money deposit succesful  ");
    
        menu();
    }
}



public class ATM {
    public static void main(String[] args){
        ATMworking a=new ATMworking();
        a.checkPin();
    }
}
