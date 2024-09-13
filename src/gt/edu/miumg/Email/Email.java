package gt.edu.miumg.Email;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private List<String> destinatario;
    private String asunto;
    private String cuerpo;
    private List<Archivo> adjuntos;

    private Email(Builder builder) {
        this.adjuntos = builder.adjuntos;
        this.destinatario = builder.destinatario;
        this.asunto = builder.asunto;
        this.cuerpo = builder.cuerpo;
    }

    public static class Builder {
        private List<String> destinatario= new ArrayList<>();
        private String asunto;
        private String cuerpo;
        private List<Archivo> adjuntos = new ArrayList<>();

        public Builder destinatario(String destinatario) {
            this.destinatario.add(destinatario);
            return this;
        }

        public Builder asunto(String asunto) {
            this.asunto = asunto;
            return this;
        }

        public Builder cuerpo(String cuerpo) {
            this.cuerpo = cuerpo;
            return this;
        }


        public Builder adjuntos(String nombre, int peso) {
            this.adjuntos.add(new Archivo(nombre, peso));
            return this;
        }

        public Email build() {
            if (destinatario.isEmpty()) {
                throw new RuntimeException("El correo debe tener al menos un destinatario, por favor agrega uno...");
            }
            if (cuerpo == null) {
                throw new RuntimeException("El correo debe tener un cuerpo");
            }

            return new Email(this);
        }
    }

    @Override
    public String toString() {
        return "\n***Correo Electrónico***:" +
                "\n"+
                "\nDestinatario=" + destinatario +
                "\nAsunto=" + asunto +
                "\nCuerpo=" + cuerpo  +
                "\nAdjuntos=" + adjuntos;
    }
}
