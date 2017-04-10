package edu.weberstate.cs3230;

import javafx.event.EventHandler;
import javafx.scene.control.ButtonBase;

import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
        ButtonBase button = new ButtonBase() {
            @Override
            public void fire() {

            }
        };
        button.setOnAction(event -> {

        });
    }
}
