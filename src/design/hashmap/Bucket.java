package design.hashmap;

import java.util.ArrayList;

public class Bucket<K,V> {

    private ArrayList<Node<K,V>> listOfNode;

    public ArrayList<Node<K, V>> getListOfNode() {
        return listOfNode;
    }

    public void setListOfNode(ArrayList<Node<K, V>> listOfNode) {
        this.listOfNode = listOfNode;
    }

    public void addNodeToList(Node<K, V> node) {
        this.removeByKey(node.getKey());
        if(this.listOfNode == null) {
            this.listOfNode = new ArrayList<>();
        }
        this.listOfNode.add(node);
    }

    public V getValueByKey(K key) {
        Node<K,V> node = this.listOfNode.stream().filter((data)-> key.equals(data.getKey())).findAny().orElse(null);
        return node == null ? null : node.getValue();
    }

    public void removeByKey(K key) {
        if(this.listOfNode == null ) return;
        this.listOfNode.removeIf(node -> node.getKey().equals(key));
        if(this.listOfNode.isEmpty()) {
            this.listOfNode = null;
        }
    }

}

