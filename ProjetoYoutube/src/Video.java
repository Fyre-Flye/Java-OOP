public class Video implements AcoesVideo{
    private String titulo;
    private int avalicao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Constructor

    public Video(String titulo, int avalicao, int views, int curtidas, boolean reproduzindo) {
        this.titulo = titulo;
        this.avalicao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //Gets and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        int nova;
        nova = (this.avalicao+avalicao)/this.views;
        this.avalicao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //Métodos da interface

    @Override
    public void play() {
        this.reproduzindo = true;
        
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        
    }

    @Override
    public void like() {
        this.curtidas++;
        
    }

    @Override
    public String toString() {
        return "Video [avalicao=" + avalicao + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + ", titulo="
                + titulo + ", views=" + views + "]";
    }
    
}
