package org.example;
import dev.langchain4j.model.openai.OpenAiChatModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OpenAiChatModel.builder()
                .baseUrl("https://api.openai.com/v1")
                .apiKey("sk-xxx")
                .build();
        System.out.println();
    }
}
