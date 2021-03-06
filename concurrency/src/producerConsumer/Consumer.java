package producerConsumer;

import java.util.List;

public class Consumer implements Runnable {
    List<Integer> questionList = null;
    final int limit = 5;
    private int questionNumber;


    public Consumer(List<Integer> questionList){
        this.questionList = questionList;
    }
    public void answerQuestion() throws InterruptedException {
        synchronized (questionList){
            while(questionList.isEmpty()){
                System.out.println("No questions to answer... Waiting for producer to get questions");
                questionList.wait();
            }
        }
        synchronized (questionList){
            Thread.sleep(5000);
            System.out.println("Answered question: " + questionList.remove(0));
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

