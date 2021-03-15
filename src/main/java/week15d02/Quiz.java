package week15d02;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {

    private List<Question> questions = new ArrayList<>();


    public List<Question> getQuestions() {
        return new ArrayList<>(questions);
    }


    public List<Question> readFromFile(BufferedReader reader) {

        try {
            String line;
            String buffer;
            while ((line = reader.readLine()) != null) {
                buffer = reader.readLine();
                String[] temp = buffer.split(" ");
                String answer = temp[0];
                int score = Integer.parseInt(temp[1]);
                String type = temp[2];

                Question question = new Question(line, answer, score, type);
                questions.add(question);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return questions;

    }

    public List<String>  getQuestionBySubject(String subject) {
        List<String> result = new ArrayList<>();

        for ( Question question : questions ) {
            if ( question.getType().equals(subject)) {
                result.add(question.getQuestion());
            }
        }
        return result;
    }

    public Question randomQuestion() {
        Random random = new Random();
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

//Készíts egy metódust ami rendszerezi a kérdéseket témakörönként
    public Map<String, List<String>> getQuestionsBySubject() {
        Map<String, List<String>> resultMap = new HashMap<>();

        for (Question question : questions) {
            if (!resultMap.containsKey(question.getType())) {
                resultMap.put(question.getType(), new ArrayList<>());
            }
            resultMap.get(question.getType()).add(question.getQuestion());

        }
        return resultMap;
    }



    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("kerdesek.txt"))) {
            Quiz quiz = new Quiz();
            System.out.println(quiz.readFromFile(reader));


        } catch (IOException e) {
            throw new IllegalArgumentException("Can not find file");
        }
    }
}
