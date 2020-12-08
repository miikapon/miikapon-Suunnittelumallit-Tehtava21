
class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("Reading data frm " + lba + ", " + size + " bytes");
        String Data = "mem_address";
        return Data.getBytes();
    }
}
