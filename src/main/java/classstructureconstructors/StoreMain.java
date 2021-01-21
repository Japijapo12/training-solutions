package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("Alma");

        store.store(20);
        store.dispatch(4);

        System.out.println(store.getProduct() + " " + store.store() + " kg");

        store.store(30);
        store.dispatch(2);

        System.out.println(store.getProduct() + " " + store.store() + " kg");



        Store storeTwo = new Store("Körte");

        storeTwo.store(50);
        storeTwo.dispatch(8);

        System.out.println(storeTwo.getProduct() + " " + storeTwo.store() + " kg");

        storeTwo.store(10);
        storeTwo.dispatch(2);

        System.out.println(storeTwo.getProduct() + " " + storeTwo.store() + " kg");

    }
}
