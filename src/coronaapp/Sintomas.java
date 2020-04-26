package coronaapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sintomas {

    private List<String> sintomasApresentados;
    private String gravidade;

    public Sintomas() {
        this.sintomasApresentados = new ArrayList<>();
    }

    public List<String> getSintomasApresentados() {
        return sintomasApresentados;
    }

    public void addSintoma(String new_sintoma) {
        if (!sintomasApresentados.contains(new_sintoma)) {
            sintomasApresentados.add(new_sintoma);
        }
    }

    public void addSintoma(String[] new_sintoma) {
        clearSintomas();
        sintomasApresentados.addAll(Arrays.asList(new_sintoma));
    }

    public void clearSintomas() {
        sintomasApresentados = new ArrayList<>();
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
}
