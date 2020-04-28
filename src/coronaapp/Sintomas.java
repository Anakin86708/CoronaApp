package coronaapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sintomas {

    private List<String> sintomasApresentados;
    private float gravidade;

    public Sintomas() {
        this.sintomasApresentados = new ArrayList<>();
    }

    public List<String> getSintomasApresentadosList() {
        return sintomasApresentados;
    }

    public void addSintoma(String new_sintoma) {
        if (!sintomasApresentados.contains(new_sintoma)) {
            sintomasApresentados.add(new_sintoma);
            calculaSintoma();
        }
    }

    public void addSintoma(String[] new_sintoma) {
        clearSintomas();
        sintomasApresentados.addAll(Arrays.asList(new_sintoma));
        calculaSintoma();
    }

    public void clearSintomas() {
        sintomasApresentados = new ArrayList<>();
    }

    public float getGravidade() {
        calculaSintoma();
        return gravidade;
    }

    private void calculaSintoma(){
        float total = new CoronaApp().sintomasGerais.length;
        float possui = sintomasApresentados.size();
        
        gravidade = (float) (possui/total) * 100;
    }
    
    public String[] getSintomasApresentadosArray(){
        return (String[]) sintomasApresentados.toArray();
    }
}
