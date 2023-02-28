import java.util.Comparator;

public class ComparadorAlumnos implements Comparator <Alumno>{

	private int metodoComparador;
	private int ordenarComparador;
	public static final int ASCENDENTE = 1;
	public static final int DESCENDENTE = 2;
	public static final int POR_ID = 1;
	public static final int POR_NOTABBDD1 = 2;
	public static final int POR_NOTAPR1 = 3;
	
	
	
	public ComparadorAlumnos(int metodoComparador) {
		
		this.metodoComparador = metodoComparador;
		
		ordenarComparador = DESCENDENTE;
	}
	
	public void cambiarOrden(int ordenar) {
		
		this.ordenarComparador = ordenar;
	}
	
	
	@Override
	public int compare(Alumno a1, Alumno a2) {
		
		int devolver = 0;
		
		switch(metodoComparador) {
		
		case(POR_ID):
			if(ordenarComparador==ASCENDENTE) {
				devolver = a1.getNumeroIdentificador()-a2.getNumeroIdentificador();
			}
			else {
				devolver = a2.getNumeroIdentificador()-a1.getNumeroIdentificador();
			}
			break;
		case(POR_NOTABBDD1):
			if(ordenarComparador==ASCENDENTE) {
				devolver = a1.getNotaBBDD1()-a2.getNotaBBDD1();
			}
			else {
				devolver = a2.getNotaBBDD1()-a1.getNotaBBDD1();
			}
			break;
		case(POR_NOTAPR1):
			if(ordenarComparador==ASCENDENTE) {
				devolver = a1.getNotaPR1()-a2.getNotaPR1();
			}
			else {
				devolver = a2.getNotaPR1()-a1.getNotaPR1();
			}
			break;
		
		}
		
		return devolver;
	}

}
