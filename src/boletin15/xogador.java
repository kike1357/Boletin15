package boletin15;

import javax.swing.JOptionPane;


public class xogador extends personas {
    int dorsal;
    String demarcacion;

    public xogador(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
@Override
public void viaxar(){
    JOptionPane.showMessageDialog(null,"Viaxan os xogadores");
}
public void xogarPartido(){
}

public void entrenar(){     
}
}