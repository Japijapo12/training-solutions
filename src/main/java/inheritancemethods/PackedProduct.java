package inheritancemethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product {

   private int packingUnit;  // hány van egy dobozban
   private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitweight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitweight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int numberOfBoxes = pieces % packingUnit == 0 ? pieces / packingUnit : pieces / packingUnit + 1; // hány doboz kell (ha van maradék, eggyel több doboz
        BigDecimal box = weightOfBox.multiply(new BigDecimal(String.valueOf(numberOfBoxes))); // doboz súlya szorozva a dobozok számával

        return super.totalWeight(pieces).add(box).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
    }
}
