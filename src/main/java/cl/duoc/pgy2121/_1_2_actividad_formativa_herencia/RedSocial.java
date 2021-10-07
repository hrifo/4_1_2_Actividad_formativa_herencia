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
public class RedSocial {
    public String usuario,password;

    public RedSocial() {
    }

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String listar(String subclase){
         return "Usuario: "+ usuario  + "pasword: " + password;
    }
}
