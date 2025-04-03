package main.java.com.refactoai.controller;

import main.java.com.refactoai.dto.CodeReviewRequest;
import main.java.com.refactoai.dto.STATUS;
import main.java.com.refactoai.dto.StatusResponse;
import main.java.com.refactoai.service.CamelAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CodeReviewController {
    @Autowired
    CamelAiService camelAiService;
    @GetMapping("/status")
    public StatusResponse getApiStatus() {
        return new StatusResponse(STATUS.RUNNING, STATUS.RUNNING);
    }

    @PostMapping("/code-review")
    public String submitCodeForReview(@RequestBody CodeReviewRequest request) {
        return camelAiService.refactor(request);
    }
}
