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
public class Venta extends Compra{

    public Venta(String nombre, String descripcion, String estilo, double valor) {
        super(nombre, descripcion, estilo, valor);
    }
    
    
    public double realizarPago(Compra b,Obra c){
        
        double a=b.valorTotal(c);
        
        return a;
    }
    
}
