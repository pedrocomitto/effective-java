package item._10;

import java.util.Objects;

public class BrokenEquals {

    private final int areaCode, prefix, lineNum;

    public BrokenEquals(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenEquals pn = (BrokenEquals) o;
        return prefix == pn.areaCode && lineNum == pn.prefix && areaCode == pn.lineNum; // wrong
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }
    
}
