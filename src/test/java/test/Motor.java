package test;

public class Motor {
	int numeroCilindros;
	String tipos;
	int registro;
	
	void cambiarRegistro(int registro)
	{
		this.registro =registro;
	}
	void asignarTipo(String tipos)
	{
		if (tipos == "electrico" || tipos == "gasolina")
		{
			this.tipos = tipos;
			
		}
}
		
	}
