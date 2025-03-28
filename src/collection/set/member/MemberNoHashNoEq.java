package collection.set.member;

/**
 * HashCode랑 equals 를 쓰지 않고 Object 가 제공하는 기능을 사용합니다.
 */
public class MemberNoHashNoEq {

    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}


