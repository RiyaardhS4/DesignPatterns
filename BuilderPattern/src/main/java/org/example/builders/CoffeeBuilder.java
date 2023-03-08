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
 * Created: 2023/03/08 07:57
 *
 ***********************************************************************/
package org.example.builders;

import org.example.drink.Coffee;
import org.example.components.Honey;
import org.example.components.Milk;
import org.example.components.Sugar;
import org.example.components.WhippedCream;

public class CoffeeBuilder implements Builder {

	private Honey honey;
	private Milk milk;
	private Sugar sugar;

	private WhippedCream whippedCream;

	@Override
	public void setHoney(Honey honey) {
		this.honey = honey;
	}

	@Override
	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	@Override
	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}

	@Override
	public void setWhippedCream(WhippedCream whippedCream) {
		this.whippedCream = whippedCream;
	}

	public Coffee getResult(){
		return new Coffee(honey,milk,sugar,whippedCream);}
}
