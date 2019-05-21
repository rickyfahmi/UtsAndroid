/*tanggal pengerjaan : 18
  nim : 10116032
  nama : Renaldi Ferdiansyah
  kelas : IF-1

*/

package com.example.renaldi.daftarteman;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class datateman extends AppCompatActivity {

    private TextView nim, getnama, kelas, telepon, email, sosmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datateman);
        getSupportActionBar().setTitle("Data Teman");
        nim = findViewById(R.id.nim);
        getnama = findViewById(R.id.getnama);
        kelas = findViewById(R.id.kelas);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);
        sosmed = findViewById(R.id.sosmed);
        showdata();


    }

    @SuppressLint("SetTextI18n")
    private void showdata() {
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama) {
            case "Agus Ubaidillah":
                nim.setText("NIM: 10116038");
                getnama.setText("Nama: Agus Ubaidillah");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08991282725");
                email.setText("Email : agusubaid@gmail.com");
                sosmed.setText("Sosmed : Agus Ubaidillah");
                break;

            case "Rizki Fadhillah":
                nim.setText("NIM: 10116017");
                getnama.setText("Nama: Rizki Fadhillah");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08726578272");
                email.setText("Email : rizkiskididi@gmail.com");
                sosmed.setText("Sosmed : Rizki Fadhillah");
                break;

            case "Doni Wiranata":
                nim.setText("NIM: 10116024");
                getnama.setText("Nama: Doni Wiranata");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08543252627");
                email.setText("Email : donidonat@gmail.com");
                sosmed.setText("Sosmed : Donikurangbelajar");
                break;

            case "Said Dinar":
                nim.setText("NIM: 10116026");
                getnama.setText("Nama: Said Dinar");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08522425262");
                email.setText("Email : dinarjoy@gmail.com");
                sosmed.setText("Sosmed : Sdinarfadillah");
                break;


        }
    }
}