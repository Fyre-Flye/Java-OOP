public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    //Metodos publicos

    public void apresentar() {
        System.out.println("---------------------------------------");
        System.out.println("Chegou a hora! apresentamos o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e "+this.getAltura()+" metros");
        System.out.println("Pesando "+this.getPeso()+" Kg ");
        System.out.println(this.getVitorias()+" Vitórias ");
        System.out.println(this.getDerrotas()+" Derotas e");
        System.out.println(this.getEmpates()+" Empates");
        
    }
    
    public void status() {
        System.out.println(this.getNome()+" é um peso "+getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+ " vezes");
        System.out.println("Perdeu "+this.getDerrotas()+ " vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getVitorias()+1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria =  "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    //Metodos espeicais
     
    public Lutador(String no, String na, int id, int vi, int de, int em, float al,
    float pe) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;
        this.peso = pe;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
}
