public class UseIt {

    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("ping"));
    }

    static boolean isNullOrEmpty(String ping) {
        return OtherStringUtil.isNullOrEmpty(ping);
    }
}
