package builderadvanced;

import java.util.function.Consumer;

public class Variant {
    private String sku;
    private String name;
    private Double price;

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s@%d[ %s | %s | $%.2f ]",
                getClass().getSimpleName(),
                hashCode(),
                sku,
                name,
                price);
    }

    public static VariantBuilder builder() {
        return new VariantBuilder();
    }

    public static VariantBuilderOptions builderOptions() {
        return new VariantBuilderOptions();
    }

    public static class VariantBuilder {
        private Variant var;

        private VariantBuilder() {
            var = new Variant();
        }

        public VariantBuilder sku(String sku) {
            var.sku = sku;
            return this;
        }

        public VariantBuilder name(String name) {
            var.name = name;
            return this;
        }

        public VariantBuilder price(Double price) {
            var.price = price;
            return this;
        }

        public VariantBuilder with(VariantBuilderOptions options) {
            options.addToBuilder(this);
            return this;
        }

        public Variant build() {
            return var;
        }
    }

    public static class VariantBuilderOptions {
        private Consumer<VariantBuilder> options;

        private VariantBuilderOptions() {
            options = b -> {};
        }

        public VariantBuilderOptions add(Consumer<VariantBuilder> option) {
            options = options.andThen(option);
            return this;
        }

        public void addToBuilder(VariantBuilder builder) {
            options.accept(builder);
        }
    }
}
