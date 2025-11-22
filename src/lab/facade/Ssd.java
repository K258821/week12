package lab.facade;

public class Ssd  implements IHardDrive {
    private static int reads = 0;

    public byte[] read(long lba, int size) {
        reads++;
        System.out.println(System.currentTimeMillis() + "| Sdd: reading " + size + " bytes from LBA " + lba);
        // return dummy data
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) data[i] = (byte)(i % 256);
        return data;
    }

    public int getReads(){
        System.out.println("SSD reads count " + reads);
        return reads;
    }
}