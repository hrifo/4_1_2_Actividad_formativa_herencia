/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._1_2_actividad_formativa_herencia;

/**
 *
 * @author Cetecom
 */
public class Instagram extends RedSocial{
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String listar(String subclase){
        String userpass = listar("Instagram");
        //return "" + userpass + "historia: " this.historia ", estado: " + this.estado;
        return "";
    }
    
    
}
