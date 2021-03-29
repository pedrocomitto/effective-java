package item._10;

import java.util.Objects;

public final class PerfectEquals {

    private final int areaCode, prefix, lineNum;

    public PerfectEquals(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PerfectEquals pn = (PerfectEquals) o;
        return areaCode == pn.areaCode && prefix == pn.prefix && lineNum == pn.lineNum;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(areaCode, prefix, lineNum);
//    }
}
