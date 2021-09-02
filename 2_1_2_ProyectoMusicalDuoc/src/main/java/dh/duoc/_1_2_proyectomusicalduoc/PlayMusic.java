
package dh.duoc._1_2_proyectomusicalduoc;

/**
 *
 * @author  GRUPO 1
 * 
 * Francisco Zambrano - Miguel San Martin - Bruno Gonzalez - Diego Huerta
 */

public class PlayMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("*** Bienvenido a PLayMusic ***");
      System.out.println("-------------------------------");
      
 
        Musica cancion1 = new Musica("Black","Pearl Jam",5,39);
        cancion1.setFavorita(Boolean.TRUE);
        cancion1.setDescarga(Boolean.TRUE);
        
        
        Musica cancion2 = new Musica("Under the Bridge","Red Hot Chili Peppers",4,27);
        cancion2.setFavorita(Boolean.FALSE);
        cancion2.setDescarga(Boolean.FALSE);
        

        Musica cancion3 = new Musica("Show Me How to Live","Audioslave",4,57);
        cancion3.setFavorita(Boolean.TRUE);
        cancion3.setDescarga(Boolean.TRUE);
        
        Musica cancion4 = new Musica("DIMELO MÁ", "Marcianeke", 2,53);
        cancion4.setFavorita(Boolean.TRUE);
        cancion4.setDescarga(Boolean.TRUE);
        
        
        //Reproduciendo cancion elegida
        cancion1.reproducir();
        cancion2.reproducir();
        //Adelantando cancion 10 segundos
        cancion1.adelantar(10);
        System.out.println("-------------------------------");
        
        cancion1.getArtista();
        //Imprimir Informacion de la cancion
        cancion1.informacion();
        cancion2.informacion(); 
        
    }
    
}
