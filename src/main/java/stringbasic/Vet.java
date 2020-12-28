package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    private boolean areEquals(Pet petOne, Pet petTwo) {
        return petOne.getRegNumber().equals(petTwo.getRegNumber());
    }


    public void add(Pet newPet) {
        for (Pet petOne : pets) {
            if (areEquals(petOne, newPet)) {
                return;
            }

        }
        pets.add(newPet);
    }
}
