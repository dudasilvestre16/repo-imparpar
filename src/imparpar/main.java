package imparpar;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int pontosJogador1 = 0;
        int pontosJogador2 = 0;
        int i = 0; 
        String resultado = null;

        String jogador1 = JOptionPane.showInputDialog(null, "Nome do primeiro jogador:");
        String jogador2 = JOptionPane.showInputDialog(null, "Nome do segundo jogador:");

        while (i < 5) {
            
            String escolha1 = JOptionPane.showInputDialog(null, "--- RODADA " + (i + 1) + " ---\n" + jogador1 + ", escolha ímpar ou par:").toLowerCase();
            String escolha2 = JOptionPane.showInputDialog(null, "--- RODADA " + (i + 1) + " ---\n" + jogador2 + ", escolha ímpar ou par:").toLowerCase();

            if (escolha1.equals(escolha2)) {
                JOptionPane.showMessageDialog(null, "Os dois jogadores escolheram a mesma opção nesta rodada. Jogo encerrado.");
                return;
            }

            int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, jogador1 + ", digite um número:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, jogador2 + ", digite um número:"));

            int soma = n1 + n2;

            if (soma % 2 == 0) {
                resultado = "par";
            } else {
                resultado = "ímpar";
            }

            String infoRodada = "Soma: " + soma + "\nResultado: " + resultado;
            
            if (resultado.equals(escolha1)) {
                pontosJogador1++;
                infoRodada += "\nVencedor da rodada: " + jogador1 + "\nPontos totais de " + jogador1 + ": " + pontosJogador1 + "\nPontos totais de " + jogador2 + ": " + pontosJogador2;
            } else {
                pontosJogador2++;
                infoRodada += "\nVencedor da rodada: " + jogador2 + "\nPontos totais de " + jogador2 + ": " + pontosJogador2 + "\nPontos totais de " + jogador1 + ": " + pontosJogador1
                		;;
            }
            
            JOptionPane.showMessageDialog(null, infoRodada, "Resultado da Rodada " + (i + 1), JOptionPane.INFORMATION_MESSAGE);

            i++; 
        }

        String mensagemFinal = "======= FIM DO JOGO =======\nPlacar Final: \n" 
                + jogador1 + ": " + pontosJogador1 + " pontos\n" 
                + jogador2 + ": " + pontosJogador2 + " pontos\n\n";

        if (pontosJogador1 > pontosJogador2) {
            mensagemFinal += " O GRANDE VENCEDOR É: " + jogador1;
        } else if (pontosJogador2 > pontosJogador1) {
            mensagemFinal += " O GRANDE VENCEDOR É: " + jogador2;
        } else {
            mensagemFinal += "O JOGO TERMINOU EM EMPATE!";
        }

        JOptionPane.showMessageDialog(null, mensagemFinal, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}
