/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;



public class Cidade {
    private int codigo;
    private String UF;
    private String nome;


    public int getCodigo() {
        return codigo;
    }

   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getUF() {
        return UF;
    }

   
    public void setUF(String UF) {
        this.UF = UF;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void dadoscidade(){
    System.out.println(this.UF);
    System.out.println(this.nome);
    System.out.println(this.codigo);
}
}
