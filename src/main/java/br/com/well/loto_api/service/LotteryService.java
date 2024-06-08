package br.com.well.loto_api.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LotteryService {

    @Value("${LOTTERY_API_BASE_URL}")
    private String baseUrl;

    @PostConstruct
    public void validateBaseUrl(){
        if(baseUrl== null || baseUrl.isEmpty()){
            throw new IllegalArgumentException("The environment variable LOTTERY_API_BASE_URL cannot be set.");
        }
    }

    public String getLotteryData(String lotteryType) {
        RestTemplate restTemplate = new RestTemplate();
        String url = baseUrl + lotteryType;

        return restTemplate.getForObject(url, String.class);
    }
}