package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportamento {


public static void main(String[] args) {
	
Set <String>ListaDeAprovados = new HashSet<>();
ListaDeAprovados.add("Yurg");
ListaDeAprovados.add("Eduardo");
ListaDeAprovados.add("Patussi");

for (String Aprovados : ListaDeAprovados)
System.out.println(Aprovados);

SortedSet<String>Lista = new TreeSet <>();

Lista.add("Yurg");
Lista.add("Eduardo");
Lista.add("Patussi");

for (String Nome : Lista)
System.out.println(Nome);

Set <Integer> Num = new HashSet <>();

Num.add(1);
Num.add(2);
Num.add(3);

for (Integer Number : Num)
System.out.println(Number);

}	

}