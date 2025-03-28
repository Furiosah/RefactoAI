package main.java.com.refactoai.controller;

import main.java.com.refactoai.dto.CodeReviewRequest;
import main.java.com.refactoai.dto.CodeReviewResponse;
import main.java.com.refactoai.dto.STATUS;
import main.java.com.refactoai.dto.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class CodeReviewController {

    @GetMapping("/status")
    public StatusResponse getApiStatus() {
        return new StatusResponse(STATUS.RUNNING, STATUS.RUNNING);
    }

    @PostMapping("/code-review")
    public CodeReviewResponse submitCodeForReview(CodeReviewRequest request) {
        return new CodeReviewResponse();
    }
}
