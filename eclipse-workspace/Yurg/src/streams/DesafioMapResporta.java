package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMapResporta {
public static void main(String[] args) {
	
	
	List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	UnaryOperator<String> reverse = n -> new StringBuilder(n).reverse().toString();
	Function<String, Integer> conversãoFinal = n-> Integer.parseInt(n, 2);
	nums.stream()
	.map(Integer::toBinaryString)
	.map(reverse)
	.map(conversãoFinal)
	.forEach(System.out::println);
	
	
}
}
