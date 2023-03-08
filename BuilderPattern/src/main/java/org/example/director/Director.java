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
 * Created: 2023/03/08 07:15
 *
 ***********************************************************************/
package org.example.director;

import org.example.builders.Builder;
import org.example.components.*;

public class Director {

	public void constructDeluxeDrink(Builder builder) {
		builder.setSugar(new Sugar(3));
		builder.setMilk(new Milk(25));
		builder.setHoney(new Honey(3));
		builder.setWhippedCream(new WhippedCream(15));
	}

	public void constructBasicDrink(Builder builder) {
		builder.setSugar(new Sugar(2));
		builder.setMilk(new Milk(25));
	}

}