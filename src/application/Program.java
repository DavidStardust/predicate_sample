//Fazer um programa que, a partir de uma lista de produtos, remova da
//lista somente aqueles cujo pre�o m�nimo seja 100.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.removeIf( p -> p.getPrice() >= 100); //Express�o lambda com predicado
		list.removeIf(Product::staticProductPredicate); //method reference
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
