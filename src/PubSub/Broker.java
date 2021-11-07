package PubSub;
import java.util.ArrayList;
import java.util.Hashtable;

public class Broker {
    private Hashtable<Channel, ArrayList<Subscriber>> subscribersList;
    private static Broker broker;
    private Broker() {
        this.subscribersList = new Hashtable<Channel, ArrayList<Subscriber>>();
        Broker.broker = new Broker();
    }
    public static Broker getInstance() {
        return Broker.broker;
    }
    public void emit(Channel channel, Message m) {
        ArrayList<Subscriber> subscribers = subscribersList.get(channel);
        for (Subscriber subscriber : subscribers) {
            subscriber.receivedMessage(channel, m);
        }
    }
    public void on(Subscriber s, Channel channel) {
        subscribersList.get(channel).add(s);
        //return desuscriptor
    }