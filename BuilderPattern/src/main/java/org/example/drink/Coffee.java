/************************************************************************
 *                                                                      *
 *  DDDD     SSSS    AAA        Daten- und Systemtechnik Aachen GmbH    *
 *  D   D   SS      A   A       Pascalstrasse 28                        *
 *  D   D    SSS    AAAAA       52076 Aachen-Oberforstbach, Germany     *
 *  D   D      SS   A   A       Telefon: +49 (0)2408 / 9492-0           *
 *  DDDD    SSSS    A   A       Telefax: +49 (0)2408 / 9492-92          *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by DSA - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Author : Riyaardh Adam
 * Created: 2023/03/08 07:56
 *
 ***********************************************************************/
package org.example.drink;

import org.example.components.Honey;
import org.example.components.Milk;
import org.example.components.Sugar;
import org.example.components.WhippedCream;

public class Coffee {

	private final Honey honey;
	private final Milk milk;
	private final Sugar sugar;

	private final WhippedCream whippedCream;

	public Coffee(Honey honey, Milk milk, Sugar sugar, WhippedCream whippedCream) {
		this.honey = honey;
		this.milk = milk;
		this.sugar = sugar;
		this.whippedCream = whippedCream;
	}

	public String listIngredients(){
		String info = "Brewing coffee with ingredients:\n";
		if (this.sugar != null) {
			info += "Sugar: " +sugar.teaspoons+ " teaspoons\n";
		}
		if (this.milk != null) {
			info += "Milk: " +milk.milliliters+ " milliliters\n";
		}
		if (this.honey != null) {
			info += "Honey: " +honey.milliliters+ " milliliters\n";
		}
		if (this.whippedCream != null) {
			info += "Whipped Cream: " +whippedCream.grams+ " grams\n";
		}

		return info;
	}

}
