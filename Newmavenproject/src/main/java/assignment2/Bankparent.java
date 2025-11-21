package assignment2;

public class Bankparent {
	private int pin;
	public void setPin(int pin) {
		this.pin=pin;
	}
public int getPin()
{
	return pin;
	
}
public void validate()
{
	if (pin==1001||pin==1234||pin==1212)
		System.out.println("valid number");
	else
		System.out.println("invalid");
	
}
}
