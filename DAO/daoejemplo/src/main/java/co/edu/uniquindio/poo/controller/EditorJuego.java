package co.edu.uniquindio.poo.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.ArrayList;


import co.edu.uniquindio.poo.model.DAOJuegoIplm;
import co.edu.uniquindio.poo.model.JuegoTransfer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class EditorJuego {
    //Objetos del JavaFX con los que trabaja.
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField idNuevaTextField;

    @FXML
    private TextField generoTextField;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField nombreTextField;

    @FXML
    private TextField precioTextField;
    //Inicializa la implementación para tener ya dos juegos creados.
    private List<JuegoTransfer> juegos = new ArrayList<JuegoTransfer>();
    private DAOJuegoIplm impl = new DAOJuegoIplm(juegos);

    @FXML
    void buscarJuego(ActionEvent event) {
        buscar();
    }

    @FXML
    void guardarJuego(ActionEvent event) {
        guardar();
    }

    //Muestra en consola los juegos guardados.
    @FXML
    void mostrarLista(ActionEvent event) {
        for (JuegoTransfer juego : impl.getAllJuegos()){
            System.out.println(juego.toString());
        }
    }

    @FXML
    void initialize() {
        assert generoTextField != null : "fx:id=\"generoTextField\" was not injected: check your FXML file 'viewListaJuegos.fxml'.";
        assert idTextField != null : "fx:id=\"idTextField\" was not injected: check your FXML file 'viewListaJuegos.fxml'.";
        assert nombreTextField != null : "fx:id=\"nombreTextField\" was not injected: check your FXML file 'viewListaJuegos.fxml'.";
        assert precioTextField != null : "fx:id=\"precioTextField\" was not injected: check your FXML file 'viewListaJuegos.fxml'.";

    }
    //Método que busca el juego por la ID introducida en el campo de "ID"
    public void buscar() {
        int idBuscada = Integer.parseInt(idNuevaTextField.getText());
        for (JuegoTransfer juego : impl.getAllJuegos()) {
            if (juego.getId() == idBuscada) {
                //Esto hace que los campos se llenen con la info predeterminada de los juegos que se tienen guardados
                nombreTextField.setText(juego.getNombre());
                generoTextField.setText(juego.getGenero());
                precioTextField.setText(String.valueOf(juego.getPrecio()));
                idTextField.setText(String.valueOf(juego.getId()));
                return;
            }
        }
        
    }
    public void guardar() {

        int idVieja = Integer.parseInt(idTextField.getText());
        String nombreNuevo = nombreTextField.getText();
        String generoNuevo = generoTextField.getText();
        double precioNuevo = Double.parseDouble(precioTextField.getText());
        int idNuevo = Integer.parseInt(idNuevaTextField.getText());

        // Actualiza los datos del juego con los datos introducidos o editados en los campos de texto.
        for (JuegoTransfer juego : juegos) {
            if (juego.getId() == idVieja) {
                juego.setNombre(nombreNuevo);
                juego.setGenero(generoNuevo);
                juego.setPrecio(precioNuevo);
                juego.setId(idNuevo);
                return;
            }
        }
    }

}


