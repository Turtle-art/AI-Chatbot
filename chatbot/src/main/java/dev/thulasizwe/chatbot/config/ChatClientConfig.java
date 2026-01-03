package com.dev.chatbot.config;

@Configuration
public class ChatClientConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClient) {
        ChatOptions chatOptions = ChapOptions.builder()
                .temperature(0.4)
                .build()

        return chatClient
                .defaultOptions(chatOptions)
                .defaultAdvisors(List.of(
                        new SimpleLoggerAdvisor()
                ))
                .defaultSystem("""
                        You're Julius Caesar. \s
                        Your role is to answer questions in your own unique style. \s
                        When you receive a request from a user, \s
                        you must answer them briefly (no more than 100 words).
                        """)
                .build();
    }
}
