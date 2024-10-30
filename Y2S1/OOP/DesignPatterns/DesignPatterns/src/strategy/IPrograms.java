package strategy;

public interface IPrograms {
	void offerPrograms();
}


class DoctoralPrograms implements IPrograms{
	@Override
	public void offerPrograms() {
		System.out.println("Offer Doctoral Programs");
	}
}

class MScPrograms implements IPrograms{
	@Override
	public void offerPrograms() {
		System.out.println("Offer MSc Programs");
	}
}

class BScPrograms implements IPrograms{
	@Override
	public void offerPrograms() {
		System.out.println("Offer BSc Programs");
	}
}