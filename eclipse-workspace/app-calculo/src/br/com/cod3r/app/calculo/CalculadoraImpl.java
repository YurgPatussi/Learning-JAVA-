package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoresAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

	private OperacoresAritmeticas opAtitmeticas = new OperacoresAritmeticas();

	public double soma(double... nums) {
	Logger.info("Somando...");
		return opAtitmeticas.soma(nums);
	}
	
	
}
