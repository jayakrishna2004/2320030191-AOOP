package ott;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Test1	 {

    @Test
    void testBasicService() {
        StreamingService service = new BasicStreamingService();
        System.out.println("Description: " + service.getDescription());
        System.out.println("Cost: " + service.getCost());

        assertEquals("Basic Streaming Service", service.getDescription());
        assertEquals(9.99, service.getCost(), 0.01);
    }

    @Test
    void testHDDecorator() {
        StreamingService service = new BasicStreamingService();
        service = new HDDecorator(service);

        System.out.println("Description with HD: " + service.getDescription());
        System.out.println("Cost with HD: " + service.getCost());

        assertEquals("Basic Streaming Service, HD", service.getDescription());
        assertEquals(12.98, service.getCost(), 0.01);
    }

    @Test
    void testDolbyAudioDecorator() {
        StreamingService service = new BasicStreamingService();
        service = new DolbyAudioDecorator(service);

        System.out.println("Description with Dolby Audio: " + service.getDescription());
        System.out.println("Cost with Dolby Audio: " + service.getCost());

        assertEquals("Basic Streaming Service, Dolby Audio", service.getDescription());
        assertEquals(11.98, service.getCost(), 0.01);
    }

    @Test
    void testChannelsDecorator() {
        StreamingService service = new BasicStreamingService();
        service = new ChannelsDecorator(service);

        System.out.println("Description with Additional Channels: " + service.getDescription());
        System.out.println("Cost with Additional Channels: " + service.getCost());

        assertEquals("Basic Streaming Service, Additional Channels", service.getDescription());
        assertEquals(14.98, service.getCost(), 0.01);
    }

    @Test
    void testMultipleDecorators() {
        StreamingService service = new BasicStreamingService();
        service = new HDDecorator(service);
        service = new DolbyAudioDecorator(service);
        service = new ChannelsDecorator(service);

        System.out.println("Description with HD, Dolby Audio, and Additional Channels: " + service.getDescription());
        System.out.println("Cost with HD, Dolby Audio, and Additional Channels: " + service.getCost());

        assertEquals("Basic Streaming Service, HD, Dolby Audio, Additional Channels", service.getDescription());
        assertEquals(19.96, service.getCost(), 0.01);
    }

    @Test
    void testDifferentOrderOfDecorators() {
        StreamingService service = new BasicStreamingService();
        service = new ChannelsDecorator(service);
        service = new DolbyAudioDecorator(service);
        service = new HDDecorator(service);

        System.out.println("Description with Additional Channels, Dolby Audio, and HD: " + service.getDescription());
        System.out.println("Cost with Additional Channels, Dolby Audio, and HD: " + service.getCost());

        assertEquals("Basic Streaming Service, Additional Channels, Dolby Audio, HD", service.getDescription());
        assertEquals(19.96, service.getCost(), 0.01);
    }
}

