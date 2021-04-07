class Person
{
	protected String name;
	 protected float age;
	public Person(String name,float age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}
class Account
{
	protected long accNum=(long)Math.random();
	
	protected double balance;
	Person accHolder;
	public Account(double balance,Person accHolder)
	{
		this.balance=balance;
		this.accHolder=accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount1)
	{
		if(balance-amount1<500)
		{
			System.out.println("Minimum balance is 500");
			
		}
		else
		{
			balance=balance-amount1;
			
		}
	}
}
class SavingsAccount extends Account
{
	public SavingsAccount(long accNum, Person accHolder) {
		super(accNum, accHolder);
		// TODO Auto-generated constructor stub
	}
	final double MINIMUM_BALANCE=500;
	public  void withdraw(double withdraw)
	{
		if(super.balance-withdraw>MINIMUM_BALANCE)
		{
			System.out.println("you can withdraw");
			
		}
		else
		{
			System.out.println("your minimum will be less than minimum balance");
			
		}
	}
class CurrentAccount extends Account
{

	public CurrentAccount(long accNum, Person accHolder) {
		super(accNum, accHolder);
		// TODO Auto-generated constructor stub
	}
	int overDraftLimit=200;
	@Override
	public void withdraw(double withdraw)
	{
		if(super.balance-withdraw>overDraftLimit)
		{
			super.balance=super.balance-withdraw;
		}
		else
		{
			System.out.println("exceeds overdraft limit");
		}
	}
}
	
	
}

public class Exercise1 {

	public static void main(String[] args) {
		Person n=new Person("smith",25);
		Account smith=new Account(2000,n);
		Person n1=new Person("kathy",27);
		Account kathy=new Account(3000,n1);
		smith.deposit(2000);
		kathy.withdraw(1000000);
		System.out.println("smith balance: "+smith.getBalance());
		System.out.println("kathy balance: "+kathy.getBalance());
	}

}
