
package DAO;

import Dados.Dados;
import Modelos.Cidade;
import java.util.List;

public class daoCidade {
    public List<Cidade> getlista(){
        return Dados.listaCidade;
   }
    public boolean salvar(Cidade obj){
        if(obj.getUF()== null){
            Integer codigo = Dados.listaCidade.size() +1;
        }
        return true;
    }
    
    public boolean remover(Cidade obj){
        Dados.listaCidade.remove(obj);
        return true;
    }
    }
