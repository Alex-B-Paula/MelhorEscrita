/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.melhorescrita;
/**
 * Classe Pangrama com a lista responsavel por lista e enviar pangramas para a classe principal.
 * @author Alex Barbosa - Matricula: 2014000174 - Turma: 136
 */
public class Pangramas {
    //Vetor de pangramas.
    String[] pan = new String[10];{
    pan[0] = "Um pequeno jabuti xereta viu dez cegonhas felizes";
    pan[1] = "Blitz prende ex-vesgo com cheque fajuto";
    pan[2] = "Jovem craque belga prediz falhas no xote.";
    pan[3] = "Gazeta publica hoje no jornal breve nota de faxina na quermesse";
    pan[4] = "À noite, vovô Kowalsky vê o ímã cair no pé do pingüim queixoso e vovó põe açúcar no chá de tâmaras do jabuti feliz";
    pan[5] = "Sphinx of black quartz, judge my vow";
    pan[6] = "Glib jocks quiz nymph to vex dwarf";
    pan[7] = "Quick zephyrs blow, vexing daft Jim";
    pan[8] = "Two driven jocks help fax my big quiz";
    pan[9] = "Sympathizing would fix Quaker objectives";
}
    //Método de Get para pangramas específicos
    public String GetPangrama(int num){
        return pan[num];
    }
    
    
}
