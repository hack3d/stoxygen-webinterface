package de.stoxygen;

import de.stoxygen.model.AggregatedBond;
import de.stoxygen.model.Bond;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RestfulClient {
    private static final Logger logger = LoggerFactory.getLogger(RestfulClient.class);

    RestTemplate restTemplate;

    public RestfulClient() {
        restTemplate = new RestTemplate();
    }

    /**
     * Information are from stoxygen-downloader
     * @param url
     */
    public List<Bond> getAllBonds(String url) {
        List<Bond> list = new ArrayList<>();
        url = url + "/api/v1/bonds";
        logger.info("Begin /GET request to {}", url);

        Bond[] data = restTemplate.getForObject(url, Bond[].class);
        list = Arrays.asList(data);

        return list;
    }

    public List<AggregatedBond> get1MinAggregatedData(String exchange, String bond, Long timestamp, String url) {
        List<AggregatedBond> list = new ArrayList<>();
        url = url + "/api/v1/aggregatedData/1min/exchange/"+ exchange + "/isin/" + bond + "/latestTimestamp/" + timestamp.toString();
        logger.info("Begin /GET request to {}", url);

        AggregatedBond[] data = restTemplate.getForObject(url, AggregatedBond[].class);
        list = Arrays.asList(data);

        return list;
    }
}
