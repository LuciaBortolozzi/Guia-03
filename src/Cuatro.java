import java.io.IOException;

public class Cuatro {
	private static int metodo() {
		int valor = 0;
		try {
			valor++;//1
			valor = valor + Integer.parseInt("ww"); //ROMPE Y NO ENTRA A EL CATCH
			valor++;
			System.out.println("Valor al final del try : " + valor);
			throw new IOException(); //NumberFormatException
		} catch (IOException e) { //NumberFormatException
			valor = valor + Integer.parseInt("42");
			System.out.println("Valor al final del catch : " + valor);
		} finally {
			valor++;//2
			System.out.println("Valor al final de finally : " + valor);//2
		}
		valor++;
		System.out.println("Valor antes del return : " + valor);
		return valor;
	}

	public static void main(String[] args) {
		try {
			System.out.println(metodo());
		} catch (Exception e) {
			System.err.println("Excepcion en metodo () ");
			e.printStackTrace();
		}
	}
}
