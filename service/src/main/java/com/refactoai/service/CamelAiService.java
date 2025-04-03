package main.java.com.refactoai.service;

import main.java.com.refactoai.dto.CodeReviewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CamelAiService {
    @Autowired
    private RestTemplate restTemplate;

    public String refactor(CodeReviewRequest code) {
        String url = "http://localhost:5001/refactor";
        // Prepare headers for JSON content type
        String jsonBody = String.format("{\"token\":\"%s\", \"code\":\"%s\"}", code.getToken(), code.getCode());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create an HttpEntity with the JSON body and headers
        HttpEntity<String> entity = new HttpEntity<>(jsonBody, headers);

        // Send POST request
        ResponseEntity<String> response = restTemplate.exchange(
                url, HttpMethod.POST, entity, String.class);

        return response.getBody();
    }

}
