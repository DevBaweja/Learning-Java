package ForEach;
// using for each loop
public class SumOfArrayForEach {

	public static void main(String[] args) {
		int []a = {10,20,30,40};
		int sum =0;
		for(int num : a )
		{
			sum += num;
		}
		System.out.println("sum :"+sum);

	}
}
