public class Tres {
	private static int metodo() {
		int valor = 0;
		try {
			valor++;//1
			valor = valor + Integer.parseInt("WW");//ROMPE Y ENTRA A EL CATCH
			valor++;
			System.out.println("Valor al final del try : " + valor);
		} catch (NumberFormatException e) {
			valor = valor + Integer.parseInt("42");//43
			System.out.println("Valor al final del catch : " + valor);//43
		} finally {
			valor++;//44
			System.out.println("Valor al final de finally : " + valor);//44
		}
		valor++;//45
		System.out.println("Valor antes del return : " + valor);//45
		return valor;//45
	}

	public static void main(String[] args) {
		try {
			System.out.println(metodo());//45
		} catch (Exception e) {
			System.err.println("Excepcion en metodo ()");
			e.printStackTrace();
		}
	}
}
