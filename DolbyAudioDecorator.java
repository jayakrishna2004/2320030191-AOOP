package ott;

public class DolbyAudioDecorator extends StreamingServiceDecorator {
    public DolbyAudioDecorator(StreamingService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + ", Dolby Audio";
    }

    @Override
    public double getCost() {
        return decoratedService.getCost() + 1.99;
    }
}

