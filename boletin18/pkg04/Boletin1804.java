package boletin18.pkg04;

import javax.swing.JOptionPane;

public class Boletin1804 {

    public static void main(String[] args) {
        
        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de DNI sin la letra"));
        
        JOptionPane.showMessageDialog(null, "Su D.N.I. es: " + dni + "-" + letras[dni%23]);
    }
    
}
