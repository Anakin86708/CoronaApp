/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testClasses;

import coronaapp.EquipeMedica;
import coronaapp.Paciente;
import coronaapp.Sintomas;
import coronaapp.View.Login;

/**
 *
 * @author silva
 */
public class CreateDefaultObjects {

    public static void main(String[] args) {

        // Chama o form de login
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        Sintomas sintomas1 = new Sintomas();
        sintomas1.addSintoma(new String[]{"Febre", "Tosse"});
        final Paciente paciente1 = new Paciente("Estável", sintomas1, 0, "Ariel", "silva@gmail.com", "111.111.111-11", "(011)12237-6058", 0, "Itália", "Limeira", "São Paulo", "Brasil", "1234");
        
        Sintomas sintomas2 = new Sintomas();
        sintomas2.addSintoma(new String[] {"Febre","Dificuldade em respirar", "Dor de garganta", "Cansaço"});
        final Paciente paciente2 = new Paciente("Perigo", sintomas2, 1, "Carlos", "carlinho25@yahoo.com", "456.843.258-02", "(012)99919-8478", 4, "Jd. Cristovão", "Paulínia", "São Paulo", "Brasil", "Dog10");
        
        Sintomas sintomas3 = new Sintomas();
        sintomas3.addSintoma(new String[] {"Febre", "Dificuldade em respirar", "Tosse", "Dor de garganta", "Cansaço", "Falta de ar", "Dor no corpo"});
        final Paciente paciente3 = new Paciente("Crítico",sintomas3, 2,"Mary","matJ007@icloud.com", "743.646.358-01", "(001)00335-5568",17,"Califórnia","Rio de Janeiro","Rio de Janeiro","Brasi","Mary");
        
        Login.pacientesInstanciados.add(paciente1);
        Login.pacientesInstanciados.add(paciente2);
        Login.pacientesInstanciados.add(paciente3);
        
        final EquipeMedica equipeMedica = new EquipeMedica("HC009445", 0, "Gisele", "giseleC@hc.unicamp.br", "123.456.789-00", "(019)99983-7765", 0, "Swift", "Campinas", "São Paulo", "Brasil", "1234");
        Login.equipeMedicasInstanciados.add(equipeMedica);
    }

}
