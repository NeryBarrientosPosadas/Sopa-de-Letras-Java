package practicaletras;
// @author Nery

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import static practicaletras.PracticaLetras.jugadores;

public class PracticaLetras {

    static int fi, colum, tamTablero = 0, opcion = 0, palabraModificar = 0, noPalabras = 0, a = 0, e = 0, i = 0, o = 0, u = 0, a1 = 0, e1 = 0, i1 = 0, o1 = 0, u1 = 0, verOHori, fi1, colum1;
    static String sopaLetras[][];
    static String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", nombre = "";
    static Random r1 = new Random();
    static int opcionMenu = 0, opcionMenuPal = 0, VerHoriPal1;
    static Scanner lectura = new Scanner(System.in);
    static Scanner entrada = new Scanner(System.in);
    static Scanner entradaPalabra1 = new Scanner(System.in);
    static Scanner entradaPalabra2 = new Scanner(System.in);
    static Scanner entradaPalabra3 = new Scanner(System.in);
    static Scanner entradaPalabra4 = new Scanner(System.in);
    static Scanner entradaPalabra5 = new Scanner(System.in);
    static Scanner entradaPalabra6 = new Scanner(System.in);
    static Scanner entradaPalabra7 = new Scanner(System.in);
    static Scanner entradaPalabra8 = new Scanner(System.in);
    static Scanner entradaPalabra9 = new Scanner(System.in);
    static Scanner entradaPalabra10 = new Scanner(System.in);
    static Scanner lecturaTam = new Scanner(System.in);
    static boolean salir = false;
    static String palabra1, palabra2, palabra3, palabra4, palabra5, palabra6, palabra7, palabra8, palabra9, palabra10;
    static String palabraRemplazar;
    static String palabra;
    static String palabraDefecto1 = "BARRIENTOS", palabraDefecto2 = "POSADAS", palabraDefecto3 = "INGENIERIA", palabraDefecto4 = "POKEMON", palabraDefecto5 = "SISTEMAS";
    static String palabraEcnontrada1;
    static int fiEncontrada1, columEncontrada1;
    static String[] Palabras;

    static Jugador[] jugadores = new Jugador[10];
    static int contador = 0;

    public static void main(String[] args) {
        MenuPrincipal();

    }

    public static void MenuPrincipal() {

        while (!salir) {
            System.out.println("1. NUEVA PARTIDA");
            System.out.println("2. HISTORIAL DE PARTIDAS");
            System.out.println("3. MOSTRAR PUNTUACIONES MAS ALTAS");
            System.out.println("4. MOSTRAR JUGADORES QUE NO ENCONTRARON TODAS LAS PALABRAS");
            System.out.println("5. MOSTRAR JUGADORES QUE ENCONTRARON TODAS LAS PALABRAS");
            System.out.println("6. MOSTRAR INFORMACION DEL ESTUDIANTE");
            System.out.println("7. SALIR");
            System.out.println("");

            try {
                System.out.println("******************************************");
                System.out.println("Ingrese una opción:");
                System.out.println("******************************************");
                System.out.println("");
                opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("******Bienvenido******");

                        System.out.println("¿Cual es su nombre?");
                        nombre = entrada.nextLine();

                        jugadores[contador] = new Jugador(nombre);
                        
                        System.out.println("");
                        System.out.println("Proporcione el tamaño del tablero mayor a 10");
                        tamTablero = lecturaTam.nextInt();
                        System.out.println("");

                        while (tamTablero < 10) {
                            System.out.println("******************************************");
                            System.out.println("Vuelva a proporcionar el tamaño del tablero");
                            System.out.println("******************************************");
                            tamTablero = lecturaTam.nextInt();
                        }
                        fi = tamTablero;
                        colum = tamTablero;
                        MenuJuego();
                        break;

                    case 2:
                        System.out.println("");
                        System.out.println("HISTORIAL DE PARTIDAS");
                        for(Jugador Object: jugadores){
                            if(Object!=null){
                                System.err.println("Nombre: " + Object.getNombre() + " punteo" + Object.getPunteo() + " vidas restantes" + Object.getVidas());
                            }
                        }
                        System.out.println("");
                        break;

                    case 3:
                        for (Jugador Object : jugadores) {
                            if (Object != null) {

                                System.out.println("Nombre: " + Object.getNombre() + " Punteo: " + Object.getPunteo());

                            }
                        }
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("");
                        System.out.println("Jugadores que NO encontraron todas sus palabras");
                        for (Jugador Object : jugadores) {
                            if (Object != null) {
                                if (Object.getVidas() == 0) {
                                    System.out.println("Nombre: " + Object.getNombre());
                                }

                            }
                        }
                        System.out.println("");
                        break;

                    case 5:
                        System.out.println("");
                        System.out.println("Jugadores que SI encontraron todas sus palabras");

                        for (Jugador Object : jugadores) {
                            if (Object != null) {
                                if (Object.getVidas() != 0) {
                                    System.out.println("Nombre: " + Object.getNombre());
                                }

                            }
                        }
                        System.out.println("");
                        break;

                    case 6:
                        System.out.println("******************************************");
                        System.out.println("PRACTICA #1 NERY JOSE BARRIENTOS POSADAS");
                        System.out.println("CARNET: 201807086");
                        System.out.println("SECCIÓN: B ");
                        System.out.println("******************************************");
                        break;

                    case 7:
                        salir = true;
                        System.out.println("***GRACIAS POR JUGAR***");

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 7");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("DEBES ELEGIR UNA OPCION");
            }
        }
    }

    public static void Jugar(Jugador jugador, String[] Palabras) {

    }

    public static void MenuJuego() {
        System.out.println("1. MENU PALABRAS");
        System.out.println("2. JUGAR");
        System.out.println("3. TERMINAR PARTIDA");
        System.out.println("******************************************");
        System.out.println("INGRESE UNA OPCION:");
        System.out.println("******************************************");
        opcionMenu = lectura.nextInt();
        System.out.println("");

        switch (opcionMenu) {
            case 1:
                SubMenuJuego();
                break;

            case 2:
                System.out.println("******************************************");
                System.out.println("TE ENCUENTRAS EN EL MENU JUGAR");
                System.out.println("******************************************");

                fi = tamTablero;
                colum = tamTablero;
                System.out.println("LA MATRIZ ES:");
                System.out.println("");
                sopaLetras = new String[tamTablero][tamTablero];

                MatrizDefecto1();
                MatrizDefecto2();
                MatrizDefecto3();
                MatrizDefecto4();
                MatrizDefecto5();

                if (noPalabras == 1) {

                    MatrizPalabra1(palabra1);
                    Palabras = new String[1];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (noPalabras == 1) {
                            Palabras[i] = palabra1;
                        }
                    }

                } else if (noPalabras == 2) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    Palabras = new String[2];

                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        }

                    }

                } else if (noPalabras == 3) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    Palabras = new String[3];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        }

                    }

                } else if (noPalabras == 4) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    MatrizPalabra1(palabra4);
                    Palabras = new String[4];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        } else if (i == 3) {
                            Palabras[i] = palabra4;
                        }

                    }

                } else if (noPalabras == 5) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    MatrizPalabra1(palabra4);
                    MatrizPalabra1(palabra5);
                    Palabras = new String[5];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        } else if (i == 3) {
                            Palabras[i] = palabra4;
                        } else if (i == 4) {
                            Palabras[i] = palabra5;
                        }

                    }

                } else if (noPalabras == 6) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    MatrizPalabra1(palabra4);
                    MatrizPalabra1(palabra5);
                    MatrizPalabra1(palabra6);
                    Palabras = new String[6];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        } else if (i == 3) {
                            Palabras[i] = palabra4;
                        } else if (i == 4) {
                            Palabras[i] = palabra5;
                        } else if (i == 5) {
                            Palabras[i] = palabra6;
                        }

                    }

                } else if (noPalabras == 7) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    MatrizPalabra1(palabra4);
                    MatrizPalabra1(palabra5);
                    MatrizPalabra1(palabra6);
                    MatrizPalabra1(palabra7);
                    Palabras = new String[7];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        } else if (i == 3) {
                            Palabras[i] = palabra4;
                        } else if (i == 4) {
                            Palabras[i] = palabra5;
                        } else if (i == 5) {
                            Palabras[i] = palabra6;
                        } else if (i == 6) {
                            Palabras[i] = palabra7;
                        }

                    }

                } else if (noPalabras == 8) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    MatrizPalabra1(palabra4);
                    MatrizPalabra1(palabra5);
                    MatrizPalabra1(palabra6);
                    MatrizPalabra1(palabra7);
                    MatrizPalabra1(palabra8);
                    Palabras = new String[8];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        } else if (i == 3) {
                            Palabras[i] = palabra4;
                        } else if (i == 4) {
                            Palabras[i] = palabra5;
                        } else if (i == 5) {
                            Palabras[i] = palabra6;
                        } else if (i == 6) {
                            Palabras[i] = palabra7;
                        } else if (i == 7) {
                            Palabras[i] = palabra8;
                        }

                    }

                } else if (noPalabras == 9) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    MatrizPalabra1(palabra4);
                    MatrizPalabra1(palabra5);
                    MatrizPalabra1(palabra6);
                    MatrizPalabra1(palabra7);
                    MatrizPalabra1(palabra8);
                    MatrizPalabra1(palabra9);
                    Palabras = new String[9];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        } else if (i == 3) {
                            Palabras[i] = palabra4;
                        } else if (i == 4) {
                            Palabras[i] = palabra5;
                        } else if (i == 5) {
                            Palabras[i] = palabra6;
                        } else if (i == 6) {
                            Palabras[i] = palabra7;
                        } else if (i == 7) {
                            Palabras[i] = palabra8;
                        } else if (i == 8) {
                            Palabras[i] = palabra9;
                        }

                    }

                } else if (noPalabras == 10) {

                    MatrizPalabra1(palabra1);
                    MatrizPalabra1(palabra2);
                    MatrizPalabra1(palabra3);
                    MatrizPalabra1(palabra4);
                    MatrizPalabra1(palabra5);
                    MatrizPalabra1(palabra6);
                    MatrizPalabra1(palabra7);
                    MatrizPalabra1(palabra8);
                    MatrizPalabra1(palabra9);
                    MatrizPalabra1(palabra10);
                    Palabras = new String[10];
                    for (int j = 0; j < Palabras.length; j++) {
                        if (i == 0) {
                            Palabras[i] = palabra1;
                        } else if (i == 1) {
                            Palabras[i] = palabra2;
                        } else if (i == 2) {
                            Palabras[i] = palabra3;
                        } else if (i == 3) {
                            Palabras[i] = palabra4;
                        } else if (i == 4) {
                            Palabras[i] = palabra5;
                        } else if (i == 5) {
                            Palabras[i] = palabra6;
                        } else if (i == 6) {
                            Palabras[i] = palabra7;
                        } else if (i == 7) {
                            Palabras[i] = palabra8;
                        } else if (i == 8) {
                            Palabras[i] = palabra9;
                        } else if (i == 9) {
                            Palabras[i] = palabra10;
                        }

                    }

                }

                LlenarSopa(sopaLetras);
                VerSopa(sopaLetras);
                System.out.println("");
                
                while (jugadores[contador].getVidas() != 0) {
                    encontrarPalabra();
                }
                contador++;
                System.out.println("");
                System.out.println("YA NO TIENES VIDAS");
                System.out.println("");
                MenuJuego();
                palabra1=""; palabra2=""; palabra3=""; palabra4=""; palabra5=""; palabra6=""; palabra7=""; palabra8=""; palabra9=""; palabra10=""; palabraDefecto1=""; palabraDefecto2=""; palabraDefecto3="";
                palabraDefecto4="";  palabraDefecto5="";
                break;

            default:
                MenuPrincipal();
                break;

        }
    }

    public static void SubMenuJuego() {
        System.out.println("******************************************");
        System.out.println("TE ENCUENTRAS EN EL MENU DE PALABRAS");
        System.out.println("******************************************");
        System.out.println("");

        System.out.println("1. INSERTAR");
        System.out.println("2. MODIFICAR");
        System.out.println("3. ELIMINAR");
        System.out.println("4. SALIR");
        System.out.println("******************************************");
        System.out.println("INGRESE UNA OPCION");
        System.out.println("******************************************");
        System.out.println("");

        opcionMenuPal = lectura.nextInt();

        if (opcionMenuPal == 1) {
            System.out.println("******************************************");
            System.out.println("TE ENCUENTRAS EN EL MENU INSERTAR");
            System.out.println("******************************************");
            System.out.println("");
            Insertar();

        } else if (opcionMenuPal == 2) {
            System.out.println("******************************************");
            System.out.println("TE ENCUENTRAS EN EL MENU MODIFICAR");
            System.out.println("******************************************");
            System.out.println("");
            Modificar();

        } else if (opcionMenuPal == 3) {
            System.out.println("******************************************");
            System.out.println("TE ENCUENTRAS EN EL MENU ELIMINAR");
            System.out.println("******************************************");
            System.out.println("");
            Eliminar();

        } else if (opcionMenuPal == 4) {
            System.out.println("******************************************");
            System.out.println("REGRESASTE AL MENU DE NUEVA PARTIDA");
            System.out.println("******************************************");
            System.out.println("");
            MenuJuego();
        }

    }

    public static void ordenarHorizontal(String sopaLetras[][], String palabra, int fi, int colum) {

        for (int x = 0; x < palabra.length(); x++) {
            sopaLetras[fi][colum + x] = "" + palabra.charAt(x);
        }
    }

    public static void ordenarVertical(String sopaLetras[][], String palabra, int fi, int colum) {

        for (int x = 0; x < palabra.length(); x++) {
            sopaLetras[fi + x][colum] = "" + palabra.charAt(x);
        }
    }

    public static void VerSopa(String sopaLetras[][]) {
        for (int x = 0; x < fi; x++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("[ " + sopaLetras[x][j] + " ]");
            }
            System.out.println("");
        }
    }

    public static void LlenarSopa(String sopaLetras[][]) {
        for (int x = 0; x < tamTablero; x++) {
            for (int j = 0; j < tamTablero; j++) {
                if (sopaLetras[x][j] == null) {
                    sopaLetras[x][j] = String.valueOf(abecedario.toCharArray()[r1.nextInt(abecedario.length() - 1)]);
                }
            }
        }
    }

    public static void Insertar() {
        System.out.println("INGRESE EL NUMERO DE PALABRAS QUE DESEA INSERTAR");
        noPalabras = lectura.nextInt();

        if (noPalabras == 1) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }
        } else if (noPalabras == 2) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
        } else if (noPalabras == 3) {
            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }
        } else if (noPalabras == 4) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }

            System.out.println("INSERTE LA PALABRA NO.4");
            palabra4 = entradaPalabra4.nextLine();
            o = palabra4.length();

            while (o < 5 || o > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra4 = entradaPalabra4.nextLine();
                o = palabra4.length();
            }
        } else if (noPalabras == 5) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }

            System.out.println("INSERTE LA PALABRA NO.4");
            palabra4 = entradaPalabra4.nextLine();
            o = palabra4.length();

            while (o < 5 || o > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra4 = entradaPalabra4.nextLine();
                o = palabra4.length();
            }

            System.out.println("INSERTE LA PALABRA NO.5");
            palabra5 = entradaPalabra5.nextLine();
            u = palabra5.length();

            while (u < 5 || u > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra5 = entradaPalabra5.nextLine();
                u = palabra5.length();
            }
        } else if (noPalabras == 6) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }

            System.out.println("INSERTE LA PALABRA NO.4");
            palabra4 = entradaPalabra4.nextLine();
            o = palabra4.length();

            while (o < 5 || o > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra4 = entradaPalabra4.nextLine();
                o = palabra4.length();
            }

            System.out.println("INSERTE LA PALABRA NO.5");
            palabra5 = entradaPalabra5.nextLine();
            u = palabra5.length();

            while (u < 5 || u > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra5 = entradaPalabra5.nextLine();
                u = palabra5.length();
            }

            System.out.println("INSERTE LA PALABRA NO.6");
            palabra6 = entradaPalabra6.nextLine();
            a1 = palabra6.length();

            while (a1 < 5 || a1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra6 = entradaPalabra6.nextLine();
                a1 = palabra6.length();
            }

        } else if (noPalabras == 7) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }

            System.out.println("INSERTE LA PALABRA NO.4");
            palabra4 = entradaPalabra4.nextLine();
            o = palabra4.length();

            while (o < 5 || o > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra4 = entradaPalabra4.nextLine();
                o = palabra4.length();
            }

            System.out.println("INSERTE LA PALABRA NO.5");
            palabra5 = entradaPalabra5.nextLine();
            u = palabra5.length();

            while (u < 5 || u > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra5 = entradaPalabra5.nextLine();
                u = palabra5.length();
            }

            System.out.println("INSERTE LA PALABRA NO.6");
            palabra6 = entradaPalabra6.nextLine();
            a1 = palabra6.length();

            while (a1 < 5 || a1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra6 = entradaPalabra6.nextLine();
                a1 = palabra6.length();
            }

            System.out.println("INSERTE LA PALABRA NO.7");
            palabra7 = entradaPalabra7.nextLine();
            e1 = palabra7.length();

            while (e1 < 5 || e1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra7 = entradaPalabra7.nextLine();
                e1 = palabra7.length();
            }

        } else if (noPalabras == 8) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }

            System.out.println("INSERTE LA PALABRA NO.4");
            palabra4 = entradaPalabra4.nextLine();
            o = palabra4.length();

            while (o < 5 || o > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra4 = entradaPalabra4.nextLine();
                o = palabra4.length();
            }

            System.out.println("INSERTE LA PALABRA NO.5");
            palabra5 = entradaPalabra5.nextLine();
            u = palabra5.length();

            while (u < 5 || u > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra5 = entradaPalabra5.nextLine();
                u = palabra5.length();
            }

            System.out.println("INSERTE LA PALABRA NO.6");
            palabra6 = entradaPalabra6.nextLine();
            a1 = palabra6.length();

            while (a1 < 5 || a1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra6 = entradaPalabra6.nextLine();
                a1 = palabra6.length();
            }

            System.out.println("INSERTE LA PALABRA NO.7");
            palabra7 = entradaPalabra7.nextLine();
            e1 = palabra7.length();

            while (e1 < 5 || e1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra7 = entradaPalabra7.nextLine();
                e1 = palabra7.length();
            }

            System.out.println("INSERTE LA PALABRA NO.8");
            palabra8 = entradaPalabra8.nextLine();
            i1 = palabra8.length();

            while (i1 < 5 || i1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra8 = entradaPalabra8.nextLine();
                i1 = palabra8.length();
            }

        } else if (noPalabras == 9) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }

            System.out.println("INSERTE LA PALABRA NO.4");
            palabra4 = entradaPalabra4.nextLine();
            o = palabra4.length();

            while (o < 5 || o > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra4 = entradaPalabra4.nextLine();
                o = palabra4.length();
            }

            System.out.println("INSERTE LA PALABRA NO.5");
            palabra5 = entradaPalabra5.nextLine();
            u = palabra5.length();

            while (u < 5 || u > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra5 = entradaPalabra5.nextLine();
                u = palabra5.length();
            }

            System.out.println("INSERTE LA PALABRA NO.6");
            palabra6 = entradaPalabra6.nextLine();
            a1 = palabra6.length();

            while (a1 < 5 || a1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra6 = entradaPalabra6.nextLine();
                a1 = palabra6.length();
            }

            System.out.println("INSERTE LA PALABRA NO.7");
            palabra7 = entradaPalabra7.nextLine();
            e1 = palabra7.length();

            while (e1 < 5 || e1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra7 = entradaPalabra7.nextLine();
                e1 = palabra7.length();
            }

            System.out.println("INSERTE LA PALABRA NO.8");
            palabra8 = entradaPalabra8.nextLine();
            i1 = palabra8.length();

            while (i1 < 5 || i1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra8 = entradaPalabra8.nextLine();
                i1 = palabra8.length();
            }

            System.out.println("INSERTE LA PALABRA NO.9");
            palabra9 = entradaPalabra9.nextLine();
            o1 = palabra9.length();

            while (o1 < 5 || o1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra9 = entradaPalabra9.nextLine();
                o1 = palabra9.length();
            }

        } else if (noPalabras == 10) {

            System.out.println("INSERTE LA PALABRA NO.1");
            palabra1 = entradaPalabra1.nextLine();
            a = palabra1.length();

            while (a < 5 || a > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra1 = entradaPalabra1.nextLine();
                a = palabra1.length();
            }

            System.out.println("INSERTE LA PALBRA NO.2");
            palabra2 = entradaPalabra2.nextLine();
            e = palabra2.length();

            while (e < 5 || e > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra2 = entradaPalabra2.nextLine();
                e = palabra2.length();
            }
            System.out.println("INSERTE LA PALABRA NO.3");
            palabra3 = entradaPalabra3.nextLine();
            i = palabra3.length();

            while (i < 5 || i > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra3 = entradaPalabra3.nextLine();
                i = palabra3.length();
            }

            System.out.println("INSERTE LA PALABRA NO.4");
            palabra4 = entradaPalabra4.nextLine();
            o = palabra4.length();

            while (o < 5 || o > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra4 = entradaPalabra4.nextLine();
                o = palabra4.length();
            }

            System.out.println("INSERTE LA PALABRA NO.5");
            palabra5 = entradaPalabra5.nextLine();
            u = palabra5.length();

            while (u < 5 || u > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra5 = entradaPalabra5.nextLine();
                u = palabra5.length();
            }

            System.out.println("INSERTE LA PALABRA NO.6");
            palabra6 = entradaPalabra6.nextLine();
            a1 = palabra6.length();

            while (a1 < 5 || a1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra6 = entradaPalabra6.nextLine();
                a1 = palabra6.length();
            }

            System.out.println("INSERTE LA PALABRA NO.7");
            palabra7 = entradaPalabra7.nextLine();
            e1 = palabra7.length();

            while (e1 < 5 || e1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra7 = entradaPalabra7.nextLine();
                e1 = palabra7.length();
            }

            System.out.println("INSERTE LA PALABRA NO.8");
            palabra8 = entradaPalabra8.nextLine();
            i1 = palabra8.length();

            while (i1 < 5 || i1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra8 = entradaPalabra8.nextLine();
                i1 = palabra8.length();
            }

            System.out.println("INSERTE LA PALABRA NO.9");
            palabra9 = entradaPalabra9.nextLine();
            o1 = palabra9.length();

            while (o1 < 5 || o1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra9 = entradaPalabra9.nextLine();
                o1 = palabra9.length();
            }

            System.out.println("INSERTE LA PALABRA NO.10");
            palabra10 = entradaPalabra10.nextLine();
            u1 = palabra10.length();

            while (u1 < 5 || u1 > 10) {
                System.out.println("INGRESE UNA PALABRA VALIDA EN EL RANGO DE 5 A 10");
                palabra10 = entradaPalabra10.nextLine();
                u1 = palabra10.length();
            }

        }
        SubMenuJuego();
    }

    public static void Modificar() {
        if (noPalabras == 1) {

            System.out.println("LA PALABRA NO.1 ES :" + palabra1);

        } else if (noPalabras == 2) {

            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);

        } else if (noPalabras == 3) {

            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);

        } else if (noPalabras == 4) {

            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);

        } else if (noPalabras == 5) {
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);

        } else if (noPalabras == 6) {
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);
            System.out.println("LA PALABRA NO.6 ES :" + palabra6);

        } else if (noPalabras == 7) {
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);
            System.out.println("LA PALABRA NO.6 ES :" + palabra6);
            System.out.println("LA PALABRA NO.7 ES :" + palabra7);

        } else if (noPalabras == 8) {
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);
            System.out.println("LA PALABRA NO.6 ES :" + palabra6);
            System.out.println("LA PALABRA NO.7 ES :" + palabra7);
            System.out.println("LA PALABRA NO.8 ES :" + palabra8);

        } else if (noPalabras == 9) {
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);
            System.out.println("LA PALABRA NO.6 ES :" + palabra6);
            System.out.println("LA PALABRA NO.7 ES :" + palabra7);
            System.out.println("LA PALABRA NO.8 ES :" + palabra8);
            System.out.println("LA PALABRA NO.9 ES :" + palabra9);

        } else if (noPalabras == 10) {
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);
            System.out.println("LA PALABRA NO.6 ES :" + palabra6);
            System.out.println("LA PALABRA NO.7 ES :" + palabra7);
            System.out.println("LA PALABRA NO.8 ES :" + palabra8);
            System.out.println("LA PALABRA NO.9 ES :" + palabra9);
            System.out.println("LA PALABRA NO.10 ES :" + palabra10);

        }

        System.out.println("***********************************************************");
        System.out.println("QUE NUMERO DE PALABRA DESEA EDITAR EN EL RANGO DE 1 A 10");
        System.out.println("***********************************************************");
        System.out.println("");
        palabraModificar = entradaPalabra1.nextInt();

        if (palabraModificar == 1) {
            PalabraVacia1();
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            ModificarPalabra1();

        } else if (palabraModificar == 2) {
            PalabraVacia2();
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            ModificarPalabra2();

        } else if (palabraModificar == 3) {
            PalabraVacia3();
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            ModificarPalabra3();

        } else if (palabraModificar == 4) {
            PalabraVacia4();
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            ModificarPalabra4();

        } else if (palabraModificar == 5) {
            PalabraVacia5();
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);
            ModificarPalabra5();

        } else if (palabraModificar == 6) {
            PalabraVacia6();
            System.out.println("LA PALABRA NO.6 ES :" + palabra6);
            ModificarPalabra6();

        } else if (palabraModificar == 7) {
            PalabraVacia7();
            System.out.println("LA PALABRA NO.7 ES :" + palabra7);
            ModificarPalabra7();

        } else if (palabraModificar == 8) {
            PalabraVacia8();
            System.out.println("LA PALABRA NO.8 ES :" + palabra8);
            ModificarPalabra8();

        } else if (palabraModificar == 9) {
            PalabraVacia9();
            System.out.println("LA PALABRA NO.9 ES :" + palabra9);
            ModificarPalabra9();

        } else if (palabraModificar == 10) {
            PalabraVacia10();
            System.out.println("LA PALABRA NO.10 ES :" + palabra10);
            ModificarPalabra10();

        } else if (palabraModificar <= 0) {
            System.out.println("NO EXISTE ESA OPCION");
            Modificar();
        } else if (palabraModificar >= 11) {
            System.out.println("SOLO EXISTEN 5 PALABRAS");
            Modificar();
        }
        SubMenuJuego();
    }

    public static void Eliminar() {

        System.out.println("INGRESE EL NUMERO DE PALABRA QUE DESEA ELIMINAR(EN UN RANGO DE 0 A 5)");
        palabraModificar = entradaPalabra1.nextInt();

        if (palabraModificar == 1) {
            System.out.println("LA PALABRA NO.1 ES :" + palabra1);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra1 = "";
        } else if (palabraModificar == 2) {
            System.out.println("LA PALABRA NO.2 ES :" + palabra2);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra2 = "";
        }else if (palabraModificar == 3) {
            System.out.println("LA PALABRA NO.3 ES :" + palabra3);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra3 = "";
        }else if (palabraModificar == 4) {
            System.out.println("LA PALABRA NO.4 ES :" + palabra4);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra4 = "";
        }else if (palabraModificar == 5) {
            System.out.println("LA PALABRA NO.5 ES :" + palabra5);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra5 = "";
        }else if (palabraModificar == 6) {
            System.out.println("LA PALABRA NO.5 ES :" + palabra6);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra6 = "";
        }else if (palabraModificar == 7) {
            System.out.println("LA PALABRA NO.5 ES :" + palabra7);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra7 = "";
        }else if (palabraModificar == 8) {
            System.out.println("LA PALABRA NO.5 ES :" + palabra8);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra8 = "";
        }else if (palabraModificar == 9) {
            System.out.println("LA PALABRA NO.5 ES :" + palabra9);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra9 = "";
        }else if (palabraModificar == 5) {
            System.out.println("LA PALABRA NO.5 ES :" + palabra10);
            System.out.println("LA PALABRA FUE ELIMINADA");
            palabra10 = "";
        }else if (palabraModificar <= 0) {
            System.out.println("NO EXISTE PALABRA NO.0");
            Eliminar();
        } else if (palabraModificar >= 11) {
            System.out.println("SOLO EXISTEN 5 PALABRAS");
            Eliminar();
        }
        SubMenuJuego();
    }

    public static void ModificarPalabra1() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra1 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra1();
            System.out.println("");
        }
    }

    public static void ModificarPalabra2() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra2 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra2();
            System.out.println("");
        }
    }

    public static void ModificarPalabra3() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra3 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra3();
            System.out.println("");
        }
    }

    public static void ModificarPalabra4() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra4 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra4();
            System.out.println("");
        }
    }

    public static void ModificarPalabra5() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra5 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra5();
            System.out.println("");
        }
    }

    public static void ModificarPalabra6() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra6 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra6();
            System.out.println("");
        }
    }

    public static void ModificarPalabra7() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra7 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra7();
            System.out.println("");
        }
    }

    public static void ModificarPalabra8() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra8 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra8();
            System.out.println("");
        }
    }

    public static void ModificarPalabra9() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra9 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra9();
            System.out.println("");
        }
    }

    public static void ModificarPalabra10() {

        System.out.println("INGRESE LA PALABRA HA REMPLAZAR");
        palabraRemplazar = entrada.nextLine();

        if (palabraRemplazar.length() >= 5 && palabraRemplazar.length() <= 10) {
            palabra10 = palabraRemplazar;
        } else {
            System.out.println("LA PALABRA NO ESTA EN EL RANGO DE 5 A 10 CARACTERES");
            ModificarPalabra10();
            System.out.println("");
        }
    }

    public static void PalabraVacia1() {

        if (a == 0) {
            System.out.println("LA PALABRA 1 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia2() {

        if (e == 0) {
            System.out.println("LA PALABRA 2 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia3() {

        if (i == 0) {
            System.out.println("LA PALABRA 3 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia4() {

        if (o == 0) {
            System.out.println("LA PALABRA 4 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia5() {

        if (u == 0) {
            System.out.println("LA PALABRA 5 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia6() {

        if (a1 == 0) {
            System.out.println("LA PALABRA 6 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia7() {

        if (e1 == 0) {
            System.out.println("LA PALABRA 7 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia8() {

        if (i1 == 0) {
            System.out.println("LA PALABRA 8 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia9() {

        if (o1 == 0) {
            System.out.println("LA PALABRA 9 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void PalabraVacia10() {

        if (u1 == 0) {
            System.out.println("LA PALABRA 10 NO TIENE ASIGNADO UN VALOR");
            SubMenuJuego();
        }
    }

    public static void MatrizPalabra1(String palabra) {

        verOHori = (int) (r1.nextInt(2));
        fi1 = (int) (r1.nextInt(sopaLetras.length));
        colum1 = (int) (r1.nextInt(sopaLetras[0].length));     

        if (verOHori == 0) {

            if ((colum1 + palabra.length()) >= sopaLetras[0].length - 1) {
                colum1 = colum1 - palabra.length();
            }
            ordenarHorizontal(sopaLetras, palabra, fi1, colum1);

        } else if (verOHori == 1) {

            if ((fi1 + palabra.length()) >= sopaLetras.length) {
                fi1 = fi1 - palabra.length();
            }
            ordenarVertical(sopaLetras, palabra, fi1, colum1);
        }
    }

   public static void MatrizDefecto1(){
    
        verOHori = (int) (r1.nextInt(2));
        fi1 = (int) (r1.nextInt(sopaLetras.length));
        colum1 = (int) (r1.nextInt(sopaLetras[0].length));     
    

        if(verOHori == 0 ){
        
            if((colum1+palabraDefecto1.length())>sopaLetras[0].length){
            colum1=colum1-palabraDefecto1.length();
            }
            ordenarHorizontal(sopaLetras,palabraDefecto1,fi1,colum1); 
            
        
        }else if(verOHori == 1){
        
        if((fi1+palabraDefecto1.length())>sopaLetras.length){
        fi1=fi1-palabraDefecto1.length();
        }
            ordenarVertical(sopaLetras,palabraDefecto1, fi1, colum1);
        }
    }

    public static void MatrizDefecto2() {

        verOHori = (int) (r1.nextInt(2));
        fi1 = (int) (r1.nextInt(sopaLetras.length));
        colum1 = (int) (r1.nextInt(sopaLetras[0].length));     

        if (verOHori == 0) {

            if ((colum1 + palabraDefecto2.length()) > sopaLetras[0].length) {
                colum1 = colum1 - palabraDefecto2.length();
            }
            ordenarHorizontal(sopaLetras, palabraDefecto2, fi1, colum1);

        } else if (verOHori == 1) {

            if ((fi1 + palabraDefecto2.length()) > sopaLetras.length) {
                fi1 = fi1 - palabraDefecto2.length();
            }
            ordenarVertical(sopaLetras, palabraDefecto2, fi1, colum1);
        }
    }

    public static void MatrizDefecto3() {

        verOHori = (int) (r1.nextInt(2));
        fi1 = (int) (r1.nextInt(sopaLetras.length));
        colum1 = (int) (r1.nextInt(sopaLetras[0].length));     

        if (verOHori == 0) {

            if ((colum1 + palabraDefecto3.length()) > sopaLetras[0].length) {
                colum1 = colum1 - palabraDefecto3.length();
            }
            ordenarHorizontal(sopaLetras, palabraDefecto3, fi1, colum1);

        } else if (verOHori == 1) {

            if ((fi1 + palabraDefecto3.length()) > sopaLetras.length) {
                fi1 = fi1 - palabraDefecto3.length();
            }
            ordenarVertical(sopaLetras, palabraDefecto3, fi1, colum1);
        }
    }

    public static void MatrizDefecto4() {

        verOHori = (int) (r1.nextInt(2));
        fi1 = (int) (r1.nextInt(sopaLetras.length));
        colum1 = (int) (r1.nextInt(sopaLetras[0].length));     

        if (verOHori == 0) {

            if ((colum1 + palabraDefecto4.length()) > sopaLetras[0].length) {
                colum1 = colum1 - palabraDefecto4.length();
            }
            ordenarHorizontal(sopaLetras, palabraDefecto4, fi1, colum1);

        } else if (verOHori == 1) {

            if ((fi1 + palabraDefecto4.length()) > sopaLetras.length) {
                fi1 = fi1 - palabraDefecto4.length();
            }
            ordenarVertical(sopaLetras, palabraDefecto4, fi1, colum1);
        }
    }

    public static void MatrizDefecto5() {

        verOHori = (int) (r1.nextInt(2));
        fi1 = (int) (r1.nextInt(sopaLetras.length));
        colum1 = (int) (r1.nextInt(sopaLetras[0].length));     

        if (verOHori == 0) {

            if ((colum1 + palabraDefecto5.length()) > sopaLetras[0].length) {
                colum1 = colum1 - palabraDefecto5.length();
            }
            ordenarHorizontal(sopaLetras, palabraDefecto5, fi1, colum1);

        } else if (verOHori == 1) {

            if ((fi1 + palabraDefecto5.length()) > sopaLetras.length) {
                fi1 = fi1 - palabraDefecto5.length();
            }
            ordenarVertical(sopaLetras, palabraDefecto5, fi1, colum1);
        }
    }

    public static void encontrarPalabra() {

        System.out.println("INGRESE LA PALABRA ENCONTRADA");
        palabraEcnontrada1 = entradaPalabra1.nextLine();
        boolean a = false;

        if (palabraEcnontrada1.equals(palabra1)) {
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();
            a = true;
            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            jugadores[contador].setPunteo((palabra1.length() + jugadores[contador].getPunteo()));
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra2)) {
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();
            a = true;
            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
            jugadores[contador].setPunteo((palabra2.length() + jugadores[contador].getPunteo()));
        } else if (palabraEcnontrada1.equals(palabra3)) {
            jugadores[contador].setPunteo((palabra3.length() + jugadores[contador].getPunteo()));
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();
            a = true;
            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra4)) {
            jugadores[contador].setPunteo((palabra4.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra5)) {
            jugadores[contador].setPunteo((palabra5.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra6)) {
            jugadores[contador].setPunteo((palabra6.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra7)) {
            jugadores[contador].setPunteo((palabra7.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra8)) {
            jugadores[contador].setPunteo((palabra8.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra9)) {
            jugadores[contador].setPunteo((palabra9.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabra10)) {
            jugadores[contador].setPunteo((palabra10.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabraDefecto1)) {
            jugadores[contador].setPunteo((palabraDefecto1.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabraDefecto2)) {
            jugadores[contador].setPunteo((palabraDefecto2.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabraDefecto3)) {
            jugadores[contador].setPunteo((palabraDefecto3.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {

                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabraDefecto4)) {
            jugadores[contador].setPunteo((palabraDefecto4.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        } else if (palabraEcnontrada1.equals(palabraDefecto5)) {
            jugadores[contador].setPunteo((palabraDefecto5.length() + jugadores[contador].getPunteo()));
            a = true;
            System.out.println("ES 1. VERTICAL O 2.HORIZONTAL");
            VerHoriPal1 = entrada.nextInt();
            System.out.println("EN QUE FILA SE ENCUENTRA");
            fiEncontrada1 = lecturaTam.nextInt();
            System.out.println("EN QUE COLUMNA SE ENCUENTRA");
            columEncontrada1 = lectura.nextInt();

            if (VerHoriPal1 == 1) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1 + j][columEncontrada1] = "" + "$";
                }
            } else if (VerHoriPal1 == 2) {
                for (int j = 0; j < palabraEcnontrada1.length(); j++) {
                    sopaLetras[fiEncontrada1][columEncontrada1 + j] = "" + "$";
                }
            }
            if(a == true){
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());    
            }
            VerSopa(sopaLetras);
            encontrarPalabra();
        }
        if (a == false) {
            jugadores[contador].setVidas(jugadores[contador].getVidas() - 1);
            jugadores[contador].setPunteo(jugadores[contador].getPunteo() - 5);
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());            
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());

        } else {
            System.out.println(jugadores[contador].getNombre() + " sus vidas: " + jugadores[contador].getVidas());
            System.out.println(jugadores[contador].getNombre() + " su punteo: " + jugadores[contador].getPunteo());           
        }

    }
}
              