public class Teclado extends Componente {

    private String modelo;

    public Teclado(String nome, String modelo) {
        super(nome);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getComponente() {
        return "Teclado: " + this.getNome() + " - modelo: " + this.modelo + "\n";
    }

}