class NoisyAnimal {
    public static void main(String[] args) {

        // The main method contains an instance of Dog
        Dog greyhound = new Dog();

        greyhound.myName();
        greyhound.name = "FastRunner";
        greyhound.noise();
        greyhound.myName();
    }
}
