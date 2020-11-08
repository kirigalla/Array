import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
    Scanner entrada =new Scanner(System.in);

    int opcion;
    char letra;

    do {
        System.out.println("1.-Genera una tabla 1");
        System.out.println("2.-Genera una tabla 2");
        System.out.println("3.-Calificaciones");
        System.out.println("4.-Sumar Matrizes");

        opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    int val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, promedio;
                    System.out.println("Ingresa valor 1");
                    val1 = entrada.nextInt();

                    System.out.println("Ingresa valor 2");
                    val2 = entrada.nextInt();

                    System.out.println("Ingresa valor 3");
                    val3 = entrada.nextInt();

                    System.out.println("Ingresa valor 4");
                    val4 = entrada.nextInt();

                    System.out.println("Ingresa valor 5");
                    val5 = entrada.nextInt();

                    System.out.println("Ingresa valor 6");
                    val6 = entrada.nextInt();

                    System.out.println("Ingresa valor 7");
                    val7 = entrada.nextInt();

                    System.out.println("Ingresa valor 8");
                    val8 = entrada.nextInt();

                    System.out.println("Ingresa valor 9");
                    val9 = entrada.nextInt();

                    System.out.println("Ingresa valor 10");
                    val10 = entrada.nextInt();

                    int[] Array= {val1, val2, val3, val4, val5, val6, val7, val8, val9, val10};
                    Array[0]=val1;
                    Array[1]=val2;
                    Array[2]=val3;
                    Array[3]=val4;
                    Array[4]=val5;
                    Array[5]=val6;
                    Array[6]=val7;
                    Array[7]=val8;
                    Array[8]=val9;
                    Array[9]=val10;

                    System.out.println(Array[0]);
                    System.out.println(Array[1]);
                    System.out.println(Array[2]);
                    System.out.println(Array[3]);
                    System.out.println(Array[4]);
                    System.out.println(Array[5]);
                    System.out.println(Array[6]);
                    System.out.println(Array[7]);
                    System.out.println(Array[8]);
                    System.out.println(Array[9]);

                    promedio = (val1+val2+val3+val4+val5+val6+val7+val8+val9+val10)/10;
                    System.out.println("El promedio de los valores es "+promedio);

                    break;

                case 2:
                    int Aval1, Aval2, Aval3, Aval4, Aval5, Aval6, Aval7, Aval8, Aval9, Aval10, Apromedio;
                    System.out.println("Ingresa valor 1");
                    Aval1 = entrada.nextInt();

                    System.out.println("Ingresa valor 2");
                    Aval2 = entrada.nextInt();

                    System.out.println("Ingresa valor 3");
                    Aval3 = entrada.nextInt();

                    System.out.println("Ingresa valor 4");
                    Aval4 = entrada.nextInt();

                    System.out.println("Ingresa valor 5");
                    Aval5 = entrada.nextInt();

                    System.out.println("Ingresa valor 6");
                    Aval6 = entrada.nextInt();

                    System.out.println("Ingresa valor 7");
                    Aval7 = entrada.nextInt();

                    System.out.println("Ingresa valor 8");
                    Aval8 = entrada.nextInt();

                    System.out.println("Ingresa valor 9");
                    Aval9 = entrada.nextInt();

                    System.out.println("Ingresa valor 10");
                    Aval10 = entrada.nextInt();

                    int [] Array1= {Aval1, Aval2, Aval3, Aval4, Aval5, Aval6, Aval7, Aval8,Aval9, Aval10};
                    Array1[0]=Aval1;
                    Array1[1]=Aval2;
                    Array1[2]=Aval3;
                    Array1[3]=Aval4;
                    Array1[4]=Aval5;
                    Array1[5]=Aval6;
                    Array1[6]=Aval7;
                    Array1[7]=Aval8;
                    Array1[8]=Aval9;
                    Array1[9]=Aval10;

                    System.out.println(Array1[0]);
                    System.out.println(Array1[1]);
                    System.out.println(Array1[2]);
                    System.out.println(Array1[3]);
                    System.out.println(Array1[4]);
                    System.out.println(Array1[5]);
                    System.out.println(Array1[6]);
                    System.out.println(Array1[7]);
                    System.out.println(Array1[8]);
                    System.out.println(Array1[9]);

                    Apromedio = (Aval1+Aval3+Aval5+Aval7+Aval9)/5;
                    System.out.println("El promedio de los arreglos pares es: "+Apromedio);

                    break;

                case 3:
                    int Bval1, Bval2, Bval3, Bval4, Bval5, Bval6, Bval7, Bval8, Bval9, Bval10, Bpromedio;
                    System.out.println("Ingresa la calificacion del alumno 1");
                    Bval1 = entrada.nextInt();

                    System.out.println("Ingresa la calificacion del alumno 2");
                    Bval2 = entrada.nextInt();

                    System.out.println("Ingresa valor 3");
                    Bval3 = entrada.nextInt();

                    System.out.println("Ingresa valor 4");
                    Bval4 = entrada.nextInt();

                    System.out.println("Ingresa valor 5");
                    Bval5 = entrada.nextInt();

                    System.out.println("Ingresa valor 6");
                    Bval6 = entrada.nextInt();

                    System.out.println("Ingresa valor 7");
                    Bval7 = entrada.nextInt();

                    System.out.println("Ingresa valor 8");
                    Bval8 = entrada.nextInt();

                    System.out.println("Ingresa valor 9");
                    Bval9 = entrada.nextInt();

                    System.out.println("Ingresa valor 10");
                    Bval10 = entrada.nextInt();

                    double [] Array2= {Bval1, Bval2, Bval3, Bval4, Bval5, Bval6, Bval7, Bval8,Bval9, Bval10};
                    Array2[0]=Bval1;
                    Array2[1]=Bval2;
                    Array2[2]=Bval3;
                    Array2[3]=Bval4;
                    Array2[4]=Bval5;
                    Array2[5]=Bval6;
                    Array2[6]=Bval7;
                    Array2[7]=Bval8;
                    Array2[8]=Bval9;
                    Array2[9]=Bval10;

                    System.out.println("La calificacion del alumno 1 es: "+Array2[0]);
                    System.out.println("La calificacion del alumno 2 es: "+Array2[1]);
                    System.out.println("La calificacion del alumno 3 es: "+Array2[2]);
                    System.out.println("La calificacion del alumno 4 es: "+Array2[3]);
                    System.out.println("La calificacion del alumno 5 es: "+Array2[4]);
                    System.out.println("La calificacion del alumno 6 es: "+Array2[5]);
                    System.out.println("La calificacion del alumno 7 es: "+Array2[6]);
                    System.out.println("La calificacion del alumno 8 es: "+Array2[7]);
                    System.out.println("La calificacion del alumno 9 es: "+Array2[8]);
                    System.out.println("La calificacion del alumno 10 es: "+Array2[9]);

                    Bpromedio = (Bval1+Bval2+Bval3+Bval4+Bval5+Bval6+Bval7+Bval8+Bval9+Bval10)/10;
                    System.out.println("El promedio de las calificaciones es: " +Bpromedio);

                    /* Falta acabar de cumplir con las condiciones
                    */

                    break;

                case 4:
                    int Cval1, Cval2, Cval3, Cval4, Cval5, Cval6, Cval7, Cval8, Cval9, Cval10, Cval11, Cval12, Cval13, Cval14, Cval15, Cval16, Cval17, Cval18;
                    System.out.println("Ingresa valor 1 de la primera matriz");
                    Cval1 = entrada.nextInt();

                    System.out.println("Ingresa valor 2 de la primera matriz");
                    Cval2 = entrada.nextInt();

                    System.out.println("Ingresa valor 3 de la primera matri<");
                    Cval3 = entrada.nextInt();

                    System.out.println("Ingresa valor 4 de la primera matriz");
                    Cval4 = entrada.nextInt();

                    System.out.println("Ingresa valor 5 de la primera matriz");
                    Cval5 = entrada.nextInt();

                    System.out.println("Ingresa valor 6 de la primera matriz");
                    Cval6 = entrada.nextInt();

                    System.out.println("Ingresa valor 1 de la segunda matriz");
                    Cval7 = entrada.nextInt();

                    System.out.println("Ingresa valor 2 de la segunda matriz");
                    Cval8 = entrada.nextInt();

                    System.out.println("Ingresa valor 3 de la segunda matriz");
                    Cval9 = entrada.nextInt();

                    System.out.println("Ingresa valor 4 de la segunda matriz");
                    Cval10 = entrada.nextInt();

                    System.out.println("Ingresa valor 5 de la segunda matriz");
                    Cval11 = entrada.nextInt();

                    System.out.println("Ingresa valor 6 de la segunda matriz");
                    Cval12 = entrada.nextInt();

                    Cval13 = Cval1 + Cval7;
                    Cval14 = Cval2 + Cval8;
                    Cval15 = Cval3 + Cval9;
                    Cval16 = Cval4 + Cval10;
                    Cval17 = Cval5 + Cval11;
                    Cval18 = Cval6 + Cval12;

                    int matriz[][] = new int[3][3];
                    matriz[0][0]= Cval13;
                    matriz[0][1]= Cval14;
                    matriz[0][2]= Cval15;
                    matriz[1][0]= Cval16;
                    matriz[1][1]= Cval17;
                    matriz[1][2]= Cval18;

                    System.out.println(matriz[0][0]+" "+matriz[0][1]+" "+matriz[0][2]);
                    System.out.println(matriz[1][0]+" "+matriz[1][1]+" "+matriz[1][2]);

                    break;

            }

        System.out.println("Programa realizado por 3IV8 Rivas Gutierrez Leonardo");
        System.out.println("¿Deseas volver al menu?, si lo deseas escribe s");
        letra = entrada.next().charAt(0);
    }while (letra == 's');
    }
}
