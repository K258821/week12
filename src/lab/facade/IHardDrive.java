package lab.facade;

interface IHardDrive {
    byte[] read(long lba, int size);
    int getReads();
}