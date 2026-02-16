package com.example.designpatterns.yapisalKaliplar.adapter.ornek3;

public class Adapter implements KabloluKulaklık{
    private BluetoothKulaklik bluetoothK;
    public Adapter(BluetoothKulaklik bluetoothK) {
        this.bluetoothK = bluetoothK;
    }
    @Override
    public void takKablolu() {
        System.out.println("Adaptör: Kablolu girişe sinyal aktarılıyor...");
        bluetoothK.bluetoothAl();
    }
}
