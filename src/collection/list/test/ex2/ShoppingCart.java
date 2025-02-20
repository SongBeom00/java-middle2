package src.collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Item> cartList = new ArrayList<>();
    int total = 0;


    public void addItem(Item item) {
        cartList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < cartList.size(); i++) {
            total += cartList.get(i).getTotalPrice();
            System.out.println("상품명: "+cartList.get(i).getName() + ", 합계:" + cartList.get(i).getTotalPrice());
        }
        System.out.println("전체 가격 합:"+total);


    }
}
