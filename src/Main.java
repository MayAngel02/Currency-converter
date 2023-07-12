import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Este cuadro de dialogo debe permitir al usuario escoger entre las opciones de
		 * conversión, según los requisitos solo es necesario hacer un conversor de
		 * moneda pero en caso que desees implementar otras funciones en la foto anexada
		 * podemos ver una opción de menú con otras funciones.
		 * 
		 * Utilice la clase JOptionPane de la biblioteca Javax; Utilice el método
		 * showInputDialog como un objeto para presentar más de una opción;
		 */
		int optionSelect = 0;
		do {
			Object seleccion = JOptionPane.showInputDialog(null, "Seleccione opcion", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null, // null para icono defecto
					new Object[] { "Conversor de moneda", "conversor de temperatura", }, "Seleccione");

			if (seleccion.toString().equals("Conversor de moneda")) {
				double numero = 0;
				boolean esDouble = false;
				double resultado = 0.0;
				do {
					String numeroCadena = JOptionPane.showInputDialog("Ingrese la cantidad que quiera convertir");
					try {
						numero = Double.parseDouble(numeroCadena);
						esDouble = true;
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "alert", "valor no valido", JOptionPane.ERROR_MESSAGE);
					}
				} while (!esDouble);

				Object seleccionMoneda = JOptionPane.showInputDialog(null, "Seleccione opcion", "Selector de opciones",
						JOptionPane.QUESTION_MESSAGE, null, // null para icono defecto
						new Object[] { "De pesos a dolar", "De pesos a Euro", "De pesos a Libra", "De pesos a yen",
								"De pesos a Won Koreano", "", "De dolar a pesos", "De Euro a pesos", "De Libra a pesos",
								"De yen a pesos", "De Won Koreano a pesos", },
						"Seleccione");
				switch (seleccionMoneda.toString()) {
				case "De pesos a dolar":
					resultado = numero * 17.5;
					break;

				case "De pesos a Euro":
					resultado = numero * 0.059;
					break;
				case "De pesos a Libra":
					resultado = numero * 0.046;
					break;
				case "De pesos a yen":
					resultado = numero * 8.47;
					break;
				case "De pesos a Won Koreano":
					resultado = numero * 76.29;
					break;

				case "De Euro a pesos":
					resultado = numero / 18.62;
					break;
				case "De Libra a pesos":
					resultado = numero / 21.65;
					break;
				case "De yen a pesos":
					resultado = numero / 0.12;
					break;
				case "De Won Koreano a pesos":
					resultado = numero / 0.013;

					break;
				}

				Object[] options = { "OK" };
				JOptionPane.showOptionDialog(null, "el reultado es $" + resultado, "Mensaje",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

				System.out.println(seleccion);
			} else if (seleccion.toString().equals("conversor de temperatura")) {
				double numero = 0;
				boolean esDouble = false;
				double resultado = 0.0;
				do {
					String numeroCadena = JOptionPane.showInputDialog("Ingrese los grados a convertir");
					try {
						numero = Double.parseDouble(numeroCadena);
						esDouble = true;
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "alert", "valor no valido", JOptionPane.ERROR_MESSAGE);
					}
				} while (!esDouble);
				Object seleccionGrados = JOptionPane.showInputDialog(null, "Seleccione opcion", "Selector de opciones",
						JOptionPane.QUESTION_MESSAGE, null, // null para icono defecto
						new Object[] { "De Celcius a Farenheit", "De Celcius a Kelvin", "De Farenheit a celcius",
								"De farenheit a kelvin", "De Kelvin a Farenheit", "De kelvin a Celcius", },
						"Seleccione");
				switch (seleccionGrados.toString()) {
				case "De Celcius a Farenheit":
					resultado = (numero * 1.8) + 32;

					break;
				case "De Celcius a Kelvin":
					resultado = numero + 273.15;
					break;
				case "De Farenheit a celcius":
					resultado = numero - 32 / 1.8;
					break;
				case "De farenheit a kelvin":
					resultado = (5 / 9) * (numero - 32) + 273.15;
					break;
				case "De Kelvin a Farenheit":
					resultado = 1.8 * (numero - 273.15) + 32;
					break;
				case "De kelvin a Celcius":
					resultado = numero - 273.15;
					break;
				}
				Object[] options = { "OK" };
				JOptionPane.showOptionDialog(null, "El resultado es " + resultado + "°", "Mensaje",
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

			}

			Object[] options = { "Yes", "No", "Calcel" };

			optionSelect = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Seleccionar opción",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		} while (optionSelect == JOptionPane.YES_OPTION);
		Object[] options = { "OK" };
		JOptionPane.showOptionDialog(null, "Programa Finalizado", "Mensaje", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);

	}
}
