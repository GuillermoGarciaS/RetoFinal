package Proyecto_Final.UI;

import Proyecto_Final.Menu.Menu;
import Proyecto_Final.Menu.MenuAction;
import Proyecto_Final.Process.direccionAldeas;


public class Introduccion {
    
    private static Menu menu = new Menu();

    private static String EmpezarJuego = "Jugar";

    public static boolean nombreCheck = false;
    
    private static MenuAction iniciarHistoria = (scanner) -> {


        /*Paleta de colores*/
        String original = "\u001B[0m";
        String verde = "\u001B[32m";
        String cian = "\u001B[36m";
        String azulCielo = "\u001B[94m";


        /*Registro de nombre*/
        String frase1 = "Ingresa tu nombre";
        String puntito = ".";
        System.out.print(azulCielo + frase1 + original);
        for (int i = 0; i < puntito.length(); i++) {
            System.out.print(puntito.charAt(i));
            try {
                Thread.sleep(250); // detener la ejecución del hilo durante medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < puntito.length(); i++) {
            System.out.print(puntito.charAt(i));
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < puntito.length(); i++) {
            System.out.print(puntito.charAt(i) + "\n");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        String nombre = scanner.nextLine();

        
        System.out.println(azulCielo + "Deseas que tu nombre sea " + original + "\n" + "       " + cian + nombre + original + "?" + "\nSi               No");
        String seleccion = scanner.nextLine();

        
        if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); { 
            do {
            System.out.println(azulCielo + "Ingresa tu nombre" + original);
            nombre = scanner.nextLine();
            System.out.println(azulCielo + "Quieres que tu nombre sea \n" + original + nombre + "?" + "\nSi               No");
            seleccion = scanner.nextLine();
            } while (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO"));
            }
        
        if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI")); {
            System.out.println("Bien...");
            }

        /*Parte 1 - Introducción*/
        System.out.println(verde + nombre + ": Ughh, llevo perdido días y quien sepa donde este, sabía que no tenía que " +
                           "tomar ese camino" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException a) {
            a.printStackTrace();
        }

        /*
        System.out.println("Mientras seguía caminando, a lo lejos veía una luz, no estába seguro de lo que era");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException b) {
            b.printStackTrace();
        }

        System.out.println("Le parecía un tanto extraña esta, más extraño que siendo de noche tuviera tal brillo");
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException c) {
            c.printStackTrace();
        }

        System.out.println(verde + nombre + ": Espera... ¿Es lo que creo que es?" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException d) {
            d.printStackTrace();
        }

        System.out.println("Acelero el paso, ");
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException f) {
            f.printStackTrace();
        }

        System.out.println(verde + nombre + ": dios mio, ¡está aldea fue completamente arrazada arrazada!" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException g) {
            g.printStackTrace();
        }

        System.out.println("A medida que pasa el tiempo, lentamente se desvance la luz que le atrajo a este mismo lugar");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException h) {
            h.printStackTrace();
        }

        System.out.println("Aun atonito logra escuchar una voz un poco lejana, la voz de está no era tan fuerte");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException i) {
            i.printStackTrace();
        }

        System.out.println("Decidio acercarse a esta, se agacho y vio un hada atrapada dentro de los escombros");
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException j) {
            j.printStackTrace();
        }

        System.out.println(verde + nombre + ": ¿Estás bien? ven, deja te ayudo a quitarte esto de encima" + original);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException k) {
            k.printStackTrace();
        }

        System.out.println("Casi moribunda, el aventurero la dejo reposar sin cargar con el peso del escombro");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException l) {
            l.printStackTrace();
        }

        System.out.println("Empezo a buscar por la villa, con las esperanzas de poder salvar cuantas pudiera");
        try {
            Thread.sleep(7600);
        } catch (InterruptedException m) {
            m.printStackTrace();
        }

        System.out.println("Unas las pudo encontrar con vida, otras no... en total encontro a 5 con vida");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException n) {
            n.printStackTrace();
        }

        System.out.println("De pronto se acerca un hada, no se ve tan lastimada con las de más, pero tampoco se le ve ilesa");
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException o) {
            o.printStackTrace();
        }

        System.out.println(azulCielo + "???: Agradezo la ayuda que nos estás brindando, ¿podría saber cual es tu nombre?" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException p) {
            p.printStackTrace();
        }

        System.out.println(verde + nombre + "Me llamo " + cian + nombre + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException q) {
            q.printStackTrace();
        }

        System.out.println(azulCielo + "Nawell: " + cian + nombre + "... Interesante, el mio es Nawell" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException r) {
            r.printStackTrace();
        }

        System.out.println(verde + nombre + ": ¿Podría saber que paso aqui?, ¿aun sigue en peligro la aldea?" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException s) {
            s.printStackTrace();
        }

        System.out.println(azulCielo + "Nawell: Veras " + nombre + ", El "+ rojo + "hechizero de la montaña" + azulCielo + " mando a sus ogros a atacar todas las aldeas" + original);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException t) {
            t.printStackTrace();
        }

        System.out.println(azulCielo + "Nawell: Teníamos conocimiento de el, más nunca esperamos que sucediera tal accion" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException u) {
            u.printStackTrace();
        }

        System.out.println(verde + nombre + ": ¿Y que paso con el ogro que arrazo esta villa? no se le ve por ningun lado" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.println(azulCielo + "Nawell: Creo que se dirigía a la" + azul +  "Villa Zenadasai" + azulCielo + ", queda para el" + amarillo + " Este " + azulCielo + "de aqui" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException w) {
            w.printStackTrace();
        }

        System.out.println(verde + nombre + ": Entiendo, mañana primera hora saldre a la" + azul + " Villa Zendasai, " + verde + "" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException w) {
            w.printStackTrace();
        }

        System.out.println(azulCielo + "Nawell: podría preguntar porque has decidido ayudar a los de más pueblos junto con este?" + original);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException w) {
            w.printStackTrace();
        }

        System.out.println(azulCielo + "Nawell: No es que no sea apreciada la ayuda, lo contrario. Pero juzgando por tus vestimentas no pareces de por aqui" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException w) {
            w.printStackTrace();
        }

        System.out.println(verde + nombre + ": No es algo de lo que me guste hablar tanto... pero tengo unos asuntos pendientes con el " + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.println(azulCielo + "¿Nawell: te refieres al" + rojo + " hechizero de la montaña?" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException w) {
            w.printStackTrace();
        }

        System.out.println(verde + nombre + ": Si, con el " + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.println(azulCielo + "¿Nawell: Entiendo, si quieres pasa la noche aqui para descansar, despues de lo que ha causado?" + original);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException w) {
            w.printStackTrace();
        }

        System.out.println(azulCielo + "¿Nawell: no creo que le vea algo de valor a esta zona?" + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException w) {
            w.printStackTrace();
        }

        System.out.println(verde + nombre + ": Lo agradezco, mañana tambien podríamos ver lo de arreglar los hogares y refugiar hadas " + original);
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.println(".");
        try {
            Thread.sleep(500);
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.print(".");
        try {
            Thread.sleep(500);
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.print(".");
        try {
            Thread.sleep(500);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.print("Por la mañana el aventurero se decidio a empacar sus cosas desde temprano, visto que todo mundo estába bien");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        System.out.print("Se despreocupo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        */

        System.out.print("Antes de partir platico con Nawell sobre el albergar a las hadas que se encuentre en las diferentes villas, 10 por casa");
        try {
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (InterruptedException v) {
            v.printStackTrace();
        }

        direccionAldeas.Kayrin();
    };
            

    static {
        menu.addOptions(EmpezarJuego, iniciarHistoria);
        menu.crearMenu();
    }

    public static void iniciarJuego() {
        do {
            menu.showMenu();
            var option = menu.readOption();
            menu.selectAndRunOption(option);
        } while (menu.isAlive());
    }
}