/* 1. Faça um programa que peça dois números inteiros, imprima a soma
desses dois números na tela.*/

/*import java.util.Scanner; 

public class Exercicio {
    public static void main(String[] args){
       Scanner valor = new Scanner(System.in);  // buffer memoria 
       System.out.println("Digite dois numeros"); // mensagem de solicitação 
       int numero1 = valor.nextInt(); // variavel de acordo com a função ex: neste caso seria uma soma 
       int numero2 = valor.nextInt();
       System.out.println( numero1 + numero2); // execução da variavel e seu resultado 
     
       

       System.out.println("Exercicio 1");


    }
}  */


/*2. Escreva um programa que leia um valor em metros e o exiba convertido
em centímetros.*/


/*import java.util.Scanner; 

public class Exercicio {
    public static void main(String[] args){
       Scanner valor = new Scanner(System.in); 
       System.out.println("Escreva um numero em metros para transformar em cetimetros ");
       int valor = valor.nextInt(); 
       int resultado = cm * 100; // resultado - vai transformar o valor que receber em centimetro.
        System.out.println("transformando em cm o valor: " + resultado);  
     
       

       System.out.println("Exercicio 2");


    }
}
 */

 /*3. Faça um programa que peça um número e imprime dizendo se é par ou
ímpar.*/

import java.util.Scanner; 

public class Exercicio {
    public static void main(String[] args){
       Scanner numero = new Scanner(System.in); 
       System.out.println("Escreva um numero:");
       int num = numero.nextInt(); 

       if(num %==0){
           System.out.println("par");
           }else{
            System.out.println("impar");

           }

           System.out.println("Exercicio 3");
       }
    }



    /*4. Escreva um programa que pergunte a velocidade do carro de um usuário.
Caso ultrapasse 80 Km/h, exiba uma mensagem dizendo que o usuário
foi multado. Nesse caso, exiba o valor da multa, cobrando R$ 5 por Km
acima de 80km/h*/

   /*  public static void main(String[] args){
        Scanner velocidade = new Scanner(System.in);
        System.out.println("Digite a velocidade: ");
        double val = velocidade.nextDouble();
        if(val > 80){
            Double acima = val - 80;
            Double multa = acima * 5;
            System.out.println("Você ultrapassou a velocidade permitida, sua multa e de: " + multa);
        }else{
            System.out.println("Você esta dentro do limite permitido.");
        }

        System.out.println("Exercicio");*/



  
