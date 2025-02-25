public class ConvertMinToSec {
    public static void main(String[] args){
        int resultado = convert(5);
        System.out.println(resultado);
    }

    public static int convert(int minutes){
        return minutes*60;
    }
}