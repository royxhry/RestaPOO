public class Resta {
    // Variables para los valores y el resultado de la resta
    private int a, b, r;

    // Método para obtener el valor 'a'
    public int getA() {
        return a;
    }

    // Método para establecer el valor 'a'
    public void setA(int a) {
        this.a = a;
    }

    // Método para obtener el valor 'b'
    public int getB() {
        return b;
    }

    // Método para establecer el valor 'b'
    public void setB(int b) {
        this.b = b;
    }

    // Método para realizar la resta de 'a' y 'b'
    public void restar() {
        this.r = a - b;
    }

    // Método para obtener el resultado de la resta
    public int getR() {
        return r;
    }

    // Método toString para representar la información de la resta
    @Override
    public String toString() {
        return "Resta [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
