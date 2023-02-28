import java.util.Arrays;

public class Aula {
	
	private Alumno alumno;
	private Alumno[] alumnos;
	
	public Aula() {
		
		int notaBBDD = (int)(Math.random()*11);
		int notaPR1 = (int)(Math.random()*11);
		alumnos = new Alumno[30];
		int numCodigo = 0;
		
		for(int i = 1; i<=30; i++) {
			
			String codigo = "DAW" + (i-1);
			
			numCodigo = numCodigo + 1;
			
			alumno = new Alumno(codigo, notaBBDD, notaPR1, i-1);
			alumnos[i-1] = alumno; 
			notaBBDD = (int)(Math.random()*11);
			notaPR1 = (int)(Math.random()*11);
			
		}
		
		
	}
	
	
	public void ordenarID() {
		
		ComparadorAlumnos id = new ComparadorAlumnos(ComparadorAlumnos.POR_ID);
		Arrays.sort(alumnos, id);
		
	}
	
	public void ordenarNotaPR1() {
		
		ComparadorAlumnos notaPR1 = new ComparadorAlumnos(ComparadorAlumnos.POR_NOTAPR1);
		Arrays.sort(alumnos, notaPR1);
	}
	
	public void ordenarNotaBBDD1() {
		
		ComparadorAlumnos notaBBDD1 = new ComparadorAlumnos(ComparadorAlumnos.POR_NOTABBDD1);
		Arrays.sort(alumnos, notaBBDD1);
	}


	@Override
	public String toString() {
		
		String salida = "[ Aula ";
		
		salida += Arrays.toString(alumnos) +" ]";
		
		return salida;
	}
	
	
	
}
