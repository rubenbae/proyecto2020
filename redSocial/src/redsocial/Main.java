/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsocial;

import java.util.Date;

/**
 *
 * @author administrador
 */
public class Main {

    public static void main(String[] args) {
        //RedSocial rs = new RedSocial();
        Twitter t1, t2, t3;
        Instagram i1, i2;
        
        ListaRedes lr= new ListaRedes();

        t1 = new Twitter(1000, "Covid:  no hemos llegado al tope de la curva limite 12", new Date(), "admin", "admin");
        t2 = new Twitter(1001, "Estado de guerra en EEUU", new Date(), "usu1", "123");
        t3 = new Twitter(1002, "Chile: Su gran discusión sobre retiro de AFP", new Date(), "usu2", "456");
        i1 = new Instagram(5000, "Haciendo la tarea de Programación II", true, "root", "root");
        i2 = new Instagram(5001, "Sueño con andar en bici en esta pandemia", true, "juanito", "1234");
        
        lr.agregar(t1);
        lr.agregar(t2);
        lr.agregar(t3);
        lr.agregar(i1);
        lr.agregar(i2);
        
        lr.listar();
        
        
    }

}
