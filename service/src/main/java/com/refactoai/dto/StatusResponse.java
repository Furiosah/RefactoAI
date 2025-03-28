package main.java.com.refactoai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StatusResponse {
    STATUS serviceStatus;
    STATUS camelAIStatus;
    public StatusResponse(){};
}
