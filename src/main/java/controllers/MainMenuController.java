package controllers;

import controllers.abstractions.ButtonController;
import javafx.fxml.FXML;

public class MainMenuController extends ButtonController{
  @FXML
  public void initialize() {
    System.out.println("MainMenuController initialized");
  }

  @FXML
  private void onExit() {
    System.exit(0);
  }

  @FXML
  private void onInfo() {
    System.out.println("Info clicked");
  }

  @FXML
  private void onSettings() {
    System.out.println("Settings clicked");
  }

  @FXML
  private void onPlay() {
    System.out.println("Play clicked");
  }

}
