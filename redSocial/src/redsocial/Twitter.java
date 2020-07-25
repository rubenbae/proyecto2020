/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsocial;

import java.util.Date;

/**
 *
 * @author Sara Gonzalez
 */
public class Twitter extends RedSocial {

    private int id;
    private String noticia;
    private Date fecha;

    public Twitter() {
    }

    public Twitter(int id, String noticia, Date fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Twitter{" + "id=" + id + ", noticia=" + noticia + ", fecha=" + fecha + '}';
    }
    

    @Override
    public void listarRedSocial() {
        super.listarRedSocial();
        System.out.println(noticia + "\n" + fecha);
    }

}
