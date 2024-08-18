package dms;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SimpleDocumentSharingService implements DocumentSharingService {
    private Map<String, Document> sharedDocuments = new HashMap<>();

    @Override
    public String generateShareLink(Document document, String permissions) {
        String shareLink = UUID.randomUUID().toString();
        sharedDocuments.put(shareLink, document);
        return shareLink;
    }

    @Override
    public Document accessSharedDocument(String shareLink) {
        return sharedDocuments.get(shareLink);
    }
}
