package co.edu.uniquindio.poo.model;

import java.util.List;

public interface DAOJuego {
    // Métodos
    public List<JuegoTransfer> getAllJuegos();
    public JuegoTransfer getJuego(int id);
    public void actualizarJuego(JuegoTransfer juego);
    public void eliminarJuego(JuegoTransfer juego);
}
