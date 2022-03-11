package concurrencyUtils;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    int questionNumber;
    BlockingQueue<Integer> questionQueue;
    public Producer(BlockingQueue<Integer> questionQueue){
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {
        try {
            synchronized (this){
                int nextQuestion = questionNumber++;
                System.out.println("Got new question: " + nextQuestion);
                questionQueue.put(nextQuestion);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
