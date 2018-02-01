/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

import com.jose.paquete2.Persoal;

/**
 *
 * @author jose
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creamos un obxeto de cada clase
        Persoal pepe=new Persoal("666202020","pepenontraballestanto@jimemail.gal");
        Academia alumno1=new Academia("Pepe",10,pepe);
        //visualizamos os datos dun alumno
        System.out.println(alumno1);
        alumno1.calcularNota();
        System.out.println("a nota final é "+alumno1.getNota());
    }
    
}
