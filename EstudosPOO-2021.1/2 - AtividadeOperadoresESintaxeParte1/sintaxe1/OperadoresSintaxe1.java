package sintaxe1;

public class OperadoresSintaxe1 {
	public static int VariavelClasse = 100; // Modificador static determina se a vari�vel � de classe.
	public int VariavelObjeto = 100; // N�o possui o modificador static, logo � uma vari�vel de objeto.
	
	public static void main(String[] args) {
		OperadoresSintaxe1 exemplo1 = new OperadoresSintaxe1();
		OperadoresSintaxe1 exemplo2 = new OperadoresSintaxe1();
		
		OperadoresSintaxe1.VariavelClasse++;
		System.out.println("VariavelClasse: "+OperadoresSintaxe1.VariavelClasse);
		/* Com uma vari�vel de classe caso mudemos o valor de exemplo1.VariavelClasse o valor de 
		exemplo2.VariavelClasse tamb�m sera mudado devido ao static. */
		
		exemplo1.VariavelObjeto++;
		System.out.println("VariavelObjeto: "+exemplo2.VariavelObjeto);
		/* Como VariavelObjeto n�o possui static, ent�o caso mudarmos o valor de exemplo1.VariavelObjeto
		o valor de exemplo2.VariavelObjeto permanece o mesmo. */
	}
}