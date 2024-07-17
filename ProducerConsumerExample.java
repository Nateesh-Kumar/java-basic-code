import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumerExample {
    private Queue<Integer> queue = new LinkedList<>();
    private int maxSize = 5;

    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == maxSize) {
            wait();
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notify();
    }
}

class Producer extends Thread {
    private ProducerConsumerExample producerConsumerExample;
    private int itemsToProduce;

    public Producer(ProducerConsumerExample producerConsumerExample, int itemsToProduce) {
        this.producerConsumerExample = producerConsumerExample;
        this.itemsToProduce = itemsToProduce;
    }

    @Override
    public void run() {
        for (int i = 1; i <= itemsToProduce; i++) {
            try {
                producerConsumerExample.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private ProducerConsumerExample producerConsumerExample;
    private int itemsToConsume;

    public Consumer(ProducerConsumerExample producerConsumerExample, int itemsToConsume) {
        this.producerConsumerExample = producerConsumerExample;
        this.itemsToConsume = itemsToConsume;
    }

    @Override
    public void run() {
        for (int i = 1; i <= itemsToConsume; i++) {
            try {
                producerConsumerExample.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


