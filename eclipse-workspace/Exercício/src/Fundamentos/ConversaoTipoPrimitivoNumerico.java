package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) 
	
	{
	
	double a = 1; // impl�cita
	System.out.println(a);
	
	float b = (float)1.23232423423424; // expl�cito (CAST)
	System.out.println(b);
	
	int c = 340;
	byte d = (byte)c; // expl�cito (CAST)
	System.out.println(d);
	
	double e = 1.999999;
	int f = (int) e; // expl�cita (CAST)
	
	System.out.println(f);
	
	
	}

}
