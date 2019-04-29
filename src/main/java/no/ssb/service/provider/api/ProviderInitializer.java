package no.ssb.service.provider.api;

import no.ssb.config.DynamicConfiguration;

import java.util.Set;

public interface ProviderInitializer<T> {

    String providerId();

    Set<String> configurationKeys();

    T initialize(DynamicConfiguration configuration);

}
