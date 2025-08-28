public class Avo extends Pessoa {
    private int anosAposentado;

    public Avo(String nome, int idade, int anosAposentado) {
        super(nome, idade);
        this.anosAposentado = anosAposentado;
    }

    public int anosAposentado() {
        return this.anosAposentado;
    }

    public void setAnosAposentado(int anosAposentado) {
        this.anosAposentado = anosAposentado;
    }

    @Override
    public String getTipoVoz() {
        return "Voz avô";
    }

}