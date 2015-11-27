/* Calculo IMC 
criado por Raphael Santana Carvalho */  
  
import java.util.Scanner; // classe Scanner    
import javax.swing.JOptionPane; // classe JOptionPane  
  
public class Calculo_IMC  
{  
    public static void main(String args[])  
    {  
        int sexo, nome_sexo;  
        double peso, altura, calcular_IMC;  
        double h_imc[] = {20.7, 26.4};  
        double m_imc[] = {19.1, 25.8};  
        String h_resultado = ("\n\n Abaixo do peso: Menor que 20,7. \n Peso ideal: Maior que 20,7 e Menor que 26,4. \n Acima do peso: 26,4.\n"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
        String m_resultado = ("\n\n Abaixo do peso: Menor que 19,1. \n Peso ideal: Maior que 19,1 e Menor que 25,8. \n Acima do peso: 25,8.\n"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
          
        String message = ("Bem vindo ao programa para Calcúlo de IMC! \n (Versão 1.0) \n\n Criado por Raphael Santana Carvalho."<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
        JOptionPane.showMessageDialog(null, message);  
  
        Scanner input = new Scanner(System.in);  
  
        System.out.print("Qual é o seu sexo: masculino ou feminino? \n Para masculino digite [1]. \n Para feminino digite [2]. \n"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;         
        sexo = input.nextInt(); // salva na váriavel sexo.  
        nome_sexo = sexo;  
              
        if (nome_sexo == 1)  
        {  
            System.out.print("- O seu sexo é: masculino!"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
        }  
  
        if (nome_sexo == 2)  
        {  
            System.out.print("- O seu sexo é: feminino!"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
        }  
  
        System.out.print("\n\n Qual é o seu peso [Exemplo: 60,5]?\n"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;       
        peso = input.nextDouble(); // salva na váriavel peso.  
        System.out.printf("- O seu peso é: %6.1f kilogramas!", peso);  
  
        System.out.print("\n\n Qual é a sua altura [Exemplo: 1,70]?\n"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;         
        altura = input.nextDouble(); // salva na váriavel altura.  
        System.out.printf("- A sua altura é: %6.2f metros!", altura);  
  
        calcular_IMC = peso / ((altura)*(altura)); // calcula o valor do IMC  
  
        if (sexo == 1)  
        {  
            if (calcular_IMC < h_imc[0])  
            {  
                System.out.print("\n\n Resultado IMC (Masculino):"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
                System.out.printf("\n- O seu IMC é: %6.1f. Você está abaixo do peso!", calcular_IMC);  
                System.out.print(h_resultado);  
            }  
  
            if ((calcular_IMC > h_imc[0]) && (calcular_IMC < h_imc[1]))  
            {  
                System.out.print("\n\n Resultado IMC (Masculino):"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
                System.out.printf("\n- O seu IMC é: %6.1f. Você está no peso ideal!", calcular_IMC);  
                System.out.print(h_resultado);  
            }  
  
            if (calcular_IMC > h_imc[1])  
            {  
                System.out.print("\n\n Resultado IMC (Masculino):"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
                System.out.printf("\n- O seu IMC é: %6.1f. Você está acima do peso!", calcular_IMC);  
                System.out.print(h_resultado);  
            }  
        }  
  
        if (sexo == 2)  
        {  
            if (calcular_IMC < m_imc[0])  
            {  
                System.out.print("\n\n Resultado IMC (Feminino):"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
                System.out.printf("\n- O seu IMC é: %6.1f. Você está abaixo do peso!", calcular_IMC);  
                System.out.print(m_resultado);  
            }  
  
            if ((calcular_IMC > m_imc[0]) && (calcular_IMC < m_imc[1]))     
            {     
                System.out.print("\n\n Resultado IMC (Feminino):"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;      
                System.out.printf("\n- O seu IMC é: %6.1f. Você está no peso ideal!", calcular_IMC);  
                System.out.print(m_resultado);  
            }  
  
            if (calcular_IMC > m_imc[1])  
            {  
                System.out.print("\n\n Resultado IMC (Feminino):"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
                System.out.printf("\n- O seu IMC é: %6.1f. Você está acima do peso!", calcular_IMC);  
                System.out.print(m_resultado);  
            }  
        }     
        }  
} // fim da classe Calculo_IMC  
[/code]
