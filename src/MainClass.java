import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Enter number of elements in array: ");
		int size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int[] Arr=new int[size];
		System.out.println("Enter the array: ");
		for(int i=0;i<size;i++){
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum you want: ");
		int sum=sc.nextInt();
		int[] Ans=new int[]{};
		Ans=TwoSum(Arr,sum);
		System.out.printf("The two indexes are %d, %d",Ans[0],Ans[1]);

	}
	public static int[] TwoSum(int[] Arr,int sum){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] Ans=new int[2];
		for(int i=0;i<Arr.length;i++){
			if(map.containsKey(sum-Arr[i])){
				Ans[0]=i;
				Ans[1]=map.get(sum-Arr[i]);
				return Ans;
			}
			map.put(Arr[i], i);
		}
		return null;
		
	}

}
