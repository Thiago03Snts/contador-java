import java.util.Scanner;

// Defina uma classe de exceção personalizada para lidar com parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;
        
        do {System.out.println("Digite o primeiro parâmetro:");
                parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
                parametroDois = terminal.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); // Imprime a mensagem de exceção
        }
        
        } while (parametroUm >= parametroDois);


        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        // Realizar a contagem a partir de 1 e imprimir a mensagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }
}
