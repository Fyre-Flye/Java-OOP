public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status = false;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //Metodos

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);

        if(tipo == "CC"){ 
            setSaldo(50.0f);;
        } else if(tipo == "CP"){
            setSaldo(150.0f);
        }

    }

    public void fecharConta() {
        if(this.saldo > 0 && this.status == true){
            setStatus(false);
        } else {
            System.out.println("ERRO! conta em débito ou já está desativada. ");
        }
    }

    public void depositar(float d) {
        if(this.status == true) {
            setSaldo(getSaldo()+d);;
        } else {
            System.out.println("Impossível, Conta desativada ");
        }
    }

    public void sacar(float sq) {
        if(getStatus() && getSaldo() > 0){
            setSaldo(getSaldo()-sq);
        } else {
            System.out.println("ERRO! Saldo insuficiente ou conta desativada");
        }
    }

    public void pagarMensal() {
        float v;
        if(getTipo() == "CC") {
            v = 12;
        } else if(getTipo() == "CP"){
            v = 20;
        }
        
        if(getStatus()) {
            if(saldo > v){
                setSaldo(getSaldo()-v);
            } else {
                System.out.println("Saldo insuficiente ");
            }
        } else {
            System.out.print("Impossível pagar");
        }
    }

    // Metodos especiais 

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int nc){
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tc){
        this.tipo = tc;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;        
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    } 

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean tc){
        this.status = tc;
    }

}
