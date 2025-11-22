package lab.facade;

public class Hdd implements IHardDrive {
    private static int reads = 0;

    public byte[] read(long lba, int size) {
        this.reads++;

        System.out.println(System.currentTimeMillis() + "| Hdd: reading " + size + " bytes from LBA " + lba);
        // return dummy data
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) data[i] = (byte)(i % 256);
        return data;
    }

    public int getReads(){
        System.out.println("HDD reads count " + reads);
        return reads;
    }
}