package week03d05;


public class Operation {
    private int leftOperand;
    private int rightOperand;

    public Operation(String expression) {
        String left = expression.substring(0, expression.indexOf("+")).trim();
        //másképp:
        // left = left.trim() - mert trim nélkül, üres space esetén elszáll a teszt;
        leftOperand = Integer.parseInt(left);

        String right = expression.substring(expression.indexOf("+") + 1);
        right = right.trim();
        rightOperand = Integer.parseInt(right);


    }

    public int getResult() {
        return leftOperand + rightOperand;
    }


    public static void main(String[] args) {
        Operation operation = new Operation("68+12");
        System.out.println(operation.getResult());
    }
}


//Írj egy Operation osztályt, mely konstruktorban kap egy összeadást, pl. 68+12!
// A getResult() metódus visszaadja a művelet eredményét.
// Egy belső leftOperand és rightOperand attribútumba dolgozz!
