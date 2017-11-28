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
public class PokemonAgua extends Pokemon {

    private String efectivosContra = "fuego";
    private String debilContra = "planta";
    private String tipoAgua;

    @Override
    public boolean capturar() {
        boolean capturado = false;
        int numAleatorio = (int) Math.floor(Math.random() * (120 - 20) + 20);
        if ((numAleatorio - super.getPtsSalud()) > super.getDefensa()) {
            capturado = true;
        }
        return capturado;
    }

    public PokemonAgua(String tipoAgua, String nombre, int ataque, int defensa, int ptsSalud, ImageIcon icon) {
        super(nombre, ataque, defensa, ptsSalud, icon);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

}
