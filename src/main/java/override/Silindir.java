package override;

public class Silindir extends Geometri{
	
	double dYukseklik=0;
	double dYaricap=0;
	
	public Silindir() {
		super();
		
	}
	
	public Silindir(double dYukseklik, double dYaricap) {
		super();
		this.dYukseklik = dYukseklik;
		this.dYaricap = dYaricap;
	}
	

	public double getdYukseklik() {
		return dYukseklik;
	}

	public void setdYukseklik(double dYukseklik) {
		this.dYukseklik = dYukseklik;
	}

	public double getdYaricap() {
		return dYaricap;
	}

	public void setdYaricap(double dYaricap) {
		this.dYaricap = dYaricap;
	}



	@Override
	double alan() {
		// TODO Auto-generated method stub
		return Math.PI*dYaricap*dYaricap*dYukseklik/3;
	}

	@Override
	double cevre() {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
