package com.itsaimao;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label lbExample1;

    @FXML
    private Label lbExample2;

    @FXML
    private Label lbIdiom;

    @FXML
    private Label lbMeaning;

    @FXML
    private ListView<Idiom> lvIdioms;

    @FXML
    private TextField tfFilter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        initActions();
        // Display a welcome message initially
        showWelcomeMessage();
    }

    private void showWelcomeMessage() {
        lbIdiom.setText("Welcome to English Idioms Dictionary!");
        lbMeaning.setText("Select an idiom from the list on the left to learn its meaning and see examples of how to use it.");
        lbExample1.setText("This application contains over 1000 commonly used English idioms.");
        lbExample2.setText("Use the search box above to find specific idioms by keyword.");
    }

    private void initActions() {
        tfFilter.textProperty().addListener((observable, oldValue, newValue) -> {
            var allData = Data.getIdiomList();
            if (newValue != null && !newValue.isBlank()) {
                var updatedData = new ArrayList<Idiom>();
                for (Idiom idiom : allData) {
                    if (idiom.getIdiom().toLowerCase().contains(newValue.toLowerCase())) {
                        updatedData.add(idiom);
                    }
                }
                updateData(updatedData);
            } else {
                updateData(allData);
            }
        });

        lvIdioms.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue != null) {
                lbIdiom.setText(newValue.getIdiom());
                lbMeaning.setText(newValue.getMeaning());
                lbExample1.setText("1. " + newValue.getExamples().get(0));
                lbExample2.setText("2. " + newValue.getExamples().get(1));
            }
        }));

    }

    private void updateData(List<Idiom> idioms) {
        lvIdioms.getItems().clear();
        lvIdioms.getItems().addAll(idioms);
    }

    private void initData() {
        var data = Data.getIdiomList();
        updateData(data);
    }
}