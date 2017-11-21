/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2.hashmap;

import java.util.Objects;

/**
 *
 * @author THOR
 */
public abstract class Pokemon implements Capturable {

    private String nombre;
    private int ataque;
    private int defensa;
    private int ptsSalud;

    public Pokemon(String nombre, int ataque, int defensa, int ptsSalud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ptsSalud = ptsSalud;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPtsSalud() {
        return ptsSalud;
    }

    public void setPtsSalud(int ptsSalud) {
        this.ptsSalud = ptsSalud;
    }

}
