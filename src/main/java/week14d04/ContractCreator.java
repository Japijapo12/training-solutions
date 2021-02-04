package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String name, List<Integer> monthlyPrices) {
        template = new Contract(name, monthlyPrices);
    }

    public Contract create(String client) {
        return new Contract(client, new ArrayList<>(template.getMonthlyPrices()));   //copy constructor
    }

//    public Contract create(String client) {
//        return new Contract(template, client);
//    }

    public static void main(String[] args) {
        ContractCreator creator = new ContractCreator("Minta János", new ArrayList<>(List.of(10,10,10)));
        Contract contract1 = creator.create("Jonn Doe");
        Contract contract2 = creator.create("Jack Doe");

        System.out.println(contract1.toString());
        System.out.println(contract2);

        contract1.getMonthlyPrices().set(1, 20);
        System.out.println(contract1);
        System.out.println(contract2);

        //creator.create("Jane Doe").getMonthlyPrices().set(1,20);
        Contract contract3 = creator.create("Jane Doe");
        System.out.println(contract3);

    }

}
//ezt írja ki:  (John Doe át lett állítva 20-ra, a többi a template-ben lévő 10,10,10 marad
//Contract{client='Jonn Doe', monthlyPrices=[10, 10, 10]}
//Contract{client='Jack Doe', monthlyPrices=[10, 10, 10]}
//Contract{client='Jonn Doe', monthlyPrices=[10, 20, 10]}
//Contract{client='Jack Doe', monthlyPrices=[10, 10, 10]}
//Contract{client='Jane Doe', monthlyPrices=[10, 10, 10]}