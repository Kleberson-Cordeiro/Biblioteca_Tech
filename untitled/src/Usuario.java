public class Usuario {
    private String nome;
    private Livro livroreservado;


    public Usuario (String nome, Livro livroreservado) {
        this.nome = nome;
        this.livroreservado = null;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroreservado() {
        return livroreservado;
    }


    public void setLivroreservado(Livro livroreservado) {
        this.livroreservado = livroreservado;
    }

    public void reservarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livroreservado = livro;
            livro.setDisponivel(false);
            System.out.println(nome + "reservou o livro " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível.");
        }
    }

    public void devolverLivro() {
        if(livroreservado != null) {
            livroreservado.setDisponivel(true);
            System.out.println(nome + " devolveu o livro: " + livroreservado.getTitulo());
            livroreservado = null;
        } else {
            System.out.println(nome + " não tem nenhum livro para devolver");
        }
    }
}
