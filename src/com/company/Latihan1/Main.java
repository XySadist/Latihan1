package com.company.Latihan1;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String,Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Matematika",2020012 ));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Pemprograman",2020017 ));

        System.out.print("Masukan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas: " + data.kelas + ", Mata kuliah praktikum : " + data.matkulPraktikum + ", nim" + data.nim);


        }

    }
}
