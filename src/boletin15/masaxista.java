package boletin15;

import javax.swing.JOptionPane;


public class masaxista extends personas {
    String titulacion;
    int anosExperiencia;

    public masaxista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxan os masaxistas");
}
}