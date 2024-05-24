package IPhone;

import browser.IBrowser;
import player.IMusicPlayer;
import telephone.ITelephone;

public class Iphone implements IMusicPlayer, ITelephone, IBrowser {

    @Override
    public void displayPage(String url) {
        System.out.println("Exibindo a página " + url + " pelo nagevador do iPhone\n");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba pelo nagevador do iPhone\n");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando página pelo nagevador do iPhone\n");
    }

    @Override
    public void play() {
        System.out.println("Tocando a música pelo player do iPhone\n");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a música pelo player do iPhone\n");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando a música " + music + " pelo player do iPhone\n");
    }

    @Override
    public void call(String number) {
        System.out.println("Chamando o número " + number + " pelo telefone do iPhone\n");
    }

    @Override
    public void toMeet() {
        System.out.println("Atendendo a chamada pelo telefone do iPhone\n");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando o correio de voz pelo telefone do iPhone\n");
    }
}