package dms;

public class AccessControlProxy implements DocumentStorageService {
    private DocumentStorageService storageService;
    private String currentUserRole;

    public AccessControlProxy(DocumentStorageService storageService, String currentUserRole) {
        this.storageService = storageService;
        this.currentUserRole = currentUserRole;
    }

    @Override
    public void storeDocument(Document document) {
        if ("ADMIN".equals(currentUserRole)) {
            storageService.storeDocument(document);
        } else {
            throw new SecurityException("Access Denied: Insufficient permissions to store document.");
        }
    }

    @Override
    public Document retrieveDocument(String name) {
        if ("USER".equals(currentUserRole) || "ADMIN".equals(currentUserRole)) {
            return storageService.retrieveDocument(name);
        } else {
            throw new SecurityException("Access Denied: Insufficient permissions to retrieve document.");
        }
    }
}

