package dms;

public class BasicDocument implements Document {
    private String name;
    private byte[] content;
    private String metadata;

    public BasicDocument(String name, byte[] content, String metadata) {
        this.name = name;
        this.content = content;
        this.metadata = metadata;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public byte[] getContent() {
        return content;
    }

    @Override
    public String getMetadata() {
        return metadata;
    }
}

