package dms;

public class DocumentManagementSystem {
    public static void main(String[] args) {
        // Initialize services
        DocumentStorageService storageService = new InMemoryDocumentStorageService();
        DocumentSharingService sharingService = new SimpleDocumentSharingService();

        // Wrap storage service with access control and audit logging
        DocumentStorageService secureStorage = new AuditLoggingDecorator(new AccessControlProxy(storageService, "ADMIN"));

        // Create and store a document
        Document document = new BasicDocument("SampleDoc.txt", "This is a sample document.".getBytes(), "Sample metadata");
        secureStorage.storeDocument(document);

        // Retrieve the document
        Document retrievedDoc = secureStorage.retrieveDocument("SampleDoc.txt");
        System.out.println("Retrieved Document: " + new String(retrievedDoc.getContent()));

        // Share the document
        String shareLink = sharingService.generateShareLink(retrievedDoc, "read-only");
        System.out.println("Share Link: " + shareLink);

        // Access the shared document
        Document sharedDoc = sharingService.accessSharedDocument(shareLink);
        System.out.println("Accessed Shared Document: " + new String(sharedDoc.getContent()));
    }
}

