package week14d04;

import java.util.ArrayList;
import java.util.List;

public class Contract {

    private String client;
    private List<Integer> monthlyPrices;


    //ez egy saját osztálynak létrehozott copy konstruktor:
    public Contract(Contract contract, String client) {
        this.client = client;
        monthlyPrices = new ArrayList<>(contract.monthlyPrices);
    }

    public Contract(String client, List<Integer> monthlyPrices) {
        this.client = client;
        this.monthlyPrices = monthlyPrices;
    }

    public String getClient() {
        return client;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "client='" + client + '\'' +
                ", monthlyPrices=" + monthlyPrices +
                '}';
    }
}

//Legyen egy szerződés (Contract) osztály, melynek van egy String client és egy List<Integer> monthlyPrices attribútuma.
// Az előbbi a szerződő neve, a második pedig a havonta fizetendő összeg.
//Legyen egy ContractCreator osztály, melynek van egy ContractCreator(String client, List<Integer> monthlyPrices) konstruktora,
// mely létrehoz egy szerződéssablont, a paraméterként megadott adatokkal, melyet összesen EGY attribútumban tárolj!
//Majd írj egy create(String name) metódust, mely a sablon alapján létrehoz egy
//új szerződést, de a nevet kicseréli a paraméterként megadott névre.
//Próbáld ki, hogy a visszaadott szerződésben módosítod a 12. havi értéket.