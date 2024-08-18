package ott;

public class Main {
    public static void main(String[] args) {
        StreamingService service = new BasicStreamingService();
        System.out.println(service.getDescription() + " $" + service.getCost());

        service = new HDDecorator(service);
        System.out.println(service.getDescription() + " $" + service.getCost());

        service = new DolbyAudioDecorator(service);
        System.out.println(service.getDescription() + " $" + service.getCost());

        service = new ChannelsDecorator(service);
        System.out.println(service.getDescription() + " $" + service.getCost());
    }
}

