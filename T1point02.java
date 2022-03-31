import java.util.Scanner;

public class T1point02 {
    public static void main(String[] args) {
        String[][] mahasiswa = new String[3][3];
        String[] data = {"Nama Mahasiswa", "Nim", "Jurusan"};

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("======================================================");
        System.out.println("**                    Input Data                    **");
        System.out.println("======================================================");
        System.out.println();

        for (int i = 0; i < mahasiswa.length; i++){
            for (int j = 0; j < mahasiswa.length; j++){
                System.out.print("Masukan "+ data[j] +": ");
                mahasiswa[i][j] = input.nextLine();
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("======================================================");
        System.out.println("**                  Data Mahasiswa                  **");
        System.out.println("======================================================");
        System.out.println();

        for (int i = 0; i < mahasiswa.length; i++){
            for (int j = 0; j < mahasiswa[i].length; j++){
                System.out.print(mahasiswa[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
