/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

import java.util.Scanner;


/**
 *
 * @author jose
 */
public class Notas {
    

// declaramos as distintas variables que vamos a precisar



    private float media;

    private float mediaTeoricos;

    private float notaPractica;

    private float notaBoletin;

    private boolean boletinHecho = true;

    private float mediaBoletin = 0;

    private int numBoletines;



    // declaramos un obxeto de tipo scanner que vamos a precisar para a inserccion de datos 

    Scanner sc = new Scanner(System.in);



    // calculamos a nota media dos exames teoricos

    public void mediaTeoricos(float notat1, float notat2) {



        mediaTeoricos = (notat1 + notat2) / 2;



    }

    // calculamos a nota media dos exames practicos



    public void notaPractica(float notaPractica) {

        this.notaPractica = notaPractica;

    }

// insertamos cantos boletins fixo o alumno é, segun os boletins que fixemos , daranse ou non os dous puntos que valen 



    public void boletins() {

        while (boletinHecho == true) { // no caso de que o numero de boletins feito sexa maior que 17, que é o total de boletins, volverase a pedir o numero de boletins 

            System.out.println("inserte o numero de boletins feitos polo alumno");

            mediaBoletin = sc.nextFloat();



            if (mediaBoletin <= 17) { // calculamos se sumamos un ou dous puntos a media 



                if ((mediaBoletin / 17 * 100) > 90) {

                    notaBoletin = 2f;

                    boletinHecho = false;

                } else if (70f < (mediaBoletin / 17 * 100) && (mediaBoletin / 17 * 100) < 90f) {

                    notaBoletin = 1f;

                    boletinHecho = false;

                } else {

                    notaBoletin = 0f;

                    boletinHecho = false;

                }

            } else {

                System.out.println("o numero de boletins feito polo alumno non pode ser mais que o total, 17");

            }

        }

    }



    public void notaAvaliacion() { // facemos a saida sumando a nota dos boletins (20%) o corresspondete as medias teorica e practica

        System.out.println (String.format("PROBAS TEORICAS: %.2f",mediaTeoricos)); // string format imprime en consola formateando todo en string e concatenando todo co formato que din %.2f non dara mais de dous decimais

        System.out.println(String.format("PROBAS PRACTICAS: %.2f" , notaPractica));

        System.out.println(String.format("BOLETINS: %.2f" , notaBoletin));

        System.out.println(String.format("NOTA TOTAL: %.2f" , ((mediaTeoricos * 0.40) + (notaPractica * 0.40) + (notaBoletin))));

    }
}
