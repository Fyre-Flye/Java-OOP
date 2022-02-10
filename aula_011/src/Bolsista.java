public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("É bolsista ");
    }
}
