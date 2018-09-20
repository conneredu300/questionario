import java.io.Serializable;

public class BinaryTree implements Serializable{
    private int value;
    private BinaryTree rigth;
    private BinaryTree left;


    public BinaryTree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BinaryTree getNoDireito() {
        return rigth;
    }
    public BinaryTree getNoEsquerdo() {
        return left;
    }

    public void inserirNoDireito(final BinaryTree binaryTree)
    {
        this.rigth = binaryTree;
    }

    public void inserirNoEsquerdo(final BinaryTree binaryTree)
    {
        this.left = binaryTree;
    }

    public int realizaSoma(final BinaryTree binaryTree)
    {

        if(binaryTree == null)
            return 0;

        final int noEsquerdo = realizaSoma(binaryTree.getNoEsquerdo());
        final int noDireito = realizaSoma(binaryTree.getNoDireito());

        return binaryTree.value + noEsquerdo + noDireito;
    }

}
