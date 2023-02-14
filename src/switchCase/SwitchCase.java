package switchCase;

import javax.swing.JOptionPane;

public class SwitchCase {
	public static void main(String[] args) {
		int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de mes que desea "));
		switch (mes) {
		case 1:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de ENERO");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de FEBRERO");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de MARZO");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de ABRIL");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de MAYO");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de JUNIO");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de JULIO");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de AGOSTO");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de SEPTIEMBRE");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de 0CTUBRE");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de NOVIEMBRE");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "El numero esta relacionado con el mes de DICIEMBRE");
			break;
		default :
			JOptionPane.showMessageDialog(null, "El numero ingresado es incorrecto");
			break;
			
		}
		
	}
}
