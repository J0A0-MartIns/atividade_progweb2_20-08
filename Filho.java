public class Filho extends Pessoa {
    private int anoEscola;

    public Filho (String nome, int idade, int anoEscola) {
        super(nome, idade);
        this.anoEscola = anoEscola;
    }

    public int getAnoEscola() {
        return this.anoEscola;
    }

    public void setAnoEscola(int anoEscola) {
        this.anoEscola = anoEscola;
    }

    @Override
    public String getTipoVoz() {
        return "Voz filho";
    }   
}
