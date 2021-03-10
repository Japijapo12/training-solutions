package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {


    List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public int getNumberOfItemsLeft() {
        int i = 0;
        for (Todo todo : todos) {
            if (todo.getState() == State.NON_COMPLETED) {
                i++;
            }
        }
        return i;
    }

    public List<String> getMostImportantTodosText() {
        List<String> mostImportantTodosTexts = new ArrayList<>();
        int maxPriority = 5;
        for ( Todo todo : todos) {
            if (todo.getPriority() < maxPriority) {
                maxPriority = todo.getPriority();
                mostImportantTodosTexts.clear();
                mostImportantTodosTexts.add(todo.getText());
            }
            else if ( todo.getPriority() == maxPriority ) {
                mostImportantTodosTexts.add(todo.getText());
            }
        }
        return mostImportantTodosTexts;
    }

    public void deleteCompleted() {
        List<Todo> toRemove = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getState() == State.COMPLETED) {
                toRemove.add(todo);
            }
        }
        todos.removeAll(toRemove);
    }

}



/*
Legyen egy TodoList osztály, mely több tennivalót tartalmaz! Egy List<T odo> attribútumban tartalmazza a tennivalókat.

Metódusai:

getNumberOfItemsLeft() - visszaadja a még el nem készült tennivalók számát
getMostImportantTodosText() - visszaadja a legyfontosabb tennivalókat. Nem feltétlen van 1-es prioritású.
deleteCompleted() - a listából kitörli az elvégzetteket
 */
