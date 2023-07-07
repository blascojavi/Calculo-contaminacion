/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjavierblascoalarcon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExamenJavierBlascoAlarcon {

    public static void main(String[] args) {
        // TODO code application logic here
        int valorAula2A1 = 0, valorAula2A2 = 0;
        int diasRegistro = 15;
        int maxValor = 800;
        int max = 900, min = 80;

        List<Integer> regDiarioAula2A1 = new ArrayList<>();
        List<Integer> regDiarioAula2A3 = new ArrayList<>();
        Map<Integer, Integer> maxDiarioAula2A3 = new HashMap<>();
        try {
            //Genero dos bucles, en el que cada iteracion genera un valor de 
            //contaminacion y lo añade en el ArrayLlist de Aula 2A1 y Aula 2A3
            for (int i = 0; i <= diasRegistro - 1; i++) {

                int valorContaminacion = (int) (Math.random() * (max - min + 1) + min);
                //System.out.print(valorContaminacion + " "); 
                regDiarioAula2A1.add(valorContaminacion);
                
            }
            for (int i = 0; i <= diasRegistro - 1; i++) {

                int valorContaminacion = (int) (Math.random() * (max - min + 1) + min);
                //System.out.print(valorContaminacion + " "); 
                regDiarioAula2A3.add(valorContaminacion);
            }
            //Generamos un bucle donde 
            for (int i = 0; i < diasRegistro; i++) {
                String mayorConcentracion = "";
                if (regDiarioAula2A1.get(i) > regDiarioAula2A3.get(i)) {
                    mayorConcentracion = "Aula2A1";
                } else {
                    mayorConcentracion = "Aula2A2";
                }
                System.out.println("Día " + (i + 1) + " aula 2A1 " + "(" + regDiarioAula2A1.get(i) + ")" + "-" + " aula2A3 " + "(" + regDiarioAula2A3.get(i) + ")" + "--> Hay mayor concentración en el aula " + mayorConcentracion);

                //Ejercicio2
            }
            System.out.println("\n--------------------------------------------------------------");
            for (int j = 0; j < diasRegistro; j++) {
                if (regDiarioAula2A3.get(j) > maxValor) {
                    maxDiarioAula2A3.put((j + 1), regDiarioAula2A3.get(j));
                }
            }

            System.out.println(maxDiarioAula2A3.size() + " dias con mas de 800 ppm en el aula 2A3");

            for (Integer nombre : maxDiarioAula2A3.keySet()) {
                Integer valor = maxDiarioAula2A3.get(nombre);
                System.out.println("Dia " + nombre + "  " + "(" + (valor - maxValor) + "ppm por encima)");
            }

        } catch (NumberFormatException e) {
            //si algo falla salta la excepción
            System.out.println("Error inesperado");
        }
    }
    
    
    
public static int calculoRandom( int base, int exponente ) {
int max = 900;
int min = 80;

    
 int random = (int) (Math.random() * (max - min + 1) + min);

return random;
}
  
}




