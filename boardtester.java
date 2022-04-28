public class boardtester {
        public static void main(String[] args) {
            for (int i=7; i>=-1; i--)
            {
                if (i==-1){System.out.print("=== ");}
                else{System.out.print("="+(i)+"= ");}
                for (int j=0; j<=7; j++)
                {
                    if (i==-1){System.out.print("="+(j)+"= ");}
                    else {
                        //System.out.print("[" + i + "," + j + "] ");
                        System.out.print("--- ");
                    }
                    }
                System.out.println();
            }
            System.out.println();
        }
    }
