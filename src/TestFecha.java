import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestFecha {

	public static void main(String[] args) throws IOException {
		int dia, mes, ano;
		System.out.println("Introduce un día: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		dia = Integer.parseInt(entrada.readLine());
		System.out.println("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.println("Introduce un año: ");
		ano = Integer.parseInt(entrada.readLine());
		Fecha f1 = new Fecha(dia, mes, ano);
		if (f1.valida())
			System.out.println("La fecha: " + dia + "/" + mes + "/" + ano + " es válida");
		else
			System.out.println("La fecha: " + dia + "/" + mes + "/" + ano + "NO es válida");
	}
}
