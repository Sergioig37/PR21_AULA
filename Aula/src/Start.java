
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un aula
		Aula daw1 = new Aula();
		System.out.println(daw1);
		
		//ordena los datos por el criterio de la ID e imprime
		daw1.ordenarID();
		System.out.println(daw1);
		
		//ordena los datos por el criterio de la nota PR1 e imprime
		daw1.ordenarNotaPR1();
		System.out.println(daw1);
		
		//ordena los datos por el criterio de la nota BBDD1 e imprime
		daw1.ordenarNotaBBDD1();
		System.out.println(daw1);
	}

}
