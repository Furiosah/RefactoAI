package main.java.com.refactoai.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CodeReviewResponse {
    private String optimizedCode;
    private List<String> suggestions;
    public CodeReviewResponse() {}
}
