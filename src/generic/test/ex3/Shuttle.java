package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private String name;
    private int hp;

    public void in(T t){
        this.name = t.getName();
        this.hp = t.getHp();
    }

    public void showInfo(){
        System.out.println("이름 : "+ name + ", HP : " + hp);
    }

}
