package sintaxe1;

public class OperadoresSintaxe1 {
	public static int VariavelClasse = 100; // Modificador static determina se a variável é de classe.
	public int VariavelObjeto = 100; // Não possui o modificador static, logo é uma variável de objeto.
	
	public static void main(String[] args) {
		OperadoresSintaxe1 exemplo1 = new OperadoresSintaxe1();
		OperadoresSintaxe1 exemplo2 = new OperadoresSintaxe1();
		
		OperadoresSintaxe1.VariavelClasse++;
		System.out.println("VariavelClasse: "+OperadoresSintaxe1.VariavelClasse);
		/* Com uma variável de classe caso mudemos o valor de exemplo1.VariavelClasse o valor de 
		exemplo2.VariavelClasse também sera mudado devido ao static. */
		
		exemplo1.VariavelObjeto++;
		System.out.println("VariavelObjeto: "+exemplo2.VariavelObjeto);
		/* Como VariavelObjeto não possui static, então caso mudarmos o valor de exemplo1.VariavelObjeto
		o valor de exemplo2.VariavelObjeto permanece o mesmo. */
	}
}