public class ProducerConsumerExampleMain {
    
        public static void main(String[] args) {
            ProducerConsumerExample producerConsumerExample = new ProducerConsumerExample();
    
            Producer producer = new Producer(producerConsumerExample, 10);
            Consumer consumer = new Consumer(producerConsumerExample, 10);
    
            producer.start();
            consumer.start();
        }
    
    
    
}
