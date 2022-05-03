package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
public class DesafioMap {
void Adicionar (String n) {

}
	public static void main(String[] args) {
	Consumer<Integer> print = System.out::println;
	System.out.println("Numeros da lista:");
	List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	for (int nome: nums) {
		System.out.println(nome);
	}
	
	
	Function <Integer, String> conversão = Integer::toBinaryString;
	Function<String, String> reverse = s -> (new StringBuilder(s).reverse().toString());
	Function<String, Integer> Numerofinal = n -> Integer.parseInt(n, 2);

	
	System.out.println("Numero convertido:");
	
	 nums.stream()
	.map(conversão)
	.map(reverse)
	.map(Numerofinal)
	.forEach(print);
}}
	/*
	 * 1.Número para string binário...6=>"110"
	 * 2.Inverter a string... "110" =>"011"
	 * 3.Converter de volta para inteiro => "011" => 3
	 * 4.Integer
	 */




