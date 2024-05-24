package browser;

public class Browser implements IBrowser{
    @Override
    public void displayPage(String url) {
        System.out.println("Exibindo a página " + url + " pelo navegador\n");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba pelo navegador\n");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando página pelo navegador\n");
    }
}
