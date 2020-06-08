package com.algolia.osgi;

import com.algolia.search.DefaultSearchClient;
import com.algolia.search.SearchClient;
import com.algolia.search.models.indexing.IndicesResponse;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.List;

public class DemoBundle implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        String appID = System.getenv("ALGOLIA_APPLICATION_ID_ANTHONY");
        String apiKey = System.getenv("ALGOLIA_ADMIN_KEY_ANTHONY");
        SearchClient client = DefaultSearchClient.create(appID, apiKey);
        List<IndicesResponse> indices = client.listIndices();
        System.out.printf("Algolia Demo Bundle is starting (%d indices)\n", indices.size());
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Algolia Demo Bundle is stopping.");
    }
}
