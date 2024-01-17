
class AdaptadorBluetooth implements DispositivoUSB {
    private BluetoothDevice bluetoothDevice;

    AdaptadorBluetooth(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    @Override
    public void conectar() {
       
        System.out.println("Adapter chamando o método adaptado.");
        bluetoothDevice.connectBluetooth();
    }

    @Override
    public void desconectar() {
       
        System.out.println("Adapter chamando o método adaptado.");
        bluetoothDevice.disconnectBluetooth();
    }
}

