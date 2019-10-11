package ex7;

public final class LinearSearch {

	public static int LinearSearch(int[] list,int key) {
		for(int i = 0;i < list.length;i++) {
			if(key == list[i]) 
				return i;
		}
		return -1;
	}
				
   public static void main(String[] args) {
	   int[] list = {1,4,4,2,5,-3,6,2};
	   int i = LinearSearch(list,4);
	   int j = LinearSearch(list,-4);
	   int k = LinearSearch(list,-3);
	   
	   System.out.println("i is: " + i);
	   System.out.println("j is: " + j);
	   System.out.println("k is: " + k);
   }
}