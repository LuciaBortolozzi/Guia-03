public class Uno {

	private static int metodo() {
		int valor = 0;
		try {
			valor++;
			valor = valor + Integer.parseInt("42");
			valor++;
			System.out.println("Valor al final del try : " + valor); //44
		} catch (NumberFormatException e) {
			valor = valor + Integer.parseInt("42");
			System.out.println("Valor al final del catch : " + valor);
		} finally {
			valor++;
			System.out.println("Valor al final de finally : " + valor);//45
		}
		valor++;
		System.out.println("Valor antes del return : " + valor);//46
		return valor; //46
	}

	public static void main(String[] args) {
		try {
			System.out.println(metodo()); //46
		} catch (Exception e) {
			System.err.println("Excepcion en metodo ()");
			e.printStackTrace();
		}
	}
}
