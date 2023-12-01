package Question1;

public class Squirrel extends Pet{
	
	public Squirrel(String command) {
		isCaught(command,5);
	}

	public void feed() {
		super.feed();
		System.out.println("Feeding the Squirrel");
	}
	
	public void clean() {
		super.clean();
		System.out.println("Cleaning the Squirrel");
	}
	
	public void cuddle() {
		super.cuddle();
		System.out.println("Cuddling the Squirrel");
	}
	
	public boolean isCaught(String command,int times) {
		if("Run".equals(command) && times == 5) {
			try {
				throw new CaughtException("Squirrel is not caught!");
			}catch(CaughtException e) {
				System.out.println(e);
				setPoints(0);
				return true;
			}
		}else {
			System.out.println("Squirrel is not caught!");
			return false;
		}
	}
}
