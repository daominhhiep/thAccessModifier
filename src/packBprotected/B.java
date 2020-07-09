package packBprotected;

import packAprotected.*;

class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.msg();
        //Class B kế thừa của class A nên sử dụng được phương thức msg của class B
    }
}
