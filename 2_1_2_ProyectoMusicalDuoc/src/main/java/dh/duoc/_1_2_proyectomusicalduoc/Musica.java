/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dh.duoc._1_2_proyectomusicalduoc;

/**
 *
 * @author CASA
 */
public class Musica {
      private String titulo,artista;
      private boolean favorita,descarga;
      private int minutos,segundos;


   public Musica(String titulo, String artista, Integer minutos, Integer segundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Musica(Boolean favorita, Boolean descarga) {
        this.favorita = favorita;
        this.descarga = descarga;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Boolean getFavorita() {
        return favorita;
    }

    public void setFavorita(Boolean favorita) {
        this.favorita = favorita;
    }

    public Boolean getDescarga() {
        return descarga;
    }

    public void setDescarga(Boolean descarga) {
        this.descarga = descarga;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }


    //Método
    public void adelantar(Integer segundos) {
        System.out.println("Adelantando musica >> " + segundos + " segundos");
    }

    public void reproducir() {
        System.out.println("Reproduciendo cancion... " + titulo + " - artista " + artista);
    }

    public void informacion() {
        System.out.println("Informacion de cancion elegida: ");
        System.out.println("---------------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + minutos + ":" + segundos);
        if(descarga){
            System.out.println("Descargada: si");
        }else{
            System.out.println("Descargada: No");
        }
        
        if(favorita){
            System.out.println("Favorita: Si");
        }else{
            System.out.println("Favorita: No");
        }
        
    }
}
