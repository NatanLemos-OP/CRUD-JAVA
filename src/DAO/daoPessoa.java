 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dados.Dados;
import Modelos.Pessoa;
import java.util.List;


public class daoPessoa {
    public List<Pessoa> getlista(){
        return Dados.listaPessoa;
   }
    public boolean salvar(Pessoa obj){
        if(obj.getData()== null){
            Integer codigo = Dados.listaPessoa.size() +1;
        }
        return true;
    }
    
    public boolean remover(Pessoa obj){
        Dados.listaPessoa.remove(obj);
        return true;
    }
}
