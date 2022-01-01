package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		System.out.println(gato);
		System.out.println(livro);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello, World! " + (a+b));*/
	}
}

class Livro {
	public String livro;
	public Integer numPaginas;
}