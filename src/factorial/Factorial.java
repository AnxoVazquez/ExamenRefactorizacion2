/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author avazquezsuarez
 */
public class Factorial {

    public static void main(String[] args) {
        //Cambiamos y actualizamos el nombre de las variables junto con el formateo del código

        int valor1;
        int valor2;

        valor1 = 8;

        int i;
        if (valor1 == 0) {
            valor2 = 1;
        } else {
            valor2 = 1;
        }
        for (i = valor1; i >= 1; i--) {
            valor2 = valor2 * i;
        }

    }

}
