
public class DiceRolled {

	public static void main(String[] args) {
		int SIZE = 60000000;
		int[] A = new int[SIZE]; 
		int min = 1;
		int max = 6;
		int count=0;
		for(int i=0;i<SIZE;i++)
		{
			if((int) (Math.random()*(max-min+1))+min == 6)
				count++;
		}
		System.out.println(count);
	}

}
