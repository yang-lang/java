package ex11_2;

public class PerfectSquare extends FindFactor {
	private int n = 1;
	private int[] factor = new int[10];
	
	
	public PerfectSquare(int m) {
		super(m);
	}
	
	
	// Find factor
	public int[] setFactor() {
		int i,j;
		int m = getM();
		j = 0;
		for(i = 2;i <= m;) {
			if(m % i == 0) {
				factor[j] = i;
				j++;
				m/=i;
			}else {
				i++;
			}
		}
		//System.out.println(factor[1]);
		return factor;
	}
	
	
	
	public int getJiShu(int[] factor) {
		int length=0;
		for(int i = 0;i < factor.length;i++) {
			if(factor[i]!=0) length++;
		}
		for(int i = 0;i < length;i++) {
			int iCount = 1;
			for(int j = i+1;j<=length;j++) {
				if(factor[i] != 0 && factor[j]==factor[i]) {
					iCount++;
					factor[j] = 0;
				}
			}
			if(iCount % 2 != 0 && factor[i] != 0) {
				n*=factor[i];
			}
			factor[i]=0;
		}
		//System.out.println(n);
		return n;
	}
	
	
	
	
	
	
	
	
	
	
	
}

