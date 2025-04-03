class Exemplo0507
{
    public static void main(String[] args) 
    {
        int H,M,S;
        Exemplo0502.limpaTela();
        for(H=0;H<24;H++)
            for(M=0;M<60;M++)
                for(S=0;S<60;S++) 
                {
                    System.out.println("Para encerrar pressione Ctrl+C "+ H + "h: " +M + "m: " + S + "s");
                    Exemplo0503.tempo(2);
                    Exemplo0502.limpaTela();
                }
    }
}
