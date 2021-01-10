package org.saltedfish.lambda.functionalinterface;

import java.util.function.Supplier;

/**
 * Effective Java item 3
 */

class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {  }
    public static Elvis getInstance() { return INSTANCE; }
    public void leaveTheBuilding() { }
}



public class SupplierDemo {
    private static Elvis getElvis(Supplier<Elvis> stringSupplier) {
        return stringSupplier.get();
    }

    public static void main(String[] args) {
        System.out.println(getElvis(Elvis::getInstance));
    }
}
