/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaapp;
import coronaapp.View.*;

/**
 *
 * @author ariel
 */
public class CoronaApp {
    
    public static final String[] sintomasGerais = {"Febre", "Dificuldade em respirar", "Tosse", "Dor de garganta", "Cansaço", "Falta de ar", "Dor no corpo"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chama o form de login
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
