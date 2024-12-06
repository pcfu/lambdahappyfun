package builderadvanced;

public class Main {
    public static void main(String[] args) {
        Variant.VariantBuilderOptions options = Variant.builderOptions().
                add(b -> b.sku("472166")).
                add(b -> b.name("gift packaging")).
                add(b -> b.price(10.0));

        // Use a set of options with multiple builders
        System.out.println(Variant.builder().with(options).build());
        System.out.println(Variant.builder().with(options).build());
        System.out.println(Variant.builder().with(options).build());
    }
}
