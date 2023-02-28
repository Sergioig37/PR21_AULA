
public class Alumno {

	private int numeroIdentificador;
	private String id;
	private int notaBBDD1;
	private int notaPR1;
	
	
	
	public Alumno(String id,int notaBB1DD1, int notaPR1, int numeroIdentificador ) {
		
		this.numeroIdentificador = numeroIdentificador;
		this.id = id;
		this.notaBBDD1 = notaBB1DD1;
		this.notaPR1 = notaPR1;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getNotaBBDD1() {
		return notaBBDD1;
	}


	public void setNotaBBDD1(int notaBBDD1) {
		this.notaBBDD1 = notaBBDD1;
	}


	public int getNotaPR1() {
		return notaPR1;
	}


	public void setNotaPR1(int notaPR1) {
		this.notaPR1 = notaPR1;
	}

	public int getNumeroIdentificador() {
		
		return numeroIdentificador;
	}
	@Override
	public String toString() {
		return "[Id Alumno= " + id + ", notaBBDD1= " + notaBBDD1 + ", notaPR1= " + notaPR1 + "]";
	}
	
	
	
}
