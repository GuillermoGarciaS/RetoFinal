package Proyecto_Final.Menu;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    String verde = "\u001B[32m";
    String azulCielo = "\u001B[94m";
    String original = "\u001B[0m";
    String rojo = "\u001B[31m";
    String naranja = "\u001B[33m";
    String naranjaClaro = "\u001B[35m";

    private String Error = "El valor debe ser un numero, por favor, vuelva a ingresar un valor";
    private String Invalido = "Valor invalido, introduzca una opción valida";

    /*Opcciones para los menus de ciudades*/


    private ArrayList<String> opciones = new  ArrayList<>();
    private ArrayList<MenuAction> acciones = new ArrayList<>();
    private boolean alive = true;

    public boolean isAlive(){
        return alive;
    }
    public void killMenu(){
        alive = false;
    }

    public Menu addOptions(String opcion, MenuAction action){
        opciones.add(opcion);
        acciones.add(action);
        return this;
    }

    public void crearMenu(){ }
    public void cleanMenu(){
        opciones.clear();
    }

    /*Menu principal*/
    public void showMenu(){
        String textote = (verde + "*************************\n" + azulCielo + "La aventura del caballero\n" + verde + "*************************\n" + original);
        
        for (int i = 0; i < textote.length(); i++) {
            System.out.print(textote.charAt(i));
            try {
                Thread.sleep(65); // detener la ejecución del hilo durante medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < opciones.size(); i++){
            System.out.printf("       %d.- %s \n", i + 1, opciones.get(i));
            
        System.out.println();
        }
    }

    /*Menu para cambiar de ciudad*/
    public void showMenuViaje() {
        String textote2 = "¿A donde te quisieras dirigir hoy? \n";

        for (int i = 0; i < textote2.length(); i++) {
            System.out.print(textote2.charAt(i));
            try {
                Thread.sleep(65); // detener la ejecución del hilo durante medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < opciones.size(); i++){
            System.out.printf("       %d.- %s \n", i + 1, opciones.get(i));
            
        System.out.println();
        }
    }
    /*Menu que se enseña cuando el ogro de ese pueblo no ha sido asesinado*/
    public void showMenuCiudadConOgro() {
        String textote3 = "¿Que quisieras hacer?";

        for (int i = 0; i < textote3.length(); i++) {
            System.out.println(textote3.charAt(i));
            try {
                Thread.sleep(65); // detener la ejecución del hilo durante medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.print("");
            } 
        }
    }


    /*Menu que se enseña cuando el ogro de ese pueblo ya ha sido asesinado*/
    public void showMenuCiudadSinOgro() {
        String textote3 = "¿Que quisieras hacer?";
        for (int i = 0; i < textote3.length(); i++) {
            System.out.println(textote3.charAt(i));
            try {
                Thread.sleep(65); // detener la ejecución del hilo durante medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.print("");
            } 
        }
    }


    public void addOptions(String atacarOgro, String seguirViajando) {
    }
    public int readOption(){

        while (true){

            try {
                int numeroOpcion = scanner.nextInt(); scanner.nextLine();

                if (numeroOpcion < 1 || numeroOpcion > acciones.size() + 1){
                    System.out.println(Invalido);
                    continue;
                }return numeroOpcion;
            }catch (InputMismatchException error){
                scanner.nextLine();
                System.out.println(Error);
            }
        }
    }

   public void selectAndRunOption(int option){
        if (option == opciones.size()+ 1){
            System.out.println(Invalido);
            return;
        }
        acciones.get(option - 1).run(scanner);

    }

}