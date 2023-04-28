public class Gabinete{


    private Componente descricao;

    public void setDescricao(Componente descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        if (this.descricao == null) {
            throw new NullPointerException("Gabinete sem descrição");
        }
        return this.descricao.getComponente();
    }
}
