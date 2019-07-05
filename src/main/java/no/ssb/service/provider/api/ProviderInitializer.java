package no.ssb.service.provider.api;

import java.util.Map;
import java.util.Set;

public interface ProviderInitializer<T> {

    String providerId();

    Set<String> configurationKeys();

    T initialize(Map<String, String> configuration);

}
