
import java.util.Scanner;
public class QuestionService {

    Questions[] questions = new Questions[5];
    String selection []= new String[5];

public QuestionService(){
    questions[0]= new Questions(1, "What is the capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");
    questions[1]= new Questions(2, "What is the capital of Australia?", "Sydney", "Melbourne", "Canberra", "Perth", "Canberra");
    questions[2]= new Questions(3, "What is the capital of USA?", "Washington D.C.", "New York", "Los Angeles", "Chicago", "Washington D.C.");
    questions[3]= new Questions(4, "What is the capital of UK?", "Manchester", "Birmingham", "London", "Liverpool", "London");
    questions[4]= new Questions(5, "What is the capital of Japan?", "Tokyo", "Osaka", "Kyoto", "Hiroshima", "Tokyo");
}
public void CountScore(){
    int score = 0;
    for (int i =0; i < questions.length; i++){
        if (selection[i].equals(questions[i].getAnswer())){
            score++;
        }
    }
    System.out.println("Your score is: " + score);

}
public void displayQuestions(){
for (int i =0; i < questions.length; i++){
    System.out.println(questions[i].getQuestion());
    System.out.println("A. " + questions[i].getOpt1());
    System.out.println("B. " + questions[i].getOpt2());
    System.out.println("C. " + questions[i].getOpt3());
    System.out.println("D. " + questions[i].getOpt4());
    System.out.println("Enter your answer: ");
    Scanner sc = new Scanner(System.in);
    selection[i] = sc.nextLine();
    System.out.println("Answer: " + questions[i].getAnswer());
    if (selection[i].equals(questions[i].getAnswer())){
        System.out.println("Correct Answer");
    }
    else{
        System.out.println("Incorrect Answer");
    }
    sc.close();
    
    



}
}
    
}
