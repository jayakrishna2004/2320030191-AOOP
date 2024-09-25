package ott;

public class ChannelsDecorator extends StreamingServiceDecorator {
    public ChannelsDecorator(StreamingService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + ", Additional Channels";
    }

    @Override
    public double getCost() {
        return decoratedService.getCost() + 4.99;
    }
}
