package Questão3;

public interface DefaultMetodoTeste {
	
	default void base() {
		System.out.println("Possui base");
	}
	default void altura() {
		System.out.println("Possui altura");
	}
}