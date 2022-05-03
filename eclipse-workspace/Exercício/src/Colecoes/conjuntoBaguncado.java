package Colecoes;

import java.util.HashSet;

public class conjuntoBaguncado 
{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	HashSet conjunto = new HashSet();
	
	conjunto.add(1.2); // double --> Double
	conjunto.add(true);
	conjunto.add("Test");
	conjunto.add(1);
	conjunto.add('x');
	
	System.out.println("Tamanho é " + conjunto.size());
	conjunto.add("teste");
	conjunto.add('x');

	System.out.println("Tamanho é " + conjunto.size());

	System.out.println(conjunto.remove(1.2));
	System.out.println(conjunto.remove(true));
	System.out.println(conjunto.remove(1));

	System.out.println("Tamanho é " + conjunto.size());
	System.out.println(conjunto.contains("Test"));
	System.out.println(conjunto.contains('x'));
}}

