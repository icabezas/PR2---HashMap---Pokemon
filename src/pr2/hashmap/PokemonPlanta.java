/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2.hashmap;

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
            System.out.println("POKEMON CAPTURADO!");
        } else {
            System.out.println("POKEMON NO CAPTURADO!");
            //MENSAJE NO CAPTURADO
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return capturado;
    }

    public PokemonPlanta(String habitat, String nombre, int ataque, int defensa, int ptsSalud) {
        super(nombre, ataque, defensa, ptsSalud);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    
    
}
