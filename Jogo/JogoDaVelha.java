import java.util.Scanner;

public class JogoDaVelha {

    private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X';
    private static boolean jogoAtivo = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarTabuleiro();
        exibirTabuleiro();

        while (jogoAtivo) {
            fazerJogada();
            exibirTabuleiro();
            if (verificarVitoria()) {
                System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate()) {
                System.out.println("O jogo terminou em empate!");
                jogoAtivo = false;
            }
            trocarJogador();
        }
        scanner.close();
        System.out.println("Fim do jogo.");
    }

    // Inicializa o tabuleiro com espaços vazios
    private static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Exibe o tabuleiro no console
    private static void exibirTabuleiro() {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Pede ao jogador para fazer uma jogada
    private static void fazerJogada() {
        int linha, coluna;
        boolean jogadaValida = false;

        while (!jogadaValida) {
            System.out.println("Jogador " + jogadorAtual + ", digite sua jogada (linha [0-2] coluna [0-2]):");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadaValida = true;
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
    }

    // Troca o jogador atual
    private static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    // Verifica se há um vencedor
    private static boolean verificarVitoria() {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }
        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }
        return false;
    }

    // Verifica se o jogo terminou em empate
    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false; // Ainda há espaços vazios, o jogo não empatou
                }
            }
        }
        return true; // Todos os espaços estão preenchidos e não houve vencedor
    }
}