/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comprador a=new Comprador("Nicolas","Delgado");
        Obra c=new Obra("El Resplandor","Historia de un niño especial","Terror",120000);
        Artista b =new Artista("Curriculum", "Premio Nobel", 7, c, "Stephen", "King");
        
    }
    
}
