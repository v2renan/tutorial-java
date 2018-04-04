/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;
import java.util.Scanner;
        
public class CompraLojaoP2 {
    public static void main(String args[]){
        int qntd;
        Scanner in = new Scanner(System.in);
        System.out.println("--- Bem vindo ao lojão P2 ---");
        System.out.print("Digite a quantidade de produtos diferentes que será comprada: ");
        qntd = in.nextInt();
        in.nextLine();
        System.out.println("­­ Cadastro de Produtos ­­");
        String prod[] = new String[qntd];
        int qntp[] = new int[qntd];
        int total = 0;
        for(int i =0; i < qntd;i++){
        
            
            System.out.printf("Nome do produto %d:", i+1);
            prod[i] = in.nextLine();
            System.out.printf("Quantidade de %s:", prod[i]);
            qntp[i] = in.nextInt();
            in.nextLine();       
            total += qntp[i];
              }
        System.out.println("­­ Cadastro Concluído ­­");
        System.out.println("A sua compra foi:");
        
        for(int l = 0; l < qntd; l++){
        System.out.println(qntp[l] + " " + prod[l]);
     
    }
        System.out.printf("Total de produtos: %d \n", total);
        double precoTotal = total*1.99;
        System.out.printf("Total gasto: R$%2.2f \n", precoTotal);
        System.out.println("­­ Fim da execução ­­");
        
    }
}
    
