class Exemplo0506 {
    public static void main(String[] args) {
        System.out.println("área de um quandrado..." + area(3));
        System.out.println("área de um reatangulo.." + area(3,2));
        System.out.println("área de um cubo......." + area(3,2,5));
    }

    public static double area (int x) {
        return x * x;
    }

    public static double area (int x, int y) {
        return x * y;
    }

    public static double area(int x, int y, int z) {
        return x * y * z;
    }
}