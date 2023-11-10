package com.example;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main{
    public static void main(String[] args) {
        
    }

    public void start(Stage stage){
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("opiumbotpage1.fxml"));
        Parent root = loader.load();
        opiumbotpage1controller controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage1 = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}