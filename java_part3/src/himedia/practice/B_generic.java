package himedia.practice;

public class B_generic <T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        B_generic<Integer> intBox=new B_generic<>();
        intBox.setItem(1234);
        System.out.println("Integer value : "+intBox.getItem());

        B_generic<String> strBox=new B_generic<>();
        strBox.setItem("Hello");
        System.out.println("String value : "+strBox.getItem());
    }
}
