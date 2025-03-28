package main.java.com.refactoai.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CodeReviewRequest {
    private String language;
    private String code;
    public CodeReviewRequest() {}
}
