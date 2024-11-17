public class UseIt {

    public static void main(String[] args) {
        isNullOrEmpty("ping");
    }

    static boolean isNullOrEmpty(String ping) {
        return OtherStringUtil.isNullOrEmpty(ping);
    }
}
