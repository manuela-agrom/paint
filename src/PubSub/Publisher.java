package PubSub;

public class Publisher {
    public Publisher(Channel channel) {
        this.channel = channel;
    }

    public void publish(Message m) {
        Broker.getInstance().emit(this.channel, m);
    }
}
