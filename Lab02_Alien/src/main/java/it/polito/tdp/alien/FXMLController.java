package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	AlienDictionary dizionario = new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInserisci;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doTranslate(ActionEvent event) { 
    	
    	String testoInserito=txtInserisci.getText();
    	if(testoInserito.matches("((?=.*\\d).{1,200})")==true || testoInserito.matches("((?=.*\\W).{1,200})")==true) {
    		txtResult.setText("Testo inserito non valido!");
    		return;
    	}
    	
    	String parola[] = testoInserito.split(" ");
    	if(testoInserito.length()==0 || parola.length>2) {
    		txtResult.setText("Testo inserito non valido!");
    		return;
    	}
    	
    	if(parola.length==1) {
    		String daCercare = dizionario.translateWord(parola[0]);
    		if(daCercare==null)
    			txtResult.setText("Parola cercata non resente nel dizionario!");
    		txtResult.setText(daCercare);
    	}
    	
    	if(parola.length==2) {
    		dizionario.addWord(parola[0],parola[1]);
    		txtResult.setText("Parola aggiunta correttamente!");
    	}
    	
    	txtInserisci.setText("");
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	dizionario.reset();
    	txtResult.setText("");
    }
    
    
    @FXML
    void initialize() {
        assert txtInserisci != null : "fx:id=\"txtInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}