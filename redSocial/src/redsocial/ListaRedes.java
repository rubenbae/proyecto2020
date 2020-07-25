/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsocial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador
 */
public class ListaRedes {
    private List<RedSocial> lista;

    public ListaRedes() {
        lista = new ArrayList<>();
    }
    
    public boolean agregar(RedSocial rs){
        return lista.add(rs);
    }
    
    public void listar(){
        for (RedSocial redSocial : lista) {
            redSocial.listarRedSocial();
        }
    }
}
