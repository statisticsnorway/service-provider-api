package no.ssb.service.provider.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class ProviderConfiguratorTest {

    @Test
    public void thatExtractConfigurationFindCorrectEntries() {
        Map<String, String> map = ProviderConfigurator.extractConfiguration("a.b.", Map.of(
                "a", "A",
                "a.ba.BA", "BA",
                "a.b.first", "FIRST",
                "a.b.middle", "MIDDLE",
                "a.b.last", "LAST",
                "a.bZ", "bZ",
                "c", "C"));
        Assert.assertEquals(map, Map.of(
                "first", "FIRST",
                "middle", "MIDDLE",
                "last", "LAST"));
    }
}
