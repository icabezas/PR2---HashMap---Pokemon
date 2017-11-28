/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2.hashmap;

import javax.swing.ImageIcon;

/**
 *
 * @author THOR
 */
public class PokemonPlanta extends Pokemon {

    private String efectivosContra = "agua";
    private String debilContra = "fuego";
    private String habitat;

    @Override
    public boolean capturar() {
        boolean capturado = false;
        int numAleatorio = (int) Math.floor(Math.random() * (50));
        if ((numAleatorio + super.getAtaque()) > super.getPtsSalud()) {
            capturado = true;
        }
        return capturado;
    }

    public PokemonPlanta(String habitat, String nombre, int ataque, int defensa, int ptsSalud, ImageIcon icon) {
        super(nombre, ataque, defensa, ptsSalud, icon);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}
