public class ContaBanco {
    //Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status = false;

    // Construtor

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //Métodos

    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if(t == "CC"){ 
            this.setSaldo(50.0f);
        } else if(t == "CP"){
            this.setSaldo(150.0f);
        }
        System.out.println("Conta aberta com sucesso! ");
    }

    public void fecharConta() {
        if(this.saldo > 0){
            System.out.println("ERRO! a conta ainda possui saldo ");
        } else {
            this.setStatus(false);
            System.out.println("Conta "+this.getNumConta()+" desativada com sucesso ");
        } if (this.status == false) {
            System.out.println("ERRO! conta desativada");
        } else if(this.saldo > 0){
            this.setStatus(false);
            System.out.println("Conta "+this.getNumConta()+" desativada com sucesso ");
        }
    }

    public void depositar(float d) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo()+d);;
            System.out.println("Deposito de "+d+"R$ realizado com sucesso na conta de "+this.getDono());
        } else {
            System.out.println("Impossível, Conta desativada ");
        }
    }

    public void sacar(float sq) {
        if(this.getStatus()) {
            if(sq > this.getSaldo()) {
                System.out.println("Impossivel sacar, saldo insuficiente ");
            } else {
                this.setSaldo(this.getSaldo()-sq);
                System.out.println("Saque de "+sq+" realizado com sucesso na conta de "+getDono());
            }
        } else {
            System.out.println("Erro, conta desativada ");
        } 
        if (this.getSaldo() > 0) {
            this.setSaldo(this.getSaldo()-sq);
        } else {
            System.out.println("Saldo insuficiente ");
        }
    }

    public void pagarMensal() {
        float v = 0;

        if(this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        
        if(this.getStatus()) {
            if(saldo > v){
                this.setSaldo(this.getSaldo()-v);
            } else {
                System.out.println("Saldo insuficiente ");
            }
        } else {
            System.out.print("Impossível pagar, conta desativada ");
        }
        System.out.println("Mensalidade de "+this.getDono()+" paga com sucesso. ");
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
