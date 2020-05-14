package cn.fh.bigdata.datastructure;

public class BinarySearchTree2 {

    private  int data;
    private  BinarySearchTree2 right;
    private  BinarySearchTree2 left;


    public BinarySearchTree2(int data) {
        this.data = data;
        this.right=null;
        this.left=null;
    }

    public void insert(BinarySearchTree2 root,int data){
        if (root!=null){
                if (root.data<data){ // 比根节点大，放入右子树
                    if (root.right==null){
                        root.right=new BinarySearchTree2(data);
                    }else {
                        insert(root.right,data);
                    }
                }else {
                    if (root.left!=null){
                        root.left=new BinarySearchTree2(data);
                    }else {
                        insert(root.left,data);
                    }
                }
        }
    }

    // 左根右 中序遍历
    public void inForEach(BinarySearchTree2 root){
        inForEach(root.left);
        System.out.print(root.data+" ");
        inForEach(root.right);
    }

}
