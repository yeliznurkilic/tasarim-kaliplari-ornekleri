package com.example.designpatterns.yapisalKaliplar.adapter.ornek3;

public class Main {
    public static void main(String[] args) {
        BluetoothKulaklik kulaklik=new BluetoothKulaklik();

        //adaptör oluştur
        KabloluKulaklık kulaklıkAdapter=new Adapter(kulaklik);
        kulaklıkAdapter.takKablolu();
    }
}
