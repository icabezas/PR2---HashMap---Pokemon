/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2.hashmap;

import javax.swing.ImageIcon;

public class PokemonFuego extends Pokemon {

    private String efectivosContra = "agua";
    private String debilContra = "fuego";

    @Override
    public boolean capturar() {
        boolean capturado = false;
        int numAleatorio = (int) Math.floor(Math.random() * (60 - 10) + 10);
        if ((numAleatorio + super.getPtsSalud()) > (super.getAtaque() + super.getDefensa())) {
            capturado = true;
        }
        return capturado;
    }

    public PokemonFuego(String nombre, int ataque, int defensa, int ptsSalud, ImageIcon icon) {
        super(nombre, ataque, defensa, ptsSalud, icon);
    }

}
