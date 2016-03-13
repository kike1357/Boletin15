package boletin15;

import javax.swing.JOptionPane;


public class entrenador extends personas {
    String idFederacion;

    public entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    
    
    
    public void dirixirPartido(){}
    public void dirixirAdestramento(){}

    @Override
    public String toString() {
        return "entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxa o adestrador");
}
}