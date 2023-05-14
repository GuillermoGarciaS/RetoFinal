package Proyecto_Final.Process.Personajes;

public class Aventurero extends Personaje{

    public Aventurero(int NivelDePoder, int NivelDeVida) {
        super(NivelDePoder, NivelDeVida);

        NivelDePoder = 6;

        }

        public int getNivelDePoder() {
            return NivelDePoder;
        }

        public void incrementadorDePoder() {
            NivelDePoder++;
        }
    
}
