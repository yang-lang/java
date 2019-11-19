package ex11_3;

public class BestPackage {
	private int weight[] = new int[100];
	
	BestPackage (int[] weight) {
		this.weight = weight;
	}
	
	public int[] getWeight() {
		return weight;
	}
	
	public int[] sort(int[] weight) {
		for(int i = 0;i < weight.length;i++) {
			for(int j = 0;j < weight.length - i - 1;j++) {
				if(weight[j] < weight[j + 1]) {
					int temp = weight[j];
					weight[j] = weight[j + 1];
					weight[j + 1] = temp;
				}
			}
		}
		return weight;
	}
	
	
	public void packageObject(int[] weight) { 
		int m = 0;
		
		for(int i = 0;i < weight.length;i++) {
			if(weight[i] <= 10) {
			int[] ca = new int[10];
			ca[0] = weight[i];
			int k = 1;
			for(int j = i + 1;j < weight.length;j++) {
				if(weight[i] + weight[j]  <= 10) {
					ca[k++] = weight[j];
					weight[i] = weight[i] + weight[j];
					weight[j] = 11;
					continue;
				}
			}
			m++;
			System.out.print("Container " + m + " contains objects with weight ");
			for(int l = 0;l < k;l++) {
				System.out.print(ca[l] + " ");
			}
			System.out.print("\n");
		 }
		}
		
	}

}
