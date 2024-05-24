package player;

public class MusicPlayer implements IMusicPlayer{
    @Override
    public void play() {
        System.out.println("Tocando a música pelo player\n");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a música pelo player\n");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando a música " + music + " pelo player\n");
    }
}
