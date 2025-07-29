package org.example;

import dev.langchain4j.model.openai.OpenAiChatModel;

public class App {
    public static void main(String[] args) {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://localhost:11434/v1")
                .modelName("qwen3:0.6b")
                .logRequests(true)
                .logResponses(true)
                .build();

        String answer = model.chat("你好，你是谁？");
        System.out.println(answer);
    }
}