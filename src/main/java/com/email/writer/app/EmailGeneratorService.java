package com.email.writer.app;

import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {
    public String generateEmailReply(EmailRequest emailRequest) {
        //Build the prompt
        String prmpt = buildPrompt(emailRequest)
        //Craft the request
    }
    private String buildPrompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a professional email reply for the following email content");
        return null;
    }
}
