package telephone;

public class Telephone implements ITelephone{
    @Override
    public void call(String number) {
        System.out.println("Chamando o número " + number + " pelo telefone\n");
    }

    @Override
    public void toMeet() {
        System.out.println("Atendendo a chamada pelo telefone\n");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando o correio de voz pelo telefone\n");
    }
}
