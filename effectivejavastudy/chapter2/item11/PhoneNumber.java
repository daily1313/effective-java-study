package effectivejavastudy.chapter2.item11;

//        1. Object.hash()
//        return Objects.hash(areaCode, prefix, lineNum);
//
//        2. If delay initialization is not considered
//        int result = Short.hashCode(areaCode);
//        result = 31 * result + Short.hashCode(prefix);
//        result = 31 * result + Short.hashCode(lineNum);
//        return result;

public class PhoneNumber {

    private final short areaCode, prefix, lineNum;
    private int hashCode;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNum = (short) lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) o;

        return areaCode == pn.areaCode && prefix == pn.prefix && lineNum == pn.lineNum;
    }

    @Override
    public int hashCode() {
        // 3. If delay initialization is considered (Caching, Thread Stability)
        int result = hashCode;
        if(result == 0) {
            result = Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }
}
