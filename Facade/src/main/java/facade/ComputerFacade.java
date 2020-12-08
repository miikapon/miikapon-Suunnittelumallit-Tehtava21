package facade;

public class ComputerFacade {

    private CPU cpu_;
    private Memory memory_;
    private HardDrive hard_drive_;

    private static final int kBootAddress = 10;
    private static final int kBootSector = 8;
    private static final int kSectorSize = 6;

    public ComputerFacade() {
        this.cpu_ = new CPU();
        this.memory_ = new Memory();
        this.hard_drive_ = new HardDrive();
    }

    public void Start() {
        cpu_.Freeze();
        memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
        cpu_.Jump(kBootAddress);
        cpu_.Execute();
    }

}
