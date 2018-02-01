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
public class Academia {
    private static int numReferencia=2018;
    private String nome;
    private int nota;
    private Persoal alum;

    public Academia() {
    }

    public Academia(String nome, int nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academia.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academia{" + "nome=" + nome + ", nota=" + nota + ", alum=" + alum + '}';
    }
    
    public void calcularNota(){

        Notas nota=new Notas();
        nota.mediaTeoricos(5, 8);
        nota.notaPractica(9);
        nota.boletins();
        nota.notaAvaliacion();

    }
    
}
