class Main {
    public static void main(String args[]) {
        Animal a;
        a = new Gato();
        test(a);

        a = new Perro();
        test(a);
    }

    public static void test(Animal animal) {
        animal.hacerRuido();
    }
}