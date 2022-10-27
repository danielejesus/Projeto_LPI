/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.ArrayList;
import Control.Carro;

/**
 *
 * @author FATEC
 */
public class ControlaCarro {
    private ArrayList<Carro> carro = new ArrayList<>();
    
    public boolean salvar (Carro c){
        if (c != null){
            carro.add(c);
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Carro> retornarTodos () {
        return carro;
    }

    public boolean salvar(tela_cadastro.Carro carro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<tela_cadastro.Carro> retornaTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
