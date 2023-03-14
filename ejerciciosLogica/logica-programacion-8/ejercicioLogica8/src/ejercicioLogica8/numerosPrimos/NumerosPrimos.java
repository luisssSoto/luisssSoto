package ejercicioLogica8.numerosPrimos;
import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
		//Creando array
        int tenNumbers[];
        tenNumbers = new int [10];

        //Creando objeto Scanner
        Scanner sn1 = new Scanner(System.in);
        
        int count = 0;
        int countP = 0;
        int countPrimos = 0;
        
        //Llenando el array con los valores que me dio el usuario
        for (int i = 0; i < tenNumbers.length; i++) {
            System.out.println("i: " + i);
            int tenNumber = tenNumbers[i];
            System.out.println("Ingresa el valor en la posicion: " + i + " ");
            int element = Integer.parseInt(sn1.next());
            tenNumber = element;
            System.out.println(i + " - " + element);
            int[] primos = new int[element-2];
            int k = 1;
            for (int j = 0; j < primos.length; j++) {
                k++;
                primos[j] = k;
            }
                while(count != element-2){
                    for (int j = 0; j < element-2; j++) {
                    	System.out.println("primos j: " + primos[j]);
                        if (tenNumber % primos[j] == 0) {
                            System.out.println(tenNumber + " no es un numero primo");
                            count = element-2;
                            break;
                        }
                    else{
                        System.out.println(tenNumber + " ya es un numero primo");
                        countP += 1;
                        count = element-2;
                        if(countP == element-2){
                            tenNumbers[countPrimos] = tenNumber;
                            System.out.println("countPrimos: " + countPrimos);
                            countPrimos+=1; 
                        }
                    }
                        
                    }   
                }
                for (int l = 0; l < tenNumbers.length; l++) {
                int tenNumberPrimos = tenNumbers[l];
                    System.out.println("indice: " + tenNumberPrimos + " - " + tenNumbers[l]);
            }
        }
            
        }
	}

