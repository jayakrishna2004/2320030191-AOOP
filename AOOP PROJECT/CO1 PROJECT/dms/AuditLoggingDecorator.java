package dms;

public class AuditLoggingDecorator implements DocumentStorageService {
    private DocumentStorageService storageService;

    public AuditLoggingDecorator(DocumentStorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public void storeDocument(Document document) {
        System.out.println("Audit Log: Storing document - " + document.getName());
        storageService.storeDocument(document);
    }

    @Override
    public Document retrieveDocument(String name) {
        System.out.println("Audit Log: Retrieving document - " + name);
        return storageService.retrieveDocument(name);
    }
}

