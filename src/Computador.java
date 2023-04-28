
import java.util.ArrayList;
import java.util.List;

public class Computador extends Componente {

    private List<Componente> componentes;

    public Computador(String nome) {
        super(nome);
        this.componentes = new ArrayList<>();
    }

    public void addComponente(Componente conteudo) {
        this.componentes.add(conteudo);
    }

    public String getComponente() {
        String saida = "";
        saida = "Computador: " + this.getNome() + "\n";
        for (Componente componente : componentes) {
            saida += componente.getComponente();
        }
        return saida;
    }
}