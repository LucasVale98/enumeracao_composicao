package application;

import java.sql.Date;

import entities.Order;
import entities_enum.OrderStatus;

public class ProgramEnum {
	private void maiin() {
		Order order = new Order(1080, new Date(0), OrderStatus.PROCESSANDO);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENVIANDO;
		
		OrderStatus os2 = OrderStatus.valueOf("ENVIANDO");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
