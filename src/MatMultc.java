import java.util.Random;
 
public class MatMultc {
    public static int count = 0;
    public static int option;
    public static int SIZE = 1000;
    public static int rowsInA = SIZE;
    public static int columnsInA = SIZE;
    public static int columnsInB = SIZE;
 
    public static int[][] a = new int[rowsInA][columnsInA];
    public static int[][] b = new int[columnsInA][columnsInB];
    public static int[][] c = new int[rowsInA][columnsInB];
 
    public static double[][] d = new double[rowsInA][columnsInA];
    public static double[][] e = new double[columnsInA][columnsInB];
    public static double[][] f = new double[rowsInA][columnsInB];
 
    public static float[][] f1 = new float[rowsInA][columnsInA];
    public static float[][] f2 = new float[columnsInA][columnsInB];
    public static float[][] f3 = new float[rowsInA][columnsInB];
 
    public static short[][] s1 = new short[rowsInA][columnsInA];
    public static short[][] s2 = new short[columnsInA][columnsInB];
    public static short[][] s3 = new short[rowsInA][columnsInB];
 
    public static long[][] l1 = new long[rowsInA][columnsInA];
    public static long[][] l2 = new long[columnsInA][columnsInB];
    public static long[][] l3 = new long[rowsInA][columnsInB];
 
 
//0
    public static void main(String arg[]) {
        EnergyCheckUtils.init();
        double[] before = EnergyCheckUtils.getEnergyStats();
        
        int opt = Integer.parseInt(arg[0]);
        createMat(opt);    

        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption Total: " + consumption);
    }
//1
    public static void createMat(int opt) {
        if(opt <= 0){
            createDoubleMat();
            multiplyDouble();   
        } 
        else if(opt <= 1){
            createShortMat();
            multiplyShort();
        }
        else if(opt <= 2){
            createIntMat();
            multiplyInt();
        }
        else if(opt <= 3){
            createFloatMat();
            multiplyFloat();
        }
        else if(opt <= 4){
            createLongMat();
            multiplyLong();
        }

    }


//2    
    public static void createFloatMat() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        Random ran = new Random();
        for (int i = 0; i < f1.length; i++) {
            for (int j = 0; j < f1[0].length; j++) {
                float fraction = ran.nextFloat();
                f1[i][j] = fraction;
            }
        }
        for (int i = 0; i < f2.length; i++) {
            for (int j = 0; j < f2[0].length; j++) {
                float fraction = ran.nextFloat();
                f2[i][j] = fraction;
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 2: " + consumption);
    }
 
 //3
    public static void createShortMat() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        Random ran = new Random();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2[0].length; j++) {
                short fraction = (short)(ran.nextFloat());
                s1[i][j] = fraction;
            }
        }
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < s2[0].length; j++) {
                short fraction = (short)(ran.nextFloat());
                s2[i][j] = fraction;
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 3: " + consumption);
    }
 
//4
    public static void createDoubleMat() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        Random ran = new Random();
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                double fraction = (double)(ran.nextFloat());
                d[i][j] = fraction;
            }
        }
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                double fraction = (double)(ran.nextFloat());
                e[i][j] = fraction;
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 4: " + consumption);
 
    }

//5
    public static void createIntMat() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        Random ran = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int fraction = (int)(ran.nextFloat());
                a[i][j] = fraction;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int fraction = (int)(ran.nextFloat());
                b[i][j] = fraction;
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 5: " + consumption);
    }
 
//6
    public static void createLongMat() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        Random ran = new Random();
        for (int i = 0; i < l1.length; i++) {
            for (int j = 0; j < l1[0].length; j++) {
                long fraction = (long)(ran.nextFloat());
                l1[i][j] = fraction;
            }
        }
        for (int i = 0; i < l2.length; i++) {
            for (int j = 0; j < l2[0].length; j++) {
                long fraction = (long)(ran.nextFloat());
                l2[i][j] = fraction;
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 6: " + consumption);
    }
 

//7
    public static void multiplyFloat() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        int rowsInA = f1.length;
        int columnsInA = f1[0].length; // same as rows in B
        int columnsInB = f2.length;
        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                for (int k = 0; k < columnsInA; k++) {
                    f3[i][j] = f3[i][j] + (f1[i][k] * f2[k][j]);
                }
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 8: " + consumption);
    }

//8    
    public static void multiplyShort() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        int rowsInA = s1.length;
        int columnsInA = s1[0].length; // same as rows in B
        int columnsInB = s2.length;
            for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                for (int k = 0; k < columnsInA; k++) {
                    s3[i][j] = (short)(s3[i][j] + (s1[i][k] * s2[k][j]));
                }
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 9: " + consumption);
    }
 
//9
    public static void multiplyDouble() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        int rowsInA = e.length;
        int columnsInA = e[0].length; // same as rows in B
        int columnsInB = d.length;
            for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                for (int k = 0; k < columnsInA; k++) {
                    f[i][j] = f[i][j] + (e[i][k] * d[k][j]);
                }
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 10: " + consumption);
    }
    
//10
    public static void multiplyInt() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        int rowsInA = a.length;
        int columnsInA = a[0].length; // same as rows in B
        int columnsInB = b.length;
        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                for (int k = 0; k < columnsInA; k++) {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 11: " + consumption);
    }
 
//11    
    public static void multiplyLong() {
        double[] before = EnergyCheckUtils.getEnergyStats();
        int rowsInA = l1.length;
        int columnsInA = l1[0].length; // same as rows in B
        int columnsInB = l2.length;
        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                for (int k = 0; k < columnsInA; k++) {
                    l3[i][j] = l3[i][j] + (l1[i][k] * l2[k][j]);
                }
            }
        }
        double[] after = EnergyCheckUtils.getEnergyStats();
        double consumption = ((after[0] - before[0]) + (after[1] - before[1]) + (after[2] - before[2])) / 10.0;
        System.out.println("Power consumption 12: " + consumption);
    }
 
 
}