public class Exercicio8 {
    public int retornaValorDeC(final int a,final int b){
        char[] stringA;
        char[] stringB;
        int tamanho;
        int result;
        String valorDeC = "";

        stringA = String.valueOf(a).toCharArray();
        stringB = String.valueOf(b).toCharArray();

        if(stringA.length < stringB.length){
            tamanho = stringB.length;
            stringA = completarArray(stringA, tamanho);
        }else{
            tamanho = stringA.length;
            stringB = completarArray(stringB, tamanho);
        }

        for(int i = 0; i < tamanho; i++){
            valorDeC += stringA[i] + "" + stringB[i];
        }

        result = Integer.valueOf(valorDeC.replace(" ",""));

        if(result > 1000000){
            return -1;
        }

        return result;
    }

    private char[] completarArray(char[] array, int tamanho){
        String arrCopy = String.valueOf(array);
        int tamanhoAtual = array.length;

        while (tamanhoAtual < tamanho){
            tamanhoAtual += 1;
            arrCopy += " ";
        }

        return arrCopy.toCharArray();
    }
}