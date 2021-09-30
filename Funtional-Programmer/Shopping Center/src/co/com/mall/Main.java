package co.com.mall;

import java.util.stream.Stream;

import co.com.mall.Mian.Greeting;
import co.com.mall.menu.OpcionesMenu;


public class Main {

	public static void main(String[] args) {
		
		OpcionesMenu opc = new OpcionesMenu ();		
		String result = opc.init();

		System.out.println(result);
		
		
//		Greeting juan = () -> "Hello  everyOne Juan is Here";
//		Greeting paula = () -> "Hello Juan, nice to meet you";
//		Greeting carlos = () -> "Good Morning";
//		
//		Stream.of(juan,paula,carlos)
//		.forEach(greeting -> System.out.println(greeting.greet()));
//		
		
		
	}

}
