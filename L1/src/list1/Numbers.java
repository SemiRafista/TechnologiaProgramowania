package list1;

public class Numbers {
	private int number = 12;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getNumberInSpecificSystem(int system){
		if(system<2 || system>16)
			return null;
		
		return Integer.toString(getNumber(), system);
	}
}
