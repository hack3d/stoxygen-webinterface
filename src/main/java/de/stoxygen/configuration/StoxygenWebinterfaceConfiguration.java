package de.stoxygen.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StoxygenWebinterfaceConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(StoxygenWebinterfaceConfiguration.class);

    @Value("${downloader.url:}")
    private String downloaderUrl;

    @Value("${indicator.url:}")
    private String indicatorUrl;

    public String getDownloaderUrl() {
        return downloaderUrl;
    }

    public String getIndicatorUrl() {
        return indicatorUrl;
    }

}
