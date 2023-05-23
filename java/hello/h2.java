class h2 {
    public static Object hello() {
        System.out.println("The other hello");
        return null;
    }

    public static Supplier<String> hello = () -> { System.out.println("Hello, world!"); return ""; }

    public static void main(final String... args) {
        System.out.println(h2.hello.run());
        System.out.println(h2.hello());
    }
}
