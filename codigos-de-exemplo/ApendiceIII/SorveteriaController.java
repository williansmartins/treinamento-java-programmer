package br.com.impacta.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SorveteriaController {

    @FXML
    private TextField txtSabor;

    @FXML
    private ToggleGroup tipo;

    @FXML
    private CheckBox chkGranulado;

    @FXML
    private CheckBox chkCobertura;

    @FXML
    void encomendarSorvete(ActionEvent event) {

        String descricao = txtSabor.getText() + " - "
                + ((RadioButton) tipo.getSelectedToggle()).getText();

        if (chkCobertura.isSelected() && chkGranulado.isSelected()) {
            descricao += " - " + " Cobertura e Granulado";
        } else if (chkCobertura.isSelected()) {
            descricao += " - " + " Cobertura";
        } else if (chkGranulado.isSelected()) {
            descricao += " - " + " Granulado";
        }

        ((Stage) txtSabor.getScene().getWindow()).setTitle(descricao);
    }
}
