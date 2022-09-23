package analise;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int menu;
		menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha a sua opção:\n" + "1 - Adição\n" + "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão"));
			switch (menu){
				case 1 : modAdicao();
				 break;
				case 2 : modSubtr();
				 break;
				case 3 : modMultipl(); 
				 break;
				case 4 : modDiv();
				 break;
			default : JOptionPane.showMessageDialog(null, "Fim do Programa");
		}
	}

		static void modAdicao(){
			double v1;
			double v2;
			double res;
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
			 res = v1 + v2;
			JOptionPane.showMessageDialog(null, "Soma = " + res);
			}
		
		static void modSubtr(){
			double v1;
			double v2;
			double res;
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
			 res = v1 - v2;
			JOptionPane.showMessageDialog(null, "Subtração = " + res);
			}
		
		static void modMultipl(){
			double v1;
			double v2;
			double res;
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
			 res = v1 * v2;
			JOptionPane.showMessageDialog( null, "Multiplicação = " + res);
			}

		static void modDiv(){
			double v1;
			double v2;
			double res;
			   v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				 while(v1 == 0) {
					 v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor que não seja zero: "));
				 } 
			   v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
				 while(v2 == 0) {
					 v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor que não seja zero: "));
				 } 

			 res = v1 / v2;
			JOptionPane.showMessageDialog(null, "Divisão = " + res);
			}
}package analise;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int menu;
		menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha a sua opção:\n" + "1 - Adição\n" + "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão"));
			switch (menu){
				case 1 : modAdicao();
				 break;
				case 2 : modSubtr();
				 break;
				case 3 : modMultipl(); 
				 break;
				case 4 : modDiv();
				 break;
			default : JOptionPane.showMessageDialog(null, "Fim do Programa");
		}
	}

		static void modAdicao(){
			double v1;
			double v2;
			double res;
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
			 res = v1 + v2;
			JOptionPane.showMessageDialog(null, "Soma = " + res);
			}
		
		static void modSubtr(){
			double v1;
			double v2;
			double res;
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
			 res = v1 - v2;
			JOptionPane.showMessageDialog(null, "Subtração = " + res);
			}
		
		static void modMultipl(){
			double v1;
			double v2;
			double res;
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
			 res = v1 * v2;
			JOptionPane.showMessageDialog( null, "Multiplicação = " + res);
			}

		static void modDiv(){
			double v1;
			double v2;
			double res;
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
				 if(v1 == 0) {
					 v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor que não seja zero: "));
				 } 
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
				 if(v2 == 0) {
					 v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor que não seja zero: "));
				 } 

			 res = v1 / v2;
			JOptionPane.showMessageDialog(null, "Divisão = " + res);
			}
}