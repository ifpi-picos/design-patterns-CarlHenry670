// Uso do Adapter
public class App {
    public static void main(String[] args) {
        BluetoothDevice bluetoothDevice = new BluetoothDevice();
        DispositivoUSB adapter = new AdaptadorBluetooth(bluetoothDevice);

        adapter.conectar();
        adapter.desconectar();
    }
}