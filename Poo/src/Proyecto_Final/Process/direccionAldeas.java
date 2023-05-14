package Proyecto_Final.Process;

import java.util.Scanner;

import Proyecto_Final.Menu.Menu;
import Proyecto_Final.Menu.MenuAction;

import Proyecto_Final.Process.Personajes.OgroMakulmornozi;

public class direccionAldeas {

    /*Menu para cada ciudadd/villa/aldea*/
    private static Menu menudireccionesKayrin = new Menu();

    private static Menu menudireccionesZendasai = new Menu();

    private static Menu menudireccionesYakerr = new Menu();

    private static Menu menudireccionesMakulmornozi = new Menu();

    private static Menu menudireccionesKauruszakan = new Menu();

    private static Menu menudireccionesZarenkai = new Menu();

    private static Menu menudireccionesYoggariam = new Menu();

    private static Menu menudireccionesCordyndeirot = new Menu();

    /*Menus para saber si el ogro ya fue asesinado o no*/

    private static Menu showMenuCiudadConOgro = new Menu();



    private static String Yakerr = "Yakerr";

    private static String Zenadasai = "Zenadasai";

    private static String Makulmornozi = "Ciudad Makulmornozi";

    private static String Xakro = "Castillo Xakro";

    private static String Kauruszakan = "Fortaleza Kauruszakan";

    private static String Zarenkai = "Ruinas de la fortaleza Zarenkai";

    private static String Yoggariam = "Villa Yoggariam";

    private static String Kayrin = "Aldea Kayrin";

    private static String Cordyndeirot = "Pueblo Cordyndeirot";

    /*Textos para menus de viaje*/

    private static String SeguirViajando = "Decides continuar viajando";

    private static String AtacarOgro = "Decides atacar al ogro";

    public static void Kayrin() {


        do {
            menudireccionesKayrin.showMenuViaje();
            var option = menudireccionesKayrin.readOption();
            menudireccionesKayrin.selectAndRunOption(option);
        } while (menudireccionesKayrin.isAlive());
    }

    String seleccion;

    public static void Makulmornozi() {

        System.out.println("ayuda");

        try (Scanner seleccion = new Scanner(System.in)) {
            System.out.println("¿Quieres pelear contra el ogro?");
            seleccion.nextLine();

            if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); {
                
                do {
                    System.out.println("Decides continuar viajando");

                    menudireccionesMakulmornozi.showMenuViaje();
                    var option = menudireccionesMakulmornozi.readOption();
                    menudireccionesMakulmornozi.selectAndRunOption(option);
                } while (menudireccionesMakulmornozi.isAlive());
            }
            if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI"));
            
        }

        do {

            menudireccionesMakulmornozi.showMenuViaje();
            var option = menudireccionesMakulmornozi.readOption();
            menudireccionesMakulmornozi.selectAndRunOption(option);
        } while (menudireccionesMakulmornozi.isAlive());
    }

    public static void Yakerr() {

        try (Scanner seleccion = new Scanner(System.in)) {
            System.out.println("¿Quieres pelear contra el ogro?");
            seleccion.nextLine();

            if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); {
                
                do {

                    menudireccionesYakerr.showMenuViaje();
                    var option = menudireccionesYakerr.readOption();
                    menudireccionesYakerr.selectAndRunOption(option);
                } while (menudireccionesYakerr.isAlive());
            }
            if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI"));
        }


        do {

            menudireccionesYakerr.showMenuViaje();
            var option = menudireccionesYakerr.readOption();
            menudireccionesYakerr.selectAndRunOption(option);
        } while (menudireccionesYakerr.isAlive());
    }

    public static void Zarenkai() {

        try (Scanner seleccion = new Scanner(System.in)) {
            System.out.println("¿Quieres pelear contra el ogro?");
            seleccion.nextLine();

            if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); {
                
                do {

                    menudireccionesZarenkai.showMenuViaje();
                    var option = menudireccionesZarenkai.readOption();
                    menudireccionesZarenkai.selectAndRunOption(option);
                } while (menudireccionesZarenkai.isAlive());
            }
            if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI"));
        }

        do {

            menudireccionesZarenkai.showMenuViaje();
            var option = menudireccionesZarenkai.readOption();
            menudireccionesZarenkai.selectAndRunOption(option);
        } while (menudireccionesZarenkai.isAlive());
    }

    public static void Xakro() {

        /*Por definir*/

    }

    public static void Zenadasai() {

        try (Scanner seleccion = new Scanner(System.in)) {
            System.out.println("¿Quieres pelear contra el ogro?");
            seleccion.nextLine();

            if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); {
                
                do {

                    menudireccionesZendasai.showMenuViaje();
                    var option = menudireccionesZendasai.readOption();
                    menudireccionesZendasai.selectAndRunOption(option);
                } while (menudireccionesZendasai.isAlive());
            }
            if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI"));
        }

        do {

            menudireccionesZendasai.showMenuViaje();
            var option = menudireccionesZendasai.readOption();
            menudireccionesZendasai.selectAndRunOption(option);
        } while (menudireccionesZendasai.isAlive());
    }

    public static void Cordyndeirot() {

        try (Scanner seleccion = new Scanner(System.in)) {
            System.out.println("¿Quieres pelear contra el ogro?");
            seleccion.nextLine();

            if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); {
                
                do {

                    menudireccionesCordyndeirot.showMenuViaje();
                    var option = menudireccionesCordyndeirot.readOption();
                    menudireccionesCordyndeirot.selectAndRunOption(option);
                } while (menudireccionesCordyndeirot.isAlive());
            }
            if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI"));
        }

        do {

            menudireccionesCordyndeirot.showMenuViaje();
            var option = menudireccionesCordyndeirot.readOption();
            menudireccionesCordyndeirot.selectAndRunOption(option);
        } while (menudireccionesCordyndeirot.isAlive());
    }

    public static void Kauruszakan() {
        
        try (Scanner seleccion = new Scanner(System.in)) {
            System.out.println("¿Quieres pelear contra el ogro?");
            seleccion.nextLine();

            if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); {
                
                do {

                    menudireccionesKauruszakan.showMenuViaje();
                    var option = menudireccionesKauruszakan.readOption();
                    menudireccionesKauruszakan.selectAndRunOption(option);
                } while (menudireccionesKauruszakan.isAlive());
            }
            if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI"));
        }

        do {

            menudireccionesKauruszakan.showMenuViaje();
            var option = menudireccionesKauruszakan.readOption();
            menudireccionesKauruszakan.selectAndRunOption(option);
        } while (menudireccionesKauruszakan.isAlive());
    }

    public static void Yoggariam() {

        try (Scanner seleccion = new Scanner(System.in)) {
            System.out.println("¿Quieres pelear contra el ogro?");
            seleccion.nextLine();

            if (seleccion.equals("No") || seleccion.equals("no") || seleccion.equals("nO") || seleccion.equals("NO")); {
                
                do {

                    menudireccionesYoggariam.showMenuViaje();
                    var option = menudireccionesYoggariam.readOption();
                    menudireccionesYoggariam.selectAndRunOption(option);
                } while (menudireccionesYoggariam.isAlive());
            }
            if (seleccion.equals("Si") || seleccion.equals("si") || seleccion.equals("sI") || seleccion.equals("SI"));
        }

        do {

            menudireccionesYoggariam.showMenuViaje();
            var option = menudireccionesYoggariam.readOption();
            menudireccionesYoggariam.selectAndRunOption(option);
        } while (menudireccionesYoggariam.isAlive());
    }


    /*Transportadores*/
    public static MenuAction irZenadasai = (scanner) -> {
        System.out.println("Llendo a Zenadasai...");
        direccionAldeas.Zenadasai();
    };

    public static MenuAction irYakerr = (scanner) -> {
        System.out.println("Llendo a Yakerr...");
        direccionAldeas.Yakerr();
    };
    
    public static MenuAction irMakulmornozi = (scanner) -> {
        System.out.println("Llendo a Makulmornozi...");
        direccionAldeas.Makulmornozi();
    };

    public static MenuAction irXakro = (scanner) -> {
        System.out.println("Llendo al Castillo Xakro...");
        direccionAldeas.Xakro();
    };

    public static MenuAction irZarenkai = (scanner) -> {
        System.out.println("Llendo a Fortaleza Zarenkai...");
        direccionAldeas.Zarenkai();
    };

    public static MenuAction irCordyndeirot = (scanner) -> {
        System.out.println("Llendo al Pubelo Cordyndeirot...");
        direccionAldeas.Cordyndeirot();
    };

    public static MenuAction irYoggariam = (scanner) -> {
        System.out.println("Llendo a Villa Yoggariam...");
        direccionAldeas.Yoggariam();
    };

    public static MenuAction irKauruszakan = (scanner) -> {
        System.out.println("Llendo a Fortaleza Kauruszakan...");
        direccionAldeas.Kauruszakan();
    };

    public static MenuAction irKayrin = (scanner) -> {
        System.out.println("Llendo a Aldea Kayrin...");
        direccionAldeas.Kayrin();
    };

    /*Opcciones del menu de una ciudad*/



    /*Direcciones de Kayrin*/
    static {
        menudireccionesKayrin.addOptions(Yakerr, irYakerr);
        menudireccionesKayrin.addOptions(Zenadasai, irZenadasai);
        menudireccionesKayrin.addOptions(Xakro, irXakro);
        menudireccionesKayrin.addOptions(Makulmornozi, irMakulmornozi);
        menudireccionesKayrin.crearMenu();

    }
    /*Direcciones de Zenadasai*/
    static {
        menudireccionesZendasai.addOptions(Kayrin, irKayrin);
        menudireccionesZendasai.addOptions(Cordyndeirot, irCordyndeirot);
        menudireccionesZendasai.addOptions(Yoggariam, irYoggariam);
        menudireccionesZendasai.addOptions(Kauruszakan, irKauruszakan);
        menudireccionesZendasai.crearMenu();

    }

    /*Direcciones de Yoggariam*/
    static {
        menudireccionesYoggariam.addOptions(Zenadasai, irZenadasai);
        menudireccionesYoggariam.addOptions(Kauruszakan, irKauruszakan);
        menudireccionesYoggariam.crearMenu();
    }

    /*Direcciones de Kauruszakan*/

    static {
        menudireccionesKauruszakan.addOptions(Yoggariam, irYoggariam);
        menudireccionesKauruszakan.crearMenu();
    }

    /*Direcciones de Cordyndeirot*/

    static {
        menudireccionesCordyndeirot.addOptions(Zenadasai, irZenadasai);
        menudireccionesCordyndeirot.crearMenu();
    }

    /*Direcciones de Makulmornozi*/

    static {
        menudireccionesMakulmornozi.addOptions(Kayrin, irKayrin);
        menudireccionesMakulmornozi.crearMenu();
    }

    /*Direcciones de Yakerr*/

    static {
        menudireccionesYakerr.addOptions(Kayrin, irKayrin);
        menudireccionesYakerr.addOptions(Xakro, irXakro);
        menudireccionesYakerr.addOptions(Zarenkai, irZarenkai);
        menudireccionesYakerr.crearMenu();
    }

    /*Direcciones de Zarenkai*/

    static {
        menudireccionesZarenkai.addOptions(Yakerr, irYakerr);
        menudireccionesZarenkai.crearMenu();
    }

    /*El ogro no ha sido asesinado*/
    static {
        showMenuCiudadConOgro.addOptions(AtacarOgro, SeguirViajando);
        showMenuCiudadConOgro.crearMenu();
    }

}