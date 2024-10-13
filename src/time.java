public class time {

    public static void sleep(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void enter(){

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
