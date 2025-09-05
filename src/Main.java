import java.util.Scanner;

class Contato {
    String nome;
    String email;
    String telefone;

    Contato(String n, String e, String t) {
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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Digite os dados do contato " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            contatos[i] = new Contato(nome, email, telefone);
        }

        Contato maiorNome = contatos[0];
        for (Contato c : contatos) {
            if (c.nome.length() > maiorNome.nome.length()) {
                maiorNome = c;
            }
        }

        System.out.println("\nContato com mais letras no nome:");
        maiorNome.mostrarContato();

        sc.close();
    }
}