public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.printf("Modelo: "+ this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? "+ this.tampada);
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