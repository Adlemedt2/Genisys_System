import javax.swing.*;

// clase Triangulo
public class Triangulo {
    /*
   Desarrolle un metodo que determine si un triangulo es equilatero, es decir, si sus lados son iguales.
   escaleno, es decir, si sus lados son diferentes o rectangulo si dos lados son iguales.
    */
    public void tipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2) {
            if (lado3 == lado1)
                JOptionPane.showMessageDialog(null, "El triangulo es Equilatero");
            else {
                JOptionPane.showMessageDialog(null, "El triangulo es Rectangulo");
            }
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
        {
            JOptionPane.showMessageDialog(null, "El triangulo es Escaleno");
        }

    }
    //psvm
    static void main()
    {
        Triangulo triangulo = new Triangulo();
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer lado"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo lado"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del tercer lado"));

        triangulo.tipoTriangulo(lado1, lado2, lado3);

    }
}