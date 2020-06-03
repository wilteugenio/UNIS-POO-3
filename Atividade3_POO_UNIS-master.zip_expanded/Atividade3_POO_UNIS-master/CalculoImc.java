package Calculador;

import javax.swing.JOptionPane;

public class Calculador {

    public static void main(String[] args) {
        
        double peso, altura, imc;
        String InfoPeso, InfoAltura;
        
        InfoPeso = JOptionPane.showInputDialog("Digite peso em kg: ");
        peso = Integer.parseInt(InfoPeso);
        InfoAltura = JOptionPane.showInputDialog("Digite altura em cm: ");
        altura = Integer.parseInt(InfoAltura);
        
        imc = peso / ((altura / 100) * (altura / 100));
        
        if (imc <= 17){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    imc) + "Paciente Muito abaixo do peso");            
        }else 
        	if ((imc > 17) && (imc < 18.49)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    imc) + "Paciente Abaixo do peso");        
        }else 
        	if ((imc > 18.50) && (imc < 24.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    imc) + "Paciente: Peso normal"); 
        }else 
        	if ((imc > 25) && (imc < 29.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    imc) + "Paciente Acima do peso");
        }else 
        	if ((imc > 30) && (imc < 34.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    imc) + "Paciente se encontra em  Obesidade I");
        }else 
        	if ((imc > 35) && (imc < 39.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    imc) + "Paciente se encontra em Obesidade II [severa]");
        }else{
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    imc) + "Paciente se encontra em Obesidade III [mórbida]");
        }               
    }
}
