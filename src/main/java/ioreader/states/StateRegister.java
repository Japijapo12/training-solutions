package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    List<State> states = new ArrayList<>();

    public void readStatesFromFile(String fileName) {

        Path file = Path.of("src/main/resources/"+fileName);

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] NameAndCapital = line.split("-");
                State state = new State(NameAndCapital[0], NameAndCapital[1]);
                states.add(state);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public String findCapitalByStateName(String stateName) {
        for (State state : states) {
            if (stateName.equals(state.getStateName())) {
                return state.getCapital();

            }

        }
        throw new IllegalArgumentException("No state with this name!");
    }




}
