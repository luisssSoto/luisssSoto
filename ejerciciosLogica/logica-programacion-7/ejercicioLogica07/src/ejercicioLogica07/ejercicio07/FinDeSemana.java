package ejercicioLogica07.ejercicio07;
import java.util.Scanner;

public class FinDeSemana {
	/*● Crear un programa en Java que realice lo siguiente:
		○ Debe solicitar al usuario un día de la semana (de lunes a viernes).
		○ Debe solicitar al usuario una hora (horas y minutos).
		○ Debe calcular cuantos minutos faltan para el fin de semana. Se considera que el fin de semana comienza el
		viernes a las 15:00 hrs.
		○ Debe mostrar el resultado por consola.
		○ Debe ser capaz de identificar si los datos de entrada son válidos (día de la semana válido, hora válida,
		minutos válidos), en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
		● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
		○ Entradas: Lunes, 14:30 hrs
		■ lunes
		■ 14
		■ 30
		○ Salida:
		■ Faltan 5730 minutos para el fin de semana*/
	public static void main(String[] args) {
		/*Scanner sn1 = new Scanner(System.in);
		System.out.println("Ingresa un dia de Lunes a Viernes: ");
		String dia = sn1.next();
		System.out.println("Ingresa una hora en l formato de 24:00 : ");
		int horas = sn1.nextInt();
		System.out.println("Ingresa los minutos en el formato de 0-60");
		int minutos = sn1.nextInt();*/
		
		String day = "";
		day = "Lunes";
		
		switch (day) {
		case "Lunes":
			day = "1";
			break;
		case "Martes":
			day = "2";
			break;
		case "Miercoles":
			day = "3";
			break;
		case "Jueves":
			day = "4";
			break;
		case "Viernes":
			day = "5";
			break;
		case "Sabado":
			day = "6";
			break;
		case "Domingo":
			day = "0";
		break;
		default:
			day = "No se encontraron coincidencias";
			break;
		}
		
		int numDay = Integer.parseInt(day);
		System.out.println(day);
		System.out.println(numDay);
}
}
