package lista4;

/**
 *
 * @author Carlos Antonio
 */
public class Natal extends CartaoWeb{

   
    
    @Override
     String retornarMensagem(String remetente){
        return remetente+" Feliz Natal do papai noel!";
    }

    public Natal(String destinatario) {
        super(destinatario);
    }
     
     
}

