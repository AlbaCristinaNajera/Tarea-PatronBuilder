package gt.edu.miumg;

import gt.edu.miumg.Email.Email;

public class EnviarCorreo {
    public static void main(String[] args) {
        Email correo = new Email.Builder()
                .destinatario("cristinajera78gamil.com")
                .destinatario("jose38gamil.com")
                .asunto("Prueba Tarea")
                .cuerpo("No sé si estoy haciendo bien la tarea :(")
                .adjuntos("tarea pdf", 38)
                .adjuntos("Trabajo.jpg", 20)
                .build();
        System.out.println(correo);

        Email correo2 = new Email.Builder()
                .destinatario("MariaRo@gamil.com")
                .asunto("Prueba 2")
                .cuerpo("Probando enviar el segundo correo")
                .build();
        System.out.println(correo2);


    }
}
