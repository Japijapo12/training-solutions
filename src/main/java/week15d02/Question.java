package week15d02;

public class Question {

    private String question;
    private String answer;
    private int score;
    private String type;

    public Question(String question, String answer, int score, String type) {
        this.question = question;
        this.answer = answer;
        this.score = score;
        this.type = type;
    }


    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                ", type='" + type + '\'' +
                '}';
    }
}
