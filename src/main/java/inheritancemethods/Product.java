package inheritancemethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight) {
        this(name, unitWeight, 2);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }


    public BigDecimal totalWeight(int pieces) {
        return unitWeight.multiply(new BigDecimal(String.valueOf(pieces))).setScale(numberOfDecimals, RoundingMode.HALF_UP);
    }
}

//// Java program to demonstrate the multiply() method
//
//import java.math.*;
//
//public class gfg {
//
//	public static void main(String[] args)
//	{
//
//		// Assign two BigDecimal objects
//		BigDecimal b1 = new BigDecimal("54.2");
//		BigDecimal b2 = new BigDecimal("14.20");
//
//		// Multiply b1 with b2 and assign result to b3
//		BigDecimal b3 = b1.multiply(b2);
//
//		// Print b3 value
//		System.out.println("Multiplication is " + b3);
//	}
//}


//int number = 23;
//	String str = String.valueOf(number);


// java.math.BigDecimal.setScale() method:
//public BigDecimal setScale(int newScale, RoundingMode roundingMode)
//hány tizedesjegyet, hogyan kerekítsen


//static int ROUND_HALF_UP − Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
