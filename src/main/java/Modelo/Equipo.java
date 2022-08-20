/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Equipo implements Comparable<Equipo>{
    private String nombre;
//    private ArrayList<Jugador> jugadores;
    private int mundialesGanados;
    private String abreviatura;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public ArrayList<Jugador> getJugadores() {
//        return jugadores;
//    }
//
//    public void setJugadores(ArrayList<Jugador> jugadores) {
//        this.jugadores = jugadores;
//    }

    public int getMundialesGanados() {
        return mundialesGanados;
    }

    public void setMundialesGanados(int mundialesGanados) {
        this.mundialesGanados = mundialesGanados;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    @Override
    public int compareTo(Equipo e) {
        return this.nombre.compareTo(e.nombre);
    }

}
