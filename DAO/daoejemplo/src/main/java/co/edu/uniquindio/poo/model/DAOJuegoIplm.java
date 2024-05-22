package co.edu.uniquindio.poo.model;

import java.util.List;

public class DAOJuegoIplm implements DAOJuego {
    // Atribtos
    private List<JuegoTransfer> juegos;

    // Definicion contructor
    public DAOJuegoIplm(List<JuegoTransfer> juegos) {
        this.juegos = juegos;
        //creacion de objetos `JuegoTranfer`
        JuegoTransfer juego1 = new JuegoTransfer("Fortnite2", "Batle Royal", 100, 0);
        JuegoTransfer juego2 = new JuegoTransfer("Mario 3", "Plataformas", 60, 1);
        //Añadir objetos `JuegoTranfer`a la lista
        juegos.add(juego1);
        juegos.add(juego2);
    }

    // metodo actualizarJuego 
    public void actualizarJuego(JuegoTransfer juego) {
        juegos.set(juego.getId(), juego);
        System.out.println("Juego: nombre" + juego.getNombre() + "actualizar en base de datos");

    }
    
    //metodo eliminarJuego
    public void eliminarJuego(JuegoTransfer juego){
        juegos.remove(juego.getId());
        System.out.println("Juego: Nombre" + juego.getNombre() + "Eliminar de la base de datos");
    }

    @Override
    public List<JuegoTransfer> getAllJuegos() {
        return juegos;
    }

    @Override
    public JuegoTransfer getJuego(int id) {
        return juegos.get(id);
    }


}