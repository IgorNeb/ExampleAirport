package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import start.Main;

import java.io.IOException;

public class MainController{

    @FXML
    public void goArrivals()throws IOException{
        Main.showArrivalsWindow();
    }

    @FXML
    public  void goDeparture()throws IOException{
        Main.showDepartureWindow();
    }





}
