import java.util.*;

public class ComparacaoPontuacao {
    public static void main(String[] args) {
      int jogador1 = 85;
      int jogador2 = 92;
      
      if(jogador1 > jogador2) {
        System.out.println("O jogador 1 tem a maior pontuação.");
      } else if (jogador1 < jogador2) {
        System.out.println("o jogador 2 tem a maior pontuação");
      } else {
        System.out.println("Ambos os jogadores têm a mesma pontuação.");
      }
  }
}