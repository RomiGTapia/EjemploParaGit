/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparagit;

import java.util.Scanner;

/**
 *
 * @author coki_
 */
public class EjemploParaGit {

    /*
 * Crea un programa que simule el comportamiento del sombrero selccionador del
 * universo mágico de Harry Potter.
 * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
 * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
 * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
 *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
 * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
 *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
     */
    public static void main(String[] args) {
        boolean isOK;
        int option;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido soy el sombrero seleccionador del universo Magico");
        System.out.println("Responde este cuestinario de 5 preguntas y lo sabras");
        do {
            isOK = true;
            System.out.println("¿Cual de estas palabras te describe mejor?");

            System.out.println("1.Valentia");

            System.out.println("2.Liderazgo");

            System.out.println("3.Lealtad");

            System.out.println("4.Inteligencia");
            System.out.println("5.Salir");

            option = leer.nextInt();

            switch (option) {
                case 1:
                    System.out.println("GRIFFINDOR");
                    break;
                case 2:
                    System.out.println("SLYTHERIN");
                    break;
                case 3:
                    System.out.println("HUFLEPUFF");
                    break;
                case 4:
                    System.out.println("RAVENCLAW");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    isOK = false;
            }

        } while (option != 5 && !isOK);

    }

}
