package br.com.cod3r.app.calculo.interno;

import java.util.Arrays;

public class OperacoresAritmeticas {

	public double soma (double...  nums) {
		return Arrays.stream(nums).reduce(0.0, (t,a) -> t+a);
	}
}
