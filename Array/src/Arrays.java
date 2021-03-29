import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Arrays {
	
	
	//////////////////////////////////////////////////////
	//
	//	http://www.jkozak.pl/przedmioty/java/zadania3.pdf
	//
	//////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//zd. 1
		
//		 Random generator = new Random();
//		 int[] numbers = new int[10];
//		 
//		 for(int i=0; i<numbers.length; i++) {
//			// System.out.println(generator.nextInt(10+10) - 10);
//			 numbers[i] = generator.nextInt(10+10) - 10;
//		 }
//		 
//		 System.out.println("Random numbers between -10 and 10");
//		 for(int i=0; i<numbers.length; i++) {
//			 System.out.println(numbers[i]);
//		 }
//		 System.out.println("-----------------");
//		 
//		 int max = numbers[0];
//		 for(int i=1; i<numbers.length;i++) {
//			 if(numbers[i] > max) {
//				 max = numbers[i];
//			 }
//		 }
//		 System.out.println("Max: "+max);
//		 
//		 int min = numbers[0];
//		 for(int i=1; i<numbers.length;i++) {
//			 if(numbers[i] < min) {
//				 min = numbers[i];
//			 }
//		 }
//		 System.out.println("Max: "+min);
//		 System.out.println("-----------------");
//		 
//		 int average = 0;
//		 for(int i=1; i<numbers.length;i++) {
//			 average = average +  numbers[i];
//		 }
//		 double sum = average/ numbers.length;
//		 System.out.println("Average: "+sum);
//		 System.out.println("-----------------");
//		 
//		 int[] helpNumbers = new int[10];
//		 int t = 0;
//		 for(int i=1; i<numbers.length;i++) {
//			 //System.out.println(sum<numbers[i]);
//			 if(numbers[i]<sum) {
//				 t++;
//			 }
//		 }
//		 System.out.println("Number of numbers less than: "+sum+ ": "+t);
//		 
//		 for(int i=1; i<numbers.length;i++) {
//			//System.out.println(sum>numbers[i]);
//			 if(numbers[i]>sum) {
//				 t++;
//			 }
//		 }
//		 System.out.println("Number of numbers biger than: "+sum+ ": "+t);
//		 System.out.println("-----------------");
//		 
//		 System.out.println("Reverse numbers:");
//		 for(int i=numbers.length -1; i>0;i--) {
//			 System.out.println(numbers[i]);
//		 }
		
		//zd.2
		
//		Random random = new Random();
//		int[] numbers = new int[20];
//		
//		System.out.println("Random numbers:");
//		for(int i=1; i<numbers.length; i++) {
//			 System.out.println(random.nextInt(10));
//			 numbers[i] = random.nextInt(10);
//		}
//		System.out.println("-----------------");
//
//		for(int i=0; i<numbers.length; i++) {
//			if (numbers[i] != 0) {
//                if (numbers[i] / i > 1)
//                    System.out.println(i + " occurs " + numbers[i] / i + " times");
//                else
//                    System.out.println(i + " occurs " + numbers[i] / i + " time");               
//                }
//        	}
		
		
		//////////////////////////////////////////////////////
		//
		//	http://www.jkozak.pl/pliki/pijp/przyklady/p1.pdf
		//
		//////////////////////////////////////////////////////
		
		
		//zd.1
		
		Scanner scn = new Scanner(System.in);
		
//		System.out.println("The numbers:");
//		int[] numbers = new int[5];
//		for(int i=0; i<numbers.length; i++) {
//			int num = scn.nextInt();
//			numbers[i] = num;
//			if(num == 150) {
//				System.out.println("Number 150 has been added");
//				break;
//			}
//		}
//
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
		
		List<Integer> numbers = new ArrayList<>();
		System.out.println("The numbers:");
		int num;
		for(int i=0; i<10; i++) {
			num = scn.nextInt();
			numbers.add(num);
			if(num == 150) {
				System.out.println("Number 150 has been added");
				break;
			}
		}
		
		numbers.remove(numbers.size()-1);
		System.out.println("List of array: "+numbers);

		int sum = 0;
		for(int i : numbers) {
			sum = sum + i;
		}
		System.out.println("Sum of all added numbers: "+sum);
		System.out.println("Average of all added numbers: "+sum/numbers.size());
		
		
		}
}
