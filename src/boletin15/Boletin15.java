package boletin15;


public class Boletin15 {

    
    public static void main(String[] args) {
        xogador delantero = new xogador(5,"Selecion");
        masaxista masaxista1 = new masaxista("Graduada",5);
        entrenador entrenador1 = new entrenador("2");
        personas asd = new personas();
        delantero.concentrarse();
        masaxista1.concentrarse();
        entrenador1.concentrarse();
        delantero.viaxar();
        masaxista1.viaxar();
        entrenador1.viaxar();
    }
    
}
