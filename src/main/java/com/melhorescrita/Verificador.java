/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.melhorescrita;

/**
 * Classe Verificador que recebe strings e compara com strings da classe Pangramas.
 * @author Alex Barbosa - Matricula: 2014000174 - Turma: 136
 */
public class Verificador {
    
   String Pangrama;
   //Método de verificação.
   public Boolean Verificar(int Atual, String Pangrama){
       
       Pangramas Pan = new Pangramas();
       
       return Pan.GetPangrama(Atual).equals(Pangrama);
       
   }
    
}
