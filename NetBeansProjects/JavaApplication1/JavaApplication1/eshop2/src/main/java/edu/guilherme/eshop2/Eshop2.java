/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.guilherme.eshop2;

import Produto.Produto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guilherme
 */
public class Eshop2 {

    public static void main(String[] args) throws IOException {
        
InputStreamReader isr = 
        new InputStreamReader(System.in);
BufferedReader reader = 
        new BufferedReader(isr);
  int  qtd;
  qtd = Integer.parseInt(reader.readLine()); 

  
  
        Produto mouse = new Produto("050609");
        mouse.setPreco((float) 35.00);
        mouse.setNome("mouse");
        mouse.setSaldo((float) 5);
        
        System.out.println(
            "Venda: "
          + mouse.getSku() + " \n" + mouse.getNome() +" "
          + mouse.getPreco() + "x "+qtd+" = "
          + (qtd*mouse.getPreco())          
        );
        System.out.println();
    }
}
