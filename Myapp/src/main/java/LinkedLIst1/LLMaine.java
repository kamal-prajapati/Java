package LinkedLIst1;

import java.util.*;
class product{
    String name;
    Double qty, price;

    product(String name,Double qty,Double price)
    {
        this.name=name;
        this.qty=qty;
        this.price=price;
    }
}

public class LLMaine {
    public static void main(String args[] )
    {
        product p1=new product("Laptop",2d, 33000d);
        product p2=new product("Monitor",3d, 10000d);

        LinkedList<product> ll =new LinkedList<product>();
        ll.add(p1);
        ll.add(p2);
       // System.out.println(ll.getClass().getSimpleName());
        for(product p:ll)
        {
            System.out.println(p.qty);
        }

    }
}
