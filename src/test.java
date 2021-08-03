

public class test {
    class Node{
        private int data;
        private Node next;
        public int getData(){
            return data;
        }
        public void setData(int data){
            this.data=data;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next= next;
        }
        public String toString(){
            return "Node [data="+data+",next="+next+"]";
        }
    }

    public static void main(String[] args) {
        test t= new test();
        test.Node node1=t.new Node();
        test.Node node2=t.new Node();
        test.Node node3=t.new Node();
        node1.setData(1);
        node2.setData(2);
        node3.setData(3);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println("反转前数据");
        printNodeList(node1);
        Node returnNode=reserverNodeList(node1);
        System.out.println("反转后的数据");
        printNodeList(returnNode);
    }



    private static Node reserverNodeList(Node node){
        Node returnNode=null;
        while(node !=null){
            Node preNode=node.getNext();
            node.setNext(returnNode);
            returnNode=node;
            node=preNode;
        }
        return returnNode;
    }
    private static void printNodeList(Node node){
        StringBuilder str=new StringBuilder();
        while(node!=null){
            str.append(node.getData()+" ");
            node=node.getNext();
        }
        System.out.println(str.toString());
    }
}
