/*
 * 
 * Power Calculator
Create a function that takes voltage and current and returns the calculated power.

Examples
power(230, 10) ➞ 2300

power(110, 3) ➞ 330

power(480, 20) ➞ 9600
 * 
 */

package desafios.edabit;

public class VoltageCurrent {
    public static void main(String[] args) {
        Circuit.power(220, 5);
    }
}

// Classe auxiliar para realizar calculo
class Circuit {
    public static int power(int voltage, int circuit) {
        return circuit * voltage;
    }
}