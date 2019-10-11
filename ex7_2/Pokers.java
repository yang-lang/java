package ex7_2;

public class Pokers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","1","2","3","4","5","6","7","8","9","10",
				"Jack","Queen","King"};
		String[] rank = new String[4];
		String[] suit = new String[4];
		
		for(int i = 0;i < 52;i++) deck[i] = i;
		for(int i = 0;i < 52;i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		int num = 1;
		int time = 1; // Number of cycles
		int real = 1; // Number of chosen cards
		suit[0] = suits[deck[0] / 13]; 
		rank[0] = ranks[deck[0] % 13];
		System.out.println(real);
		while(real != 4) {
			int j;
			for(j = 0;j < real;j++) {
				System.out.println(deck[num]);
				System.out.println(deck[num] / 13);
				 System.out.println(suits[deck[num] / 13]);
			
				if(suits[deck[num] / 13] == suit[j])
					break;
			}
			if(j==real) {
				suit[real] = suits[deck[num] / 13];
				rank[real] = ranks[deck[num] % 13];
				real++;
			}
			num++;
		    time++;
				
		}
		for(int k = 0;k < 4;k++) {
			System.out.println(rank[k] + " of " + suit[k]);
		}
		System.out.println("Number of picks: " + time);

	}

}
