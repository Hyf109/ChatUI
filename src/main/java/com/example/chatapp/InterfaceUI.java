package com.example.chatapp;

import java.nio.file.Paths;

public interface InterfaceUI {
    String CURRENTPACK = Paths.get("").toAbsolutePath() + "/";
    String RESOURCES = "src/main/resources/com/example/chatapp/";
    String TEXTURE = "Texture/";
    String CAT = "cat.png";
    String DOG = "dog.png";
    String CHICKEN = "chicken.png";
    String PIG = "pig.png";
    String BIRD = "bird.png";
    String CHATBOX = "chatBox.fxml";
}
