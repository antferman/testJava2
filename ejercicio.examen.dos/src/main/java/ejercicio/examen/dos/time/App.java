package ejercicio.examen.dos.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
	public static void main(String[] args) {
		
		//Diferencia entre fechas
		ejercicio1ExtraTime();
		
		//Obtener zona a partir de fecha en string
		ejercicio2ExtraTime();
	}

	private static void ejercicio2ExtraTime() {
		String fecha = "22/11/2021";
		ZoneId zd = ZoneId.of("Europe/Madrid");
		ZonedDateTime zdt = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		 try {
			 zdt = ZonedDateTime.of(simpleDateFormat.parse(fecha).toInstant().atZone(zd).toLocalDateTime(), zd);
			 
			 System.out.println("Fecha formateada:  " + zdt);
			 
		 }catch (ParseException e) {
			 e.printStackTrace();
		 }
		
	}

	private static void ejercicio1ExtraTime() {
		LocalDate fecha1 = LocalDate.of(2021, 11, 22);
		LocalDate fecha2 = LocalDate.of(2021, 11, 26);
		
		System.out.println("Quedan "+  Period.between(fecha1, fecha2).getDays()+" días para acabar el talent camp");
		
		
	}
}
