import java.util.*;

public class AprendendoString {
    
    public static void main(String[] args){
        
        String literal = "hello";
        
        System.out.println(literal);
        
        // metodos para String 
        // length(), charAt(), substring(), equals(), toUpperCase()
        System.out.print("\nExemplo 01 - Trabalhando com os metodos de String.");
        System.out.println("\nlegth()\ncharAt()\nsubstring()\nequals()\ntoUpperCase\n");
        int length = literal.length();
        char firstChar = literal.charAt(0);
        String upper = literal.toUpperCase();
        System.out.println("Usando o metodo length() para saber quantidade caracteres." + "\nA quantidade de caracteres na palavra " + literal + " e de: " + length);
        System.out.println("\nUsando o metodo charAt() para saber o primeiro caractere de uma palavra." + "\nO primeiro caractere na palavra " + literal + " e " + firstChar + ".");
        System.out.println("\nUsando o metodo toUpperCase() para passar uma palavra para caixa alta." + "\nA palavra " + literal + " em caixa alta fica " + upper + ".");
    }
}