package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.CalculadoraImpl;
import br.com.cod3r.app.calculo.interno.OperacoresAritmeticas;

public class Test {
public static void main(String[] args) {
	

	CalculadoraImpl calc = new CalculadoraImpl();
	System.out.println(calc.soma(1,2,3,4));

	OperacoresAritmeticas op = new OperacoresAritmeticas();
	System.out.println(op.soma(4,5,6));
}}
