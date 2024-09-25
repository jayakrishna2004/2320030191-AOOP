package dms;

public interface DocumentStorageService {
    void storeDocument(Document document);
    Document retrieveDocument(String name);
}

