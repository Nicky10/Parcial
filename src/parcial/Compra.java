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
public class Compra extends Obra{

    public Compra(String nombre, String descripcion, String estilo, double valor) {
        super(nombre, descripcion, estilo, valor);
    }
    public double valorTotal(Obra e){
        
        double a=e.getValor();
        double gananciaWebGallery=(a*0.02);
        double ValorTotal=a+gananciaWebGallery;
        
        return ValorTotal;
    }
}
