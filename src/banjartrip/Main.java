
package banjartrip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Booking[] data = new Booking[100];

        int jumlahBooking = 0;

        int menu = 0;

        while (menu != 3) {

            System.out.println();
            System.out.println("===== BANJARTRIP =====");
            System.out.println("1. Booking");
            System.out.println("2. Lihat Booking");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");

            try {

                menu = input.nextInt();
                input.nextLine();

                switch (menu) {

                    case 1:

                        System.out.print("Nama Pelanggan : ");
                        String nama = input.nextLine();

                        System.out.println();
                        System.out.println("Daftar Wisata");
                        System.out.println("1. Pasar Terapung");
                        System.out.println("2. Bukit Matang Kaladan");
                        System.out.println("3. Menara Pandang");

                        System.out.print("Pilih : ");
                        int pilih = input.nextInt();

                        String wisata = "";
                        int harga = 0;

                        // Seleksi
                        if (pilih == 1) {

                            wisata = "Pasar Terapung";
                            harga = 150000;

                        } else if (pilih == 2) {

                            wisata = "Bukit Matang Kaladan";
                            harga = 200000;

                        } else {

                            wisata = "Menara Pandang";
                            harga = 100000;

                        }

                        System.out.print("Jumlah Orang : ");
                        int orang = input.nextInt();

                        // Object
                        data[jumlahBooking] = new Booking(
                                wisata,
                                harga,
                                nama,
                                orang);

                        jumlahBooking++;

                        System.out.println();
                        System.out.println("Booking Berhasil!");

                        break;

                    case 2:

                        if (jumlahBooking == 0) {

                            System.out.println("Belum ada data.");

                        } else {

                            // Perulangan
                            for (int i = 0; i < jumlahBooking; i++) {

                                data[i].tampilkan();

                            }

                        }

                        break;

                    case 3:

                        System.out.println("Terima kasih.");

                        break;

                    default:

                        System.out.println("Menu tidak tersedia.");

                }

            }

            // Error Handling
            catch (Exception e) {

                System.out.println("Input harus berupa angka!");

                input.nextLine();

            }

        }

    }

}