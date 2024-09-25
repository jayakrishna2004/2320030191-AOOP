package ott;

public class HDDecorator extends StreamingServiceDecorator {
    public HDDecorator(StreamingService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + ", HD";
    }

    @Override
    public double getCost() {
        return decoratedService.getCost() + 2.99;
    }
}

