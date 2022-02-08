public class livro implements publicacao{
    private String titulo, autor;
    private int totPags, pagAtual;
    private boolean aberto;
    private pessoa leitor;

    public String detalhes() {
        return "livro [aberto=" + aberto + "\n, autor=" + autor + "\n, leitor=" + leitor.getNome() + "\n, pagAtual=" + pagAtual
                + ", titulo=" + titulo + "\n, totPags=" + totPags + "]";
    }

    public livro(String titulo, String autor, int totPags, pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPags = totPags;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPags() {
        return totPags;
    }

    public void setTotPags(int totPags) {
        this.totPags = totPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(pessoa leitor) {
        this.leitor = leitor;
    }

    public void abrir() {
        this.aberto = true;
    }
    public void fechar() {
        this.aberto = false;
    }
    public void folhear(int p) {
        this.pagAtual = p;
    }
    public void avancarpag() {
        this.pagAtual++;

    }
    public void voltarpag() {
        this.pagAtual--;
    }

    
    
}
