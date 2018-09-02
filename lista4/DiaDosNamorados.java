package lista4;

/**
 *
 * @author Carlos Antonio
 */
public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    String retornarMensagem(String remetente) {
      return remetente+" Feliz dia dos namorados!";
    }

    
}
