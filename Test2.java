public class Test2 {
    public static void main(String[] args) {
        RDoublyLinkedList<Integer> list=new RDoublyLinkedList<>();
//        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.first());
            list.rotate();
        }
    }
}
