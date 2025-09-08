package com.zaid.patel.Chat.model;

import lombok.Data;

@Data
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;

    public ChatMessage(Long id, String sender, String content) {
        this.id = id;
        this.sender = sender;
        this.content = content;
    }
}
