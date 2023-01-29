package override;

public class Square extends Geometri{

	double dKenar = 0;
	
	public Square(double dKenar) {
		super();
		this.dKenar = dKenar;
	}

	@Override
	double alan() {

		return dKenar *  dKenar;
	}

	@Override
	double cevre() {
		// TODO Auto-generated method stub
		return 0;
	}


}
