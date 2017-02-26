
public class Fecha {
	private int dia;
	private int mes;
	private int ano;

	public Fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	private boolean bisiesto ( ) {
		if ( (ano % 400 == 0) || ( (ano % 4 == 0) && (ano % 100 != 0) ) )
		return true;
		else return false;
		}


	private int diasMes() {
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2:
			if ( bisiesto() )
				diasMes = 29;
				else
				diasMes = 28;
				break;

		}
		return diasMes;
	}

	

	public boolean valida() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;
		if (ano < 0)
			return false;
		if (dia > diasMes())
			return false;
		else
			return true;
	}
}
