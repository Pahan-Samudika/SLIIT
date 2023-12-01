package Question1;

public class Parrot extends Pet{
	
	public Parrot(String command) {
		isCaught(command);
	}
	
	public void feed() {
		super.feed();
		System.out.println("Feeding the Parrot");
	}
	
	public void clean() {
		super.clean();
		System.out.println("Cleaning the Parrot");
	}
	
	public void cuddle() {
		super.cuddle();
		System.out.println("Cuddling the Parrot");
	}
	
	public boolean isCaught(String command) {
		if("Walk".equals(command)) {
			try {
				throw new CaughtException("Parrot is caught!");
			}catch(CaughtException e) {
				System.out.println(e.getMessage());
				setPoints(0);
				return true;
			}
		}else {
			System.out.println("Parrot is not caught!");
			return false;
		}
	}
}
