import java.util.Scanner;

class NovoContato {
    String nome;
    String email;
    String telefone;

    NovoContato(String n, String e, String t) {
        nome = n;
        email = e;
        telefone = t;
    }

    String pegarMeiosDeContato() {
        String resultado = "";
        if (email != null && !email.isEmpty()) {
            resultado += "Email: " + email;
        }
        if (telefone != null && !telefone.isEmpty()) {
            if (!resultado.isEmpty()) {
                resultado += ", ";
            }
            resultado += "Telefone: " + telefone;
        }
        if (resultado.isEmpty()) {
            return "Sem meios de contato!";
        }
        return resultado;
    }

    void mostrarContato() {
        System.out.println("Nome: " + nome);
        System.out.println(pegarMeiosDeContato());
    }
}