package cashmachine;

public class CashMachine {
    //create your member/ instance variables 
    //remember to make them private
    private String sortCode;//These are String just in case they start
    private String accountNumber; //with a zero 
    private double balance;
    //You may need some more vars than these 
    
    //Once you have created all your encapsulated variables 
    //Encapsulation is the term given to private instance variables 
    //You can create your constrcutor 
    
    //Your constructor has the same name as the class and no return
    //type. We have been using void return type most 
    
    //Notice the constructor is pascal case rather than camel case
    //The constructor creates the object 
    //You can create a blank constructor like below 
    public CashMachine(){
    
    }
    
    //or create a constructor that takes arguments
    public CashMachine(String sortCode, String accountNumber){
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.balance = 2400.00; //sets balance to 2400
    }
    
    //To create the object, we need to add the following to the Main
    //CashMachine cashObj = new CashMachine("Pass sort code", "Pass account number");
    
    //Below here you can put your methods 
    
    public double displayBalance(){
        return this.balance;
    }
    
    public void withdrawCash(double amount){
        if(balance > amount){
            balance -= amount;
            System.out.println("You new balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
        
    }
    
    public void depositCash(double amount){
        if(amount > 0){
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
        
    }
}
