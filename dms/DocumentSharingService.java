package dms;

public interface DocumentSharingService {
    String generateShareLink(Document document, String permissions);
    Document accessSharedDocument(String shareLink);
}