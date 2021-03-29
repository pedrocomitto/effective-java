package item._11;

public class BrokenHashCode {

    private final int areaCode, prefix, lineNum;

    public BrokenHashCode(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenHashCode pn = (BrokenHashCode) o;
        return prefix == pn.areaCode && lineNum == pn.prefix && areaCode == pn.lineNum; // wrong
    }

    // hashCode() not overridden

}
