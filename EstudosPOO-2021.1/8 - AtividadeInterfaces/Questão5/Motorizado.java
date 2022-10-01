package Questão5;

public interface Motorizado {
	default void ligarMotor() {}
	default void abastecer(int numLitros) {}
}