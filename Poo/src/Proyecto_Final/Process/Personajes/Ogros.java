package Proyecto_Final.Process.Personajes;

public class Ogros extends Personaje{

    private boolean muerto;
    
    public Ogros(int NivelDePoder, int NivelDeVida) {
        super(NivelDePoder, NivelDeVida);

    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    /*Nivel de Poder que tiene cada ogro*/
    public void OgroZeanadasai(int NivelDePoder) {
        NivelDePoder = 6;
    }

    public void OgroYoggarim(int NivelDePoder) {
        NivelDePoder = 7;
    }

    public void OgroCordyndeirot(int NivelDePoder) {
        NivelDePoder = 8;
    }

    public void OgroMakulmornozi(int NivelDePoder) {
        NivelDePoder = 12;
    }

    public void OgroYakerr(int NivelDePoder) {
        NivelDePoder = 14;
    }

    public void OgroKauruszakan(int NivelDePoder) {
        NivelDePoder = 18;
    }

    public void OgroFortalezaZarenkai(int NivelDePoder) {
        NivelDePoder = 18;
    }



}
