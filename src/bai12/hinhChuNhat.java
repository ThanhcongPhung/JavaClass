package bai12;

public class hinhChuNhat extends hinhBH implements hinhBH.TinhToan {
    @Override
    public int dienTich() {
        return cDai * cRong;
    }
}
