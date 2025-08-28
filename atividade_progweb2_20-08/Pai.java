public class Pai extends Pessoa {
    private String emprego;

    public Pai (String nome, int idade, String emprego) {
        super(nome, idade);
        this.emprego = emprego;
    }

    public String getEmprego() {
        return this.emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    @Override
    public String getTipoVoz() {
        return "Voz pai";
    }    
}
