
public class LinearEquation {
	private double a,b,c,d,e,f;

	
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	void setA(int a) {
		this.a = a;
	}

	
	void setB(int b) {
		this.b = b;
	}

	
	void setC(int c) {
		this.c = c;
	}
	
	
	void setD(int d) {
		this.d = d;
	}
	
	void setE(int e) {
		this.e = e;
	}
	
	void setF(int f) {
		this.f = f;
	}
	

	boolean isSolvable() {
		if(a*d - b*c != 0) return true;
		else return false;
	}
	
	double getX() {
		double x = (e*d - b*f)/(a*d-b*c);
		return x;
	}
	
	double getY() {
		double y = (a*f-e*c)/(a*d-b*c);
		return y;
	}
}
	
	
	
