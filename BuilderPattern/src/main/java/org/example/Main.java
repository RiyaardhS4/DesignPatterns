package org.example;

import org.example.builders.CoffeeBuilder;
import org.example.builders.TeaBuilder;
import org.example.drink.Coffee;
import org.example.drink.Tea;
import org.example.director.Director;

public class Main {
	public static void main(String[] args) {

		Director director = new Director();

		TeaBuilder teaBuilder = new TeaBuilder();
		director.constructBasicDrink(teaBuilder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		Tea tea = teaBuilder.getResult();
		System.out.println(tea.listIngredients());

		CoffeeBuilder coffeeBuilder = new CoffeeBuilder();

		// Director may know several building recipes.
		director.constructDeluxeDrink(coffeeBuilder);
		Coffee coffee = coffeeBuilder.getResult();
		System.out.println(coffee.listIngredients());

		director.constructDeluxeDrink(teaBuilder);
		tea = teaBuilder.getResult();
		System.out.println(tea.listIngredients());

	}

}