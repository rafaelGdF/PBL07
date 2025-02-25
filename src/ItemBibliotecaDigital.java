public abstract class ItemBibliotecaDigital {
    protected String titulo;
    protected String autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String descricao();
}

// Interface Baixavel
interface Baixavel {
    void baixar();
}

// Interface Visualizavel
interface Visualizavel {
    void visualizar();
}
