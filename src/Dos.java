public class Dos {
	private static int metodo() {
		int valor = 0;
		try {
			valor++; //1
			valor = valor + Integer.parseInt("W"); //ROMPE Y VA A EL CATCH
			valor++;
			System.out.println("Valor al final del try : " + valor);
		} catch (NumberFormatException e) {
			valor = valor + Integer.parseInt("WW"); //ROMPE
			System.out.println("Valor al final del catch : " + valor);
		} finally {
			valor++; //2
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
			System.err.println("Excepcion en metodo () "); //entra en este CATCH
			e.printStackTrace();
		}
	}
}
