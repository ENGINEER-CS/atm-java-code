package Bank;

//data base of users
public class User
{
	
  // Field:	
  private int account_id;
  private String name;
  private int pin;
  private double balance;
  
  // Default consturctor:
  public User() {
	System.out.println("Default consturctor");
}

  // Parameterized Constructor:
  public User(int account_id,String name,int pin, double balance)
  {
      this.account_id=account_id;
      this.name=name;
      this.pin=pin;
      this.balance=balance;
  }

  //Setters and getters allow us to set and retrieve values, but we don’t always need to set or get all fields.

  public void setPin(int pin)
  {
      this.pin = pin;
  }
  public void setBalance(double balance)
  {
      this.balance = balance;
  }
  public int getAccount_id()
  {
      return account_id;
  }
  public String getName()
  {
      return name;
  }
  public int getPin()
  {
      return pin;
  }
  public double getBalance()
  {
      return balance;
  }
}