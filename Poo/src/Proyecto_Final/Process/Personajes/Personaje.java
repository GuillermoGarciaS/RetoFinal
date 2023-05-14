package Proyecto_Final.Process.Personajes;


public class Personaje {
    protected int NivelDePoder;
    private int NivelDeVida;

    public Personaje(int NivelDePoder, int NivelDeVida) {
        this.NivelDePoder = NivelDePoder;
        this.NivelDeVida = NivelDeVida;

    }

    public int getNivelDePoder() {
        return NivelDePoder;
    }

    public void setNivelDePoder(int NivelDePoder) {
        this.NivelDePoder = NivelDePoder;
    }


    public int getNivelDeVida() {
        return NivelDeVida;
    }

    public void setNivelDeVida(int NivelDeVida) {
        this.NivelDeVida = NivelDeVida;
    }


    public void pelea(int daño) {

        NivelDeVida -= daño;
        if (NivelDeVida < 0) {
            NivelDeVida = 0;
            }
        }

    public boolean luchar(Personaje oponente) {
        oponente.pelea(this.NivelDePoder);
        return true;
    }

}

