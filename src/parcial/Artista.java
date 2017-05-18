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
public class Artista extends Usuario{
    
    private String curriculum,distinciones;
    private int obras;
    private Obra obra;

    public Artista(String curriculum, String distinciones, int obras, Obra obra, String nombre, String apellido) {
        super(nombre, apellido);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
        this.obras = obras;
        this.obra = obra;
    }


    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }

    public int getObras() {
        return obras;
    }

    public void setObras(int obras) {
        this.obras = obras;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
    
    
}

