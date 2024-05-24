import IPhone.Iphone;
import browser.Browser;
import player.MusicPlayer;
import telephone.Telephone;

public class Principal {
    public static void main (String[] args) {
        Iphone iphone = new Iphone();
        MusicPlayer musicPlayer = new MusicPlayer();
        Telephone telephone = new Telephone();
        Browser browser = new Browser();

        System.out.println("""
                      RODANDO APLICATIVOS INDIVIDUAIS
                #############################################
                
                
                             RODANDO O PLAYER
                             ################
                """);
        musicPlayer.selectMusic("Ouro de Tolo");
        musicPlayer.play();
        musicPlayer.pause();

        System.out.println("""
                             RODANDO O TELEPHONE
                             ###################
                """);
        telephone.call("99 99999-9999");
        telephone.toMeet();
        telephone.startVoiceMail();

        System.out.println("""
                             RODANDO O BROWSER
                             #################
                """);
        browser.displayPage("www.site.com");
        browser.addNewTab();
        browser.updatePage();

        System.out.println("""
                      RODANDO APLICATIVOS PELO IPHONE
                #############################################
                
                
                             RODANDO O PLAYER
                             ################
                """);

        iphone.selectMusic("Ouro de Tolo");
        iphone.play();
        iphone.pause();

        System.out.println("""
                             RODANDO O TELEPHONE
                             ###################
                """);
        iphone.call("99 99999-9999");
        iphone.toMeet();
        iphone.startVoiceMail();

        System.out.println("""
                             RODANDO O BROWSER
                             #################
                """);
        iphone.displayPage("www.site.com");
        iphone.addNewTab();
        iphone.updatePage();
    }
}
