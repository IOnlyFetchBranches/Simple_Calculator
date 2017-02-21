import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private StringBuilder sb=new StringBuilder();
    private boolean reset;
    @FXML
    public Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button enter;
    @FXML
    private Button leftPar;
    @FXML
    private Button rightPar;
    @FXML
    private Button clear;
    @FXML
    private Button addButton;
    @FXML
    private Button subButton;
    @FXML
    private Button divideButton;
    @FXML
    private Button multButton;
    @FXML
    private Button x2;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    @FXML
    private TextArea screen=new TextArea();

    @FXML // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL url ,ResourceBundle resources) {
    check();
    //setup Screen
        screen.setWrapText(true);
        screen.setEditable(false);
        Tooltip helpScreenTip=new Tooltip("This is the Screen!");
        helpScreenTip.setMinSize(30,20);
        screen.setTooltip(helpScreenTip);
        screen.setCursor(Cursor.DISAPPEAR);


        initButtons();

    System.out.println("Initialized!");
    }


    private void check(){
        System.out.println("Checking!");
        assert button1 != null : "fx:id=\"1\" was not injected: check your FXML file 'simple.fxml'.";
        assert button2 != null : "fx:id=\"2\" was not injected: check your FXML file 'simple.fxml'.";
        assert button3 != null : "fx:id=\"3\" was not injected: check your FXML file 'simple.fxml'.";
        assert button4 != null : "fx:id=\"4\" was not injected: check your FXML file 'simple.fxml'.";
        assert button5 != null : "fx:id=\"5\" was not injected: check your FXML file 'simple.fxml'.";
        assert button6 != null : "fx:id=\"6\" was not injected: check your FXML file 'simple.fxml'.";
        assert button7 != null : "fx:id=\"7\" was not injected: check your FXML file 'simple.fxml'.";
        assert button8 != null : "fx:id=\"8\" was not injected: check your FXML file 'simple.fxml'.";
        assert button9 != null : "fx:id=\"9\" was not injected: check your FXML file 'simple.fxml'.";
        assert leftPar != null : "fx:id=\"(\" was not injected: check your FXML file 'simple.fxml'.";
        assert rightPar != null : "fx:id=\")\" was not injected: check your FXML file 'simple.fxml'.";
        assert enter != null : "fx:id=\"enter\" was not injected: check your FXML file 'simple.fxml'.";
        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'simple.fxml'.";
        assert addButton != null : "fx:id=\"+\" was not injected: check your FXML file 'simple.fxml'.";
        assert subButton != null : "fx:id=\"-\" was not injected: check your FXML file 'simple.fxml'.";
        assert multButton != null : "fx:id=\"*\" was not injected: check your FXML file 'simple.fxml'.";
        assert divideButton != null : "fx:id=\"/\" was not injected: check your FXML file 'simple.fxml'.";
        assert x2 != null : "fx:id=\"x^2\" was not injected: check your FXML file 'simple.fxml'.";
        assert screen != null : "fx:id=\"screen\" was not injected: check your FXML file 'simple.fxml'.";



    }
    @FXML
    private void update(String input){

        sb.append(input);
        screen.setText(sb.toString());
    }

    private void initButtons(){

    button1.setOnMouseClicked((MouseEvent event)-> {
        update(1+" ");
        event.consume();
    });
        button2.setOnMouseClicked((MouseEvent event)-> {
            update(2+" ");
            event.consume();
        });
        button3.setOnMouseClicked((MouseEvent event)-> {
            update(3+" ");
            event.consume();
        });
        button4.setOnMouseClicked((MouseEvent event)-> {
            update(4+" ");
            event.consume();
        });
        button5.setOnMouseClicked((MouseEvent event)-> {
            update(5+" ");
            event.consume();
        });

    }
}
