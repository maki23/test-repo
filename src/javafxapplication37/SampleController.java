/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication37;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Bence Kornis
 */
public class SampleController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("h");
        System.out.print(this);
        label.setText("Hello World!");
        System.out.println("hello3");
        System.out.println("hello23");
        System.out.println("hello23");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
