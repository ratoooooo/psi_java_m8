/**
 * 
 */
package GUI;

/**
 * @author Rato
 */
public class AtividadeC {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i, j;
        int[][] tabela = { 
            {1, 4, 25}, 
            {11, 2, 23}, 
            {3, 8, 9} 
        };

        /*
        System.out.println(tabela[0][0]);
        System.out.println(tabela[1][0]);
        System.out.println(tabela[2][0]);
        System.out.println(tabela[0][1]);
        System.out.println(tabela[1][1]);
        System.out.println(tabela[2][1]);
        System.out.println(tabela[0][2]);
        System.out.println(tabela[1][2]);
        System.out.println(tabela[2][2]);
        */
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}
