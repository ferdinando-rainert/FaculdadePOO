package encapsulamento;

import encapsulamento.classes.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caderno", 12.00, 5);
		Produto p2 = new Produto("Lápis", 5.00, 25);
		
		System.out.println(p1.getNome());
		System.out.println(p2.getPreco());

	}

}