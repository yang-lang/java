package ex7_2;

public class StorageProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stor = new int[100];
		int i,j,k;
		
		//Each storage cabinet is closed
		for(i = 0;i < stor.length;i++) {
			stor[i] = 0;
		}
		
		//Change cabinet status
		for(j = 1;j < stor.length;j++) {
			for(k = j;k <stor.length;k += j) {
			     if(stor[k - 1] == 1) stor[k - 1] = 0;
			     else stor[k - 1] = 1;
			}
		}
		
		System.out.print("These cabinets are open: ");
		for(k = 0;k < stor.length;k++) {
			if(stor[k] == 1) System.out.print(k+1 + " ");
		}

	}

}
