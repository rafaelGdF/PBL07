//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Java Programming", "Rafael Freitas");
        Ebook ebook2 = new Ebook("Python Basics", "Felipe Freitas");
        VideosDigitais video1 = new VideosDigitais("Introduction to Algorithms", "Matheus Giaretta");
        VideosDigitais video2 = new VideosDigitais("Machine Learning Fundamentals", "Lucas Utrabo");

        // Exibindo descrições
        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        // Simulando download de ebooks e visualização de vídeos
        ebook1.baixar();
        video2.visualizar();
    }
}
