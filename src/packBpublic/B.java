package packBpublic;

import packApublic.*;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
        //Truy cập được vì class A là public
    }
}
