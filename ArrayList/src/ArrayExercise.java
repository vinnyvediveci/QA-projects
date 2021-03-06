import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayExercise {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		// taskPrint(numbers);
		// printEven(numbers);
		// printTimesTen(numbers);
//		printOnlyHighest(numbers);
//		printOnlyLowest(numbers);
//		printSquares(numbers);
//		printUniqueSquares(numbers);
		//numbers.stream().sorted().forEach(System.out::println);
//	   printTimesTenStream(numbers);
		printOnlyHighestStream(numbers);
		printOnlyLowestStream(numbers);
		printSquaresStream(numbers);
		printUniqueSquaresStream(numbers);
       // printEvenStream(numbers);
	}

	public static void taskPrint(List<Integer> numbers) {
		int i;
		for (i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

	}
	


	public static void printEven(List<Integer> numbers) {
		int i;
		for (i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				System.out.println(numbers.get(i));
			}

		}

	}
	public static void printEvenStream(List<Integer> numbers) {
		 numbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		 numbers.stream().sorted().forEach(System.out::println);
		   
	}
	
	public static void printTimesTen(List<Integer> numbers) {
         for (int i = 0; i < numbers.size(); i++) {
			System.out.print(10 * numbers.get(i) + " ");
		}
	}
	
	public static void printTimesTenStream(List<Integer> numbers) {
		
		numbers = numbers.stream().map(n -> n * 10).collect(Collectors.toList());
		 numbers.stream().sorted().forEach(System.out::println);
	}
	
	public static void printOnlyHighest(List<Integer> numbers) {
		
		int Maxim = 5;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > Maxim) {
				Maxim = numbers.get(i);
			}

		}

		System.out.println(Maxim);

	}
    public static void printOnlyHighestStream(List<Integer> numbers){
    	Optional<Integer> maxNumber = numbers.stream().reduce(Integer::max);
    	System.out.println(maxNumber);
    }
    
	public static void printOnlyLowest(List<Integer> numbers) {
		int i;
		int Min = 50;
		for (i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < Min) {
				Min = numbers.get(i);
			}

		}

		System.out.println(Min);
	}
	
	
	public static void printOnlyLowestStream(List<Integer> numbers){
    	Optional<Integer>minNumber = numbers.stream().reduce(Integer::min);
    	System.out.println(minNumber);
    	}
	
	public static void printSquares(List<Integer> numbers) {

		for ( int i = 0; i < numbers.size(); i++) {
			numbers.set(i, numbers.get(i) * numbers.get(i));
		}
		System.out.println(numbers);
	}
	
	public static void printSquaresStream(List<Integer> numbers) {
		List<Integer> squares = numbers.stream().map(s -> s * s).collect(Collectors.toList());
		System.out.println(squares);
	}
	public static void printUniqueSquares(List<Integer> numbers) {
		numbers.sort(null);
		for (int i = 0; i <= numbers.size(); i++) {
			if ( numbers.get(i) >= 12) {
				break;
			} 
			else if(numbers.get(i) == numbers.get(i + 1)) 
			{
				continue;
			}
				System.out.println(numbers.get(i) * numbers.get(i));
				
			}
			 
		}

	public static void printUniqueSquaresStream(List<Integer> numbers) {
		numbers.stream().filter(i -> Collections.frequency(numbers, i) == 1).map(n -> n * n)
        .collect(Collectors.toSet()).forEach(System.out::println);
	}
	}
	



