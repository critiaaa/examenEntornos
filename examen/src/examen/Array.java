package examen;

import java.util.Arrays;

/**
 * 
 * @author Cristian
 * @version 1.0
 */
public class Array {

	private int Array [] = {5,1,22,9,12,6,4,8,15,21,18,17,2,16};

	public Array() {
	
	}

	/**
	 * método que sobrescribe el ToString de la clase Object
	 */
	@Override
	public String toString() {
		return "Array [Array=" + Arrays.toString(Array) + "]";
	}
	
	/**
	 * 
	 * @param x int
	 * @return devuelve true si lo encontramo y false si no lo encontramos
	 */
	public boolean busquedalinal (int x) {
		boolean encontrado = false;
		
		for (int i = 0 ; i < this.Array.length ; i++) {
			if (this.Array[i] ==  x) {
				encontrado =true;
			}
		}
		return encontrado;
	}
	
	public void sumar1EnArray () {
		for (int i = 0 ; i < this.Array.length ; i++) {
			this.Array[i]++;
		}
	}
	
}
