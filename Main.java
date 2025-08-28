public class Main {
    public static void main(String[] args) {
        Filho filho = new Filho("João", 10, 5);
        Pai pai = new Pai("Carlos", 40, "Professor");
        Avo avo = new Avo("Antônio", 70, 20);

        System.out.println("===== FILHO =====");
        Reflexao.listarAtributos(filho);
        Reflexao.listarMetodos(filho);
        System.out.printf(filho.getTipoVoz());

        System.out.println("\n===== PAI =====");
        Reflexao.listarAtributos(pai);
        Reflexao.listarMetodos(pai);
        System.out.printf(pai.getTipoVoz());

        System.out.println("\n===== AVÔ =====");
        Reflexao.listarAtributos(avo);
        Reflexao.listarMetodos(avo);
        System.out.printf(avo.getTipoVoz());
    }
}