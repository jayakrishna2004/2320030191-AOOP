package ott;

public class BasicStreamingService implements StreamingService {
    @Override
    public String getDescription() {
        return "Basic Streaming Service";
    }

    @Override
    public double getCost() {
        return 9.99; 
    }
}
