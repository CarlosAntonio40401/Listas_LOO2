package lista4;

/**
 *
 * @author Carlos Antonio
 */
public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    String retornarMensagem(String remetente) {
        return remetente + " Feliz aniversário minha nobre pessoa!";
    }

}
