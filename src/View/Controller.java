package View;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    /**
     * * Variaveis de interface **
     */

    @FXML
    private MenuItem atualizarDados;
    @FXML
    private MenuItem backup;
    @FXML
    private MenuItem imprimirRelatorio;
    @FXML
    private MenuItem sair;
    @FXML
    private MenuItem cadastrarAssociado;
    @FXML
    private MenuItem buscarAssociado;
    @FXML
    private MenuItem listarAssociados;
    @FXML
    private MenuItem cadastrarConvenio;
    @FXML
    private MenuItem buscarConvenio;
    @FXML
    private MenuItem listarConvenio;
    @FXML
    private MenuItem update;
    @FXML
    private MenuItem bugReport;
    @FXML
    private MenuItem about;


    public void encerraSecao(ActionEvent actionEvent) {

        System.out.println("testa encerrar");
        System.exit(0);


    }

    public void refresh(ActionEvent actionEvent) {

        System.out.println("testa atualizar");
    }

    public void backup(ActionEvent actionEvent) {

        System.out.println("testa backup");
    }

    public void printResume(ActionEvent actionEvent) {

        System.out.println("testa impressao");
    }

    public void cadastraAssociado(ActionEvent actionEvent) {

        System.out.println("teste");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cadastraCliente.fxml"));
            Parent mainWindow = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            //stage.initStyle(StageStyle.UTILITY);
            stage.setTitle("Cadastra Associado");
            stage.setScene(new Scene(mainWindow, 600, 300));
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    public void encerraSecao(ActionEvent actionEvent) {

        System.out.println("teste");
    }
*/
}