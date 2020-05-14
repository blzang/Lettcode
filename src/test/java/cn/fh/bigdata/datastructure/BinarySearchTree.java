package cn.fh.bigdata.datastructure;

/**
 * 二叉搜索樹
 */
public class BinarySearchTree {
    private int data;//表示数字
    private BinarySearchTree left;
    private BinarySearchTree right;

    public BinarySearchTree(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }

    // 二叉查找树的插入
    public void insert(BinarySearchTree root,int data){
        if (root.data<data){ // 插入的数大于根节点，插入右子树
            if (root.right==null){// 右子树为null，直接插入
            root.right=new BinarySearchTree(data);
            }else {// 不为null，把右子树当成根节点插入
                insert(root.right,data);
            }
        }else {
            if (root.left==null){
                root.left=new BinarySearchTree(data);
            }  else {
                insert(root.left,data);
            }
        }
    }


    //中序遍历 左 根 右
    public void inForEach(BinarySearchTree root){
            if (root != null){
                inForEach(root.left);
                System.out.print(root.data+" ");
                inForEach(root.right);
            }
    }


    public static void main(String[] args) {
        int data[] ={5,9,0,1,2,3,10};

        BinarySearchTree root=new BinarySearchTree(data[0]);
        for (int i = 1; i < data.length; i++) {
            root.insert(root,data[i]);
        }

        System.out.println("中序遍历为:");
        root.inForEach(root);
    }
}
