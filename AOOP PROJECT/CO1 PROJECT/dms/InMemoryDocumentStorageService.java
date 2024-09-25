package dms;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDocumentStorageService implements DocumentStorageService {
    private Map<String, Document> storage = new HashMap<>();

    @Override
    public void storeDocument(Document document) {
        storage.put(document.getName(), document);
    }

    @Override
    public Document retrieveDocument(String name) {
        return storage.get(name);
    }
}


