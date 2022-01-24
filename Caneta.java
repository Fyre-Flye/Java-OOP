public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private int carga;
    private boolean tampada;

    public Caneta(String m, String c, float p) { // metodo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }

    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void rabiscar () {
        if(this.tampada == true) {
            System.out.println("A caneta esta tampada! nao pode escrever");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }

}