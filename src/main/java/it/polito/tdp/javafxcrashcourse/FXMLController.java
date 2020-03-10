package it.polito.tdp.javafxcrashcourse;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEta;

    @FXML
    private Button buttonOk;

    @FXML
    private Label labelRisposta;

    @FXML
    void handleOK(ActionEvent event) {
    	String nome = txtNome.getText();
    	if(nome.length() == 0) {
    		labelRisposta.setText("Devi inserire il nome, coglione!");
    		return ;
    	}
    	String saluto;
    	String etaS = txtEta.getText();
    	int eta;
    	
    	if(etaS.length() == 0) {
    		labelRisposta.setText("Devi inserire l' eta', coglione!");
    		return ;
    	}
    	
    	try {
    		eta = Integer.parseInt(etaS);
    	}catch(NumberFormatException e) {
    		labelRisposta.setText("L'eta' deve essere un numero");
    		return ;
    	}
    	
    	if(eta < 18) {
    		saluto = "Ciao, " + nome + "!";
    	}else {
    		saluto = "Buongiorno, " + nome + "!";
    	}
    	
    	labelRisposta.setText(saluto);
    	// Ho fatto una modifica
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtEta != null : "fx:id=\"txtEta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert buttonOk != null : "fx:id=\"buttonOk\" was not injected: check your FXML file 'Scene.fxml'.";
        assert labelRisposta != null : "fx:id=\"labelRisposta\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
